/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        //btnBancos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnBancos = new javax.swing.JPanel();
        jlblBancosIco = new javax.swing.JLabel();
        jlblBancos = new javax.swing.JLabel();
        btnSimulador = new javax.swing.JPanel();
        jlblSimuladorIco = new javax.swing.JLabel();
        jlblSimulador = new javax.swing.JLabel();
        btnAsesores = new javax.swing.JPanel();
        jlblAsesoresIco = new javax.swing.JLabel();
        jlblAsesores = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jlblLoginIco = new javax.swing.JLabel();
        jlblLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblTitulo = new javax.swing.JLabel();
        jlblTituloIco = new javax.swing.JLabel();
        sideInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtDinero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtTiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBancos.setBackground(new java.awt.Color(64, 43, 100));
        btnBancos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBancosMousePressed(evt);
            }
        });

        jlblBancosIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jlblBancosIco.setAlignmentX(0.5F);
        jlblBancosIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblBancos.setBackground(new java.awt.Color(255, 255, 255));
        jlblBancos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblBancos.setForeground(new java.awt.Color(255, 255, 255));
        jlblBancos.setText("Bancos");

        javax.swing.GroupLayout btnBancosLayout = new javax.swing.GroupLayout(btnBancos);
        btnBancos.setLayout(btnBancosLayout);
        btnBancosLayout.setHorizontalGroup(
            btnBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBancosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblBancosIco)
                .addGap(47, 47, 47)
                .addComponent(jlblBancos)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        btnBancosLayout.setVerticalGroup(
            btnBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBancosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblBancosIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblBancos))
                .addContainerGap())
        );

        sidePanel.add(btnBancos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 350, 90));

        btnSimulador.setBackground(new java.awt.Color(85, 55, 118));
        btnSimulador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSimuladorMousePressed(evt);
            }
        });

        jlblSimuladorIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        jlblSimuladorIco.setAlignmentX(0.5F);
        jlblSimuladorIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblSimulador.setBackground(new java.awt.Color(255, 255, 255));
        jlblSimulador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblSimulador.setForeground(new java.awt.Color(255, 255, 255));
        jlblSimulador.setText("Simulador");

        javax.swing.GroupLayout btnSimuladorLayout = new javax.swing.GroupLayout(btnSimulador);
        btnSimulador.setLayout(btnSimuladorLayout);
        btnSimuladorLayout.setHorizontalGroup(
            btnSimuladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimuladorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblSimuladorIco)
                .addGap(47, 47, 47)
                .addComponent(jlblSimulador)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        btnSimuladorLayout.setVerticalGroup(
            btnSimuladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimuladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSimuladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblSimuladorIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblSimulador))
                .addContainerGap())
        );

        sidePanel.add(btnSimulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 90));

        btnAsesores.setBackground(new java.awt.Color(64, 43, 100));
        btnAsesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAsesoresMousePressed(evt);
            }
        });

        jlblAsesoresIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jlblAsesoresIco.setAlignmentX(0.5F);
        jlblAsesoresIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblAsesores.setBackground(new java.awt.Color(255, 255, 255));
        jlblAsesores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblAsesores.setForeground(new java.awt.Color(255, 255, 255));
        jlblAsesores.setText("Asesores");

        javax.swing.GroupLayout btnAsesoresLayout = new javax.swing.GroupLayout(btnAsesores);
        btnAsesores.setLayout(btnAsesoresLayout);
        btnAsesoresLayout.setHorizontalGroup(
            btnAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAsesoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblAsesoresIco)
                .addGap(47, 47, 47)
                .addComponent(jlblAsesores)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        btnAsesoresLayout.setVerticalGroup(
            btnAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAsesoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAsesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblAsesoresIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblAsesores))
                .addContainerGap())
        );

        sidePanel.add(btnAsesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 350, -1));

        btnLogin.setBackground(new java.awt.Color(64, 43, 100));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        jlblLoginIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jlblLoginIco.setAlignmentX(0.5F);
        jlblLoginIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblLogin.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblLogin.setText("Ingresar");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLoginIco)
                .addGap(47, 47, 47)
                .addComponent(jlblLogin)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblLoginIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblLogin))
                .addContainerGap())
        );

        sidePanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 350, -1));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));

        jlblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setText("Simulador");

        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        jlblTituloIco.setAlignmentX(0.5F);
        jlblTituloIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlblTituloIco)
                .addGap(43, 43, 43)
                .addComponent(jlblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblTituloIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTitulo))
                .addGap(24, 24, 24))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Monto de dinero que necesita : ");

        jtxtDinero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDineroKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("¿En cuanto tiempo quiere pagarlo?");

        jtxtTiempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTiempoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("¿Qué tipo de Crédito esta buscando?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout sideInfoLayout = new javax.swing.GroupLayout(sideInfo);
        sideInfo.setLayout(sideInfoLayout);
        sideInfoLayout.setHorizontalGroup(
            sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideInfoLayout.createSequentialGroup()
                        .addGroup(sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtDinero)
                            .addComponent(jtxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(361, 361, 361)
                        .addGroup(sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sideInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(276, 276, 276))
                            .addGroup(sideInfoLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        sideInfoLayout.setVerticalGroup(
            sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sideInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jtxtDinero, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sideInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sideInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimuladorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimuladorMousePressed
        setColor(btnSimulador);
        resetColor(btnAsesores);
        resetColor(btnBancos);
        resetColor(btnLogin);
        jlblTitulo.setText("Simulador");
        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png")));
    }//GEN-LAST:event_btnSimuladorMousePressed

    private void btnBancosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBancosMousePressed
        setColor(btnBancos);
        resetColor(btnAsesores);
        resetColor(btnSimulador);
        resetColor(btnLogin);
        jlblTitulo.setText("Banco");
        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png")));
    }//GEN-LAST:event_btnBancosMousePressed

    private void btnAsesoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsesoresMousePressed
        setColor(btnAsesores);
        resetColor(btnBancos);
        resetColor(btnSimulador);
        resetColor(btnLogin);
        jlblTitulo.setText("Asesores");
        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png")));
    }//GEN-LAST:event_btnAsesoresMousePressed

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        setColor(btnLogin);
        resetColor(btnBancos);
        resetColor(btnSimulador);
        resetColor(btnAsesores);
        jlblTitulo.setText("Simulador");
        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png")));

        loginInterface login = new loginInterface();
        login.setVisible(true);
    }//GEN-LAST:event_btnLoginMousePressed

    private void jtxtDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDineroKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtxtDinero.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDineroKeyTyped

    private void jtxtTiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTiempoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtxtTiempo.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtTiempoKeyTyped

    void setColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(64, 43, 100));
    }

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnAsesores;
    private javax.swing.JPanel btnBancos;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnSimulador;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblAsesores;
    private javax.swing.JLabel jlblAsesoresIco;
    private javax.swing.JLabel jlblBancos;
    private javax.swing.JLabel jlblBancosIco;
    private javax.swing.JLabel jlblLogin;
    private javax.swing.JLabel jlblLoginIco;
    private javax.swing.JLabel jlblSimulador;
    private javax.swing.JLabel jlblSimuladorIco;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTituloIco;
    private javax.swing.JTextField jtxtDinero;
    private javax.swing.JTextField jtxtTiempo;
    private javax.swing.JPanel sideInfo;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
