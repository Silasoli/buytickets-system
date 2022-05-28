package users.view;

import javax.swing.JOptionPane;
import users.controller.UserController;
import users.users.User;

/**
 *
 * @author silas
 */
public class LoginJDialog extends javax.swing.JDialog {

    public User userInSession;

    /**
     *
     * @param parent
     */
    public LoginJDialog(java.awt.Window parent) {
        super(parent);
        initComponents();

        setModal(true);
        setLocationRelativeTo(parent);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginjButton = new javax.swing.JButton();
        toCreateUserjButton = new javax.swing.JButton();
        closeProgramjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Nome:");

        nameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 80)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BuyTickets");

        loginjButton.setText("Entrar");
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });

        toCreateUserjButton.setText("Cadastrar");
        toCreateUserjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCreateUserjButtonActionPerformed(evt);
            }
        });

        closeProgramjButton.setText("Fechar Programa");
        closeProgramjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProgramjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(438, 438, 438)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 341, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeProgramjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toCreateUserjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toCreateUserjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProgramjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void nameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameUserActionPerformed

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        try {
            userInSession = UserController.getInstance().login(nameUser.getText(), passwordUser.getText());
            setVisible(false);

            HomeJDialog homeJDialog = new HomeJDialog(null, userInSession);
            homeJDialog.setVisible(true);

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_loginjButtonActionPerformed

    private void toCreateUserjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCreateUserjButtonActionPerformed
        setVisible(false);
        CreateUserJDialog createUserJDialog = new CreateUserJDialog(null);
        createUserJDialog.setVisible(true);
        createUserJDialog.dispose();

        createUserJDialog = null;        // TODO add your handling code here:
    }//GEN-LAST:event_toCreateUserjButtonActionPerformed

    private void closeProgramjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProgramjButtonActionPerformed
      System.exit(0);
    }//GEN-LAST:event_closeProgramjButtonActionPerformed

    public static void main(String arg[]) {
        LoginJDialog loginJDialog = new LoginJDialog(null);
        loginJDialog.setVisible(true);
        loginJDialog.dispose();

        loginJDialog = null;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeProgramjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginjButton;
    private javax.swing.JTextField nameUser;
    private javax.swing.JTextField passwordUser;
    private javax.swing.JButton toCreateUserjButton;
    // End of variables declaration//GEN-END:variables
}
