
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author jeremyduncan
 */
public class BurgersGUI extends javax.swing.JFrame {

    // class level references and attributes
    private double orderTotal;

    /**
     * Creates new form BurgersGUI
     */
    public BurgersGUI() {
        initComponents();

        // set to center of screen
        this.setLocationRelativeTo(null);
        orderTotal = 0.0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBurgers = new javax.swing.ButtonGroup();
        rdoDouble = new javax.swing.JRadioButton();
        rdoSingle = new javax.swing.JRadioButton();
        chkBacon = new javax.swing.JCheckBox();
        chkCheese = new javax.swing.JCheckBox();
        chkMeal = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jmbMainMenu = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mniAddToOrder = new javax.swing.JMenuItem();
        mniClear = new javax.swing.JMenuItem();
        mniNewOrder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burger Barn");

        btgBurgers.add(rdoDouble);
        rdoDouble.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        rdoDouble.setText("Double Burger");
        rdoDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDoubleActionPerformed(evt);
            }
        });

        btgBurgers.add(rdoSingle);
        rdoSingle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        rdoSingle.setText("Single Burger");
        rdoSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSingleActionPerformed(evt);
            }
        });

        chkBacon.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        chkBacon.setText("Add Bacon");
        chkBacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBaconActionPerformed(evt);
            }
        });

        chkCheese.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        chkCheese.setText("Add Cheese");
        chkCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCheeseActionPerformed(evt);
            }
        });

        chkMeal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        chkMeal.setText("Make It A Meal");
        chkMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMealActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setText("Your Order");

        txtReceipt.setColumns(20);
        txtReceipt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtReceipt.setRows(5);
        jScrollPane1.setViewportView(txtReceipt);

        lblPrice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblPrice.setText("Item Price");

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPrice.setText("0");

        lblQty.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblQty.setText("Quantity");

        txtQty.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtQty.setText("1");
        txtQty.setToolTipText("");

        lblTotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTotal.setText("Order Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtTotal.setText("1");

        mnuFile.setText("File");

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuFile.add(mniExit);

        jmbMainMenu.add(mnuFile);

        mnuOrder.setText("Order");

        mniAddToOrder.setText("Add to Order");
        mniAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddToOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mniAddToOrder);

        mniClear.setText("Clear for next Item");
        mniClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClearActionPerformed(evt);
            }
        });
        mnuOrder.add(mniClear);

        mniNewOrder.setText("New Order");
        mniNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mniNewOrder);

        jmbMainMenu.add(mnuOrder);

        setJMenuBar(jmbMainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(287, 287, 287))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoDouble)
                    .addComponent(chkMeal)
                    .addComponent(chkBacon)
                    .addComponent(chkCheese)
                    .addComponent(rdoSingle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoSingle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoDouble)
                        .addGap(48, 48, 48)
                        .addComponent(chkCheese)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkBacon))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(chkMeal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPrice)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQty))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal))))))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // close the application
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void rdoSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSingleActionPerformed
        // Call update price method
        updateItemPrice();
    }//GEN-LAST:event_rdoSingleActionPerformed

    private void rdoDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDoubleActionPerformed
        // Call update price method
        updateItemPrice();
    }//GEN-LAST:event_rdoDoubleActionPerformed

    private void chkCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCheeseActionPerformed
        // Call update price method
        updateItemPrice();
    }//GEN-LAST:event_chkCheeseActionPerformed

    private void chkBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBaconActionPerformed
        // Call update price method
        updateItemPrice();
    }//GEN-LAST:event_chkBaconActionPerformed

    private void chkMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMealActionPerformed
        // Call update price method
        updateItemPrice();
    }//GEN-LAST:event_chkMealActionPerformed

    private void mniAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddToOrderActionPerformed
        // Build the output line
        String outputLine = txtQty.getText();
        if (rdoSingle.isSelected()) {
            outputLine += " Single";
        } else if (rdoDouble.isSelected()) {
            outputLine += " Double";
        }

        if (chkCheese.isSelected()) {
            outputLine += ", Cheese";
        }
        if (chkBacon.isSelected()) {
            outputLine += ", Bacon";
        }
        if (chkMeal.isSelected()) {
            outputLine += ", Meal";
        }
        
        outputLine += " at ";
        outputLine += txtPrice.getText();
        outputLine += " Each";
        outputLine += "\n";
        
        txtReceipt.append(outputLine);
        
        // Update the order total
        int quantity = Integer.parseInt(txtQty.getText());
        double itemPrice = Double.parseDouble(txtPrice.getText());
        double linePrice = quantity * itemPrice;
        
        orderTotal += linePrice;
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        txtTotal.setText(fmt.format(orderTotal));

    }//GEN-LAST:event_mniAddToOrderActionPerformed

    private void mniClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClearActionPerformed
        clearItems();
    }//GEN-LAST:event_mniClearActionPerformed

    private void mniNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewOrderActionPerformed
        clearItems();
        txtReceipt.setText("");
        txtTotal.setText("0.0");
        
    }//GEN-LAST:event_mniNewOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BurgersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BurgersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BurgersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BurgersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BurgersGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBurgers;
    private javax.swing.JCheckBox chkBacon;
    private javax.swing.JCheckBox chkCheese;
    private javax.swing.JCheckBox chkMeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar jmbMainMenu;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem mniAddToOrder;
    private javax.swing.JMenuItem mniClear;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniNewOrder;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JRadioButton rdoDouble;
    private javax.swing.JRadioButton rdoSingle;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextArea txtReceipt;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void updateItemPrice() {

        double itemPrice = 0;

        //get burger size
        if (rdoSingle.isSelected()) {
            itemPrice = 3.50;
        } else if (rdoDouble.isSelected()) {
            itemPrice = 4.75;
        } else {
            JOptionPane.showMessageDialog(this, "Burger type must be selected.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // add charges for options
        if (chkCheese.isSelected()) {
            itemPrice += 0.50;
        }
        if (chkBacon.isSelected()) {
            itemPrice += 1.25;
        }
        if (chkMeal.isSelected()) {
            itemPrice += 4.00;
        }

        // show item price
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        txtPrice.setText(fmt.format(itemPrice));
    }

    private void clearItems() {
        // clear the selections
        btgBurgers.clearSelection();
        chkCheese.setSelected(false);
        chkBacon.setSelected(false);
        chkMeal.setSelected(false);
        txtPrice.setText("0");
        txtQty.setText("1");
    }
}
