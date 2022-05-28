package users.view;

import javax.swing.JOptionPane;
import sales.controller.SaleController;
import users.controller.UserController;
import users.users.User;

/**
 *
 * @author silas
 */
public class CreateUserJDialog extends javax.swing.JDialog {

    public String name;
    public String password;
    private User user;

    /**
     *
     * @param parent
     */
    public CreateUserJDialog(java.awt.Window parent) {
        super(parent);
        initComponents();
        init();

        setModal(true);
        setLocationRelativeTo(parent);
    }

    private void init() {
        user = new User();
    }

    public User getUser() {
        user.setName(nameUser.getText());
        user.setPassword(passwordUser.getText());
        user.setType("buyer");

        return user;
    }

    public void redirectToLoginScreen() {
        setVisible(false);
        LoginJDialog loginJDialog = new LoginJDialog(null);
        loginJDialog.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        savejButton = new javax.swing.JButton();
        toLoginjButton = new javax.swing.JButton();
        closeProgramjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 80)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BuyTickets");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        nameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUserActionPerformed(evt);
            }
        });

        passwordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordUserActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha:");

        savejButton.setText("Cadastrar");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        toLoginjButton.setText("Logar");
        toLoginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLoginjButtonActionPerformed(evt);
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
                                .addGap(449, 449, 449)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(467, 467, 467)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(savejButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 320, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeProgramjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toLoginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(savejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLoginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProgramjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameUserActionPerformed

    private void passwordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordUserActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        try {
            User user = getUser();
            UserController.getInstance().create(user);
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
            redirectToLoginScreen();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private void toLoginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLoginjButtonActionPerformed
        redirectToLoginScreen();
    }//GEN-LAST:event_toLoginjButtonActionPerformed

    private void closeProgramjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProgramjButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProgramjButtonActionPerformed

    public static void main(String args[]) {
        SaleController.getInstance().createMockSales();

        CreateUserJDialog createUserJDialog = new CreateUserJDialog(null);
        createUserJDialog.setVisible(true);
        createUserJDialog.dispose();

        createUserJDialog = null;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeProgramjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameUser;
    private javax.swing.JTextField passwordUser;
    private javax.swing.JButton savejButton;
    private javax.swing.JButton toLoginjButton;
    // End of variables declaration//GEN-END:variables
}
