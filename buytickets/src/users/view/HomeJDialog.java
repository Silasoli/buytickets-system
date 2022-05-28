package users.view;

import java.util.List;
import javax.swing.JOptionPane;
import sales.controller.SaleController;
import sales.sales.Sale;
import users.controller.UserController;
import users.users.User;

/**
 *
 * @author silas
 */
public class HomeJDialog extends javax.swing.JDialog {

    private SaleTableModel saleTableModel;

    public User userInSession;

    /**
     *
     * @param parent
     */
    public HomeJDialog(java.awt.Window parent, User user) {
        super(parent);
        initComponents();
        init();
        setUserInScreen(user);
        fillOfferTable();
        setModal(true);
        setLocationRelativeTo(parent);
    }

    public void init() {
        saleTableModel = new SaleTableModel();
        jTable.setModel(saleTableModel);
    }

    public void setUserInScreen(User user) {
        try {
            userInSession = UserController.getInstance().findOne(user.getUserId());
            userNamejLabel.setText(userInSession.getName());
            userTicketBalancejLabel.setText("R$ " + String.valueOf(userInSession.getTicketBalance()));
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Falha ao comprar");
        }
    }

    public Sale getSaleSelected() throws Exception {
        int line = jTable.getSelectedRow();
        if (line == -1) {
            throw new Exception("Selecione um item na tabela");
        }
        return saleTableModel.get(line);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userTicketBalancejLabel = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();
        logOutjButton = new javax.swing.JButton();
        closeProgramjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        listSalesjButton = new javax.swing.JButton();
        buyjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Saldo:");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Perfil");

        userTicketBalancejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTicketBalancejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userTicketBalancejLabel.setText("jLabel5");
        userTicketBalancejLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        userNamejLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNamejLabel.setText("jLabel5");
        userNamejLabel.setAutoscrolls(true);
        userNamejLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        logOutjButton.setBackground(new java.awt.Color(255, 255, 255));
        logOutjButton.setText("Encerrar sessão");
        logOutjButton.setFocusPainted(false);
        logOutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutjButtonActionPerformed(evt);
            }
        });

        closeProgramjButton.setBackground(new java.awt.Color(255, 255, 255));
        closeProgramjButton.setText("Fechar Programa");
        closeProgramjButton.setFocusPainted(false);
        closeProgramjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProgramjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(userTicketBalancejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(closeProgramjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNamejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTicketBalancejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeProgramjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ofertas");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Saldo em Tickets", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        listSalesjButton.setBackground(new java.awt.Color(255, 255, 255));
        listSalesjButton.setText("Listar");
        listSalesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSalesjButtonActionPerformed(evt);
            }
        });

        buyjButton.setBackground(new java.awt.Color(255, 255, 255));
        buyjButton.setText("Comprar");
        buyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listSalesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(listSalesjButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buyjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listSalesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSalesjButtonActionPerformed
        fillOfferTable();
    }//GEN-LAST:event_listSalesjButtonActionPerformed

    private void closeProgramjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProgramjButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProgramjButtonActionPerformed

    private void logOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutjButtonActionPerformed
        userInSession = null;
        setVisible(false);

        LoginJDialog loginJDialog = new LoginJDialog(null);
        loginJDialog.setVisible(true);
        loginJDialog.dispose();
        loginJDialog = null;
    }//GEN-LAST:event_logOutjButtonActionPerformed

    private void buyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyjButtonActionPerformed
        try {
            Sale saleBeingMade = getSaleSelected();
            int response = JOptionPane.showConfirmDialog(this, "Deseja finalizar a compra?");
            if (response == JOptionPane.YES_OPTION) {
                SaleController.getInstance().remove(saleBeingMade.getSaleId());
                userInSession.setTicketBalance(userInSession.getTicketBalance()+saleBeingMade.getTicketValue());
                UserController.getInstance().update(userInSession);
                setUserInScreen(userInSession);
            }

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Falha ao comprar");

        }
        fillOfferTable();
    }//GEN-LAST:event_buyjButtonActionPerformed

    public void fillOfferTable() {
        try {

            List<Sale> list = SaleController.getInstance().findAll();

            saleTableModel.setList(list);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Banco de dados não conectado");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LoginJDialog homeJDialog = new LoginJDialog(null);
        homeJDialog.setVisible(true);
        homeJDialog.dispose();

        homeJDialog = null;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyjButton;
    private javax.swing.JButton closeProgramjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JButton listSalesjButton;
    private javax.swing.JButton logOutjButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JLabel userTicketBalancejLabel;
    // End of variables declaration//GEN-END:variables
}
