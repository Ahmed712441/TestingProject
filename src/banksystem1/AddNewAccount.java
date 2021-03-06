
package banksystem1;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddNewAccount extends javax.swing.JDialog {

    private Account account;

    public AddNewAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setSize(463, 200);
        account=null;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        NameLbl = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        BalanceLbl = new javax.swing.JLabel();
        BalanceTxt = new javax.swing.JTextField();
        PassLbl = new javax.swing.JLabel();
        PassTxt = new javax.swing.JPasswordField();
        AccountTypeLbl = new javax.swing.JLabel();
        AccTypeTxt = new javax.swing.JComboBox<>();
        createNewBtn = new javax.swing.JButton();
        CancelNewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Account");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${size.size}"), this, org.jdesktop.beansbinding.BeanProperty.create("size"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new java.awt.GridLayout(5, 2, 5, 5));

        NameLbl.setText("Name");
        getContentPane().add(NameLbl);
        getContentPane().add(NameTxt);

        BalanceLbl.setText("Balance:");
        getContentPane().add(BalanceLbl);
        getContentPane().add(BalanceTxt);

        PassLbl.setText("Password:");
        getContentPane().add(PassLbl);

        PassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTxtActionPerformed(evt);
            }
        });
        getContentPane().add(PassTxt);

        AccountTypeLbl.setText("Account Type:");
        getContentPane().add(AccountTypeLbl);

        AccTypeTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "VIP" }));
        AccTypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccTypeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(AccTypeTxt);

        createNewBtn.setText("Create");
        createNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(createNewBtn);

        CancelNewBtn.setText("Cancel");
        CancelNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelNewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelNewBtn);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccTypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccTypeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccTypeTxtActionPerformed

    private void CancelNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelNewBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelNewBtnActionPerformed

    private void createNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewBtnActionPerformed
        // TODO add your handling code here:
        
        String Name,UserName,Pass,AccType;
        double Balance,test;
        if(NameTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Name cannot be empty", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            Name=NameTxt.getText();
        }
        
        if(BalanceTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Balance cannot be empty", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // lazem 2t2ked enha m4 string 34an m4 hy3rf y7wlha

        else
        {
            try
            {
                test=Double.parseDouble(BalanceTxt.getText());
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Balance must be a number", "ERROR!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        }
        
        if(Double.parseDouble(BalanceTxt.getText())<=0)
        {
            JOptionPane.showMessageDialog(this, "Balance cannot equal to 0 or negative value", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(PassTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Pass cannot be empty", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            Pass=PassTxt.getText();
        }
        
        
        Balance=Double.parseDouble(BalanceTxt.getText());
        AccType= (String)AccTypeTxt.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Name: "+ Name+"\nBalance: "+ Balance+"\nAccount Type: "+ AccType);
        
        try {
            account = new Account(Name,Pass,Balance,AccType);
            

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       this.dispose();
    }//GEN-LAST:event_createNewBtnActionPerformed

    private void PassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewAccount dialog = new AddNewAccount(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccTypeTxt;
    private javax.swing.JLabel AccountTypeLbl;
    private javax.swing.JLabel BalanceLbl;
    private javax.swing.JTextField BalanceTxt;
    private javax.swing.JButton CancelNewBtn;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JLabel PassLbl;
    private javax.swing.JPasswordField PassTxt;
    private javax.swing.JButton createNewBtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
Account getAccount()
{
    return account;
}

}
