package actividadtiendainsumos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setTitle("Insumos tecnológicos");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnInforme = new javax.swing.JButton();
        btn_generar_ventas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setBackground(new java.awt.Color(0, 153, 153));
        btnMenu.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnMenu.setText("Gestionar Productos");
        btnMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 170, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comunicacion (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto-tecnologico (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel4.setText("TIENDA DE INSUMOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 490, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel6.setText("TECNOLÓGICOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 80));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sensible.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        btnInforme.setBackground(new java.awt.Color(0, 153, 153));
        btnInforme.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnInforme.setText("Generar Reportes");
        btnInforme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });
        jPanel1.add(btnInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 170, 40));

        btn_generar_ventas.setBackground(new java.awt.Color(0, 153, 153));
        btn_generar_ventas.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btn_generar_ventas.setText("Generar Ventas");
        btn_generar_ventas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_generar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_ventasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generar_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 40));

        btnInventario.setBackground(new java.awt.Color(0, 153, 153));
        btnInventario.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnInventario.setText("Visualizar Inventario");
        btnInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 200, 40));

        btnProveedor.setBackground(new java.awt.Color(0, 153, 153));
        btnProveedor.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnProveedor.setText("Gestionar Proveedores");
        btnProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 180, 40));

        btnVolver.setBackground(new java.awt.Color(153, 102, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setText("¡¡Bienvenidos a la tienda de insumos tecnologicos!!  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 480, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setText("Si desea agregar, ver productos, agregar proveedores ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 470, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("o ver otras opciones.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Solo seleccione la opción requerida:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comunicacion (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Main oMain = null;
        try {
            oMain = new Main();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oMain.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        GestionProveedores oGestionProveedores = null;
        try {
            oGestionProveedores = new GestionProveedores();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oGestionProveedores.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        GestionInventario oGestionInventario = null;
        try {
            oGestionInventario = new GestionInventario();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oGestionInventario.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        GestionReportes oReporte = null;
        try {
            oReporte = new GestionReportes();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oReporte.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_btnInformeActionPerformed

    private void btn_generar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_ventasActionPerformed
        ComprarProducto oComprar = null;
        try {
            oComprar = new ComprarProducto();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oComprar.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_generar_ventasActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Login oLogin = null;
        try {
            oLogin = new Login();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oLogin.setVisible(true);

        this.dispose();


    }//GEN-LAST:event_btnVolverActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btn_generar_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
