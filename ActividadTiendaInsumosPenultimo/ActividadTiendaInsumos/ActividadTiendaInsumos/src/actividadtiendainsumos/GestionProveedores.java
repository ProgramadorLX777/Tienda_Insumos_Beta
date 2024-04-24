package actividadtiendainsumos;

import bd.Conexion;
import bd.DAOProveedor;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Proveedor;

public class GestionProveedores extends javax.swing.JFrame {

    DefaultTableModel oModelProveedor = new DefaultTableModel();

    public GestionProveedores() throws Exception {
        initComponents();
        this.setTitle("Proveedores Insumos tecnologicos");

        oModelProveedor.addColumn("Id proveedor");
        oModelProveedor.addColumn("Id prodAsociado");
        oModelProveedor.addColumn("Nombre");
        oModelProveedor.addColumn("Direccion");
        oModelProveedor.addColumn("Fono");
        oModelProveedor.addColumn("Correo");
        tb_registrar_proveedor.setModel(oModelProveedor);
        tb_actualizar_proveedor.setModel(oModelProveedor);
        tb_eliminar_proveedor.setModel(oModelProveedor);
        cargarTablasProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreoProveedor = new javax.swing.JTextField();
        txtFonoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        btnNuevoProveedor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_registrar_proveedor = new javax.swing.JTable();
        btn_volver_menu3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_volver_menu2 = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_actualizar_proveedor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtActualizarCorreoProveedor = new javax.swing.JTextField();
        txtActualizarFonoProveedor = new javax.swing.JTextField();
        txtActualizarDireccionProveedor = new javax.swing.JTextField();
        txtActualizarNombreProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtActualizarIdProveedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUpdateIdProducto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jblProductoEliminar = new javax.swing.JLabel();
        txtEliminarProveedor = new javax.swing.JTextField();
        btnEliminarProveedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_eliminar_proveedor = new javax.swing.JTable();
        btn_volver_menu4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre proveedor:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Dirección Proveedor:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Número de teléfono:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Correo electronico:");

        txtCorreoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreoProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreoProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtFonoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFonoProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFonoProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtDireccionProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccionProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccionProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnNuevoProveedor.setBackground(new java.awt.Color(204, 102, 0));
        btnNuevoProveedor.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnNuevoProveedor.setText("Agregar Nuevo Proveedor");
        btnNuevoProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        tb_registrar_proveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tb_registrar_proveedor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tb_registrar_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_registrar_proveedor.setShowGrid(true);
        jScrollPane4.setViewportView(tb_registrar_proveedor);

        btn_volver_menu3.setBackground(new java.awt.Color(204, 102, 0));
        btn_volver_menu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_volver_menu3.setText("Volver al menú");
        btn_volver_menu3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_volver_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_menu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_volver_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFonoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(46, 46, 46)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Proveedor", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        btn_volver_menu2.setBackground(new java.awt.Color(204, 102, 0));
        btn_volver_menu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_volver_menu2.setText("Volver al menú");
        btn_volver_menu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_volver_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_menu2ActionPerformed(evt);
            }
        });

        btnActualizarProveedor.setBackground(new java.awt.Color(204, 102, 0));
        btnActualizarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizarProveedor.setText("Actualizar proveedor");
        btnActualizarProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedorActionPerformed(evt);
            }
        });

        tb_actualizar_proveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tb_actualizar_proveedor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tb_actualizar_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_actualizar_proveedor.setShowGrid(true);
        jScrollPane6.setViewportView(tb_actualizar_proveedor);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Nuevo nombre proveedor:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nueva dirección proveedor:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Nuevo número de teléfono:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Nuevo correo electrónico:");

        txtActualizarCorreoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtActualizarCorreoProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActualizarCorreoProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtActualizarFonoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtActualizarFonoProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActualizarFonoProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtActualizarDireccionProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtActualizarDireccionProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActualizarDireccionProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtActualizarNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtActualizarNombreProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActualizarNombreProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nuevo ID producto:");

        txtActualizarIdProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtActualizarIdProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActualizarIdProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Nuevo ID proveedor:");

        txtUpdateIdProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUpdateIdProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUpdateIdProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualizarFonoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtActualizarCorreoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)
                                .addComponent(txtActualizarDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtActualizarIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUpdateIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtActualizarNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtActualizarIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUpdateIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtActualizarNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtActualizarDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtActualizarFonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtActualizarCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
        );

        jTabbedPane1.addTab("Modificar Proveedor", jPanel2);

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));

        jblProductoEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblProductoEliminar.setText("Ingrese id proveedor:");

        txtEliminarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEliminarProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEliminarProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnEliminarProveedor.setBackground(new java.awt.Color(204, 102, 0));
        btnEliminarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarProveedor.setText("Eliminar Proveedor");
        btnEliminarProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        tb_eliminar_proveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tb_eliminar_proveedor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tb_eliminar_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_eliminar_proveedor.setShowGrid(true);
        jScrollPane5.setViewportView(tb_eliminar_proveedor);

        btn_volver_menu4.setBackground(new java.awt.Color(204, 102, 0));
        btn_volver_menu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_volver_menu4.setText("Volver al menú");
        btn_volver_menu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_volver_menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_menu4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jblProductoEliminar)
                        .addGap(27, 27, 27)
                        .addComponent(txtEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_volver_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblProductoEliminar)
                    .addComponent(txtEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Proveedor", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
      try {
           Conexion oConexion=new Conexion ("localhost", "insumos_tecnologicos", "root", "");    
            DAOProveedor oDAOProveedor = new DAOProveedor();
            
            oDAOProveedor.borrarProveedor(Integer.parseInt(txtEliminarProveedor.getText()));
            JOptionPane.showMessageDialog(this, "Borrado Correctamente");
            
            txtEliminarProveedor.setText("");
            cargarTablasProveedor();
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
           Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btn_volver_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_menu2ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);
    
    this.dispose();
    }//GEN-LAST:event_btn_volver_menu2ActionPerformed

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed
          try {
            Conexion oConexion=new Conexion ("localhost", "insumos_tecnologicos", "root", "");
            DAOProveedor oDAOProveedor = new DAOProveedor();
            oDAOProveedor.UpdateProveedor(Integer.parseInt(txtActualizarIdProveedor.getText()),Integer.parseInt(txtUpdateIdProducto.getText()),txtActualizarNombreProveedor.getText(),txtActualizarDireccionProveedor.getText(),txtActualizarFonoProveedor.getText(), txtActualizarCorreoProveedor.getText());
            JOptionPane.showMessageDialog(this, "Actualizado Correctamente");
            
            txtActualizarIdProveedor.setText("");
            txtUpdateIdProducto.setText("");
            txtActualizarNombreProveedor.setText("");
            txtActualizarDireccionProveedor.setText("");
            txtActualizarFonoProveedor.setText("");
            txtActualizarCorreoProveedor.setText("");
            cargarTablasProveedor();
        } catch (SQLException ex) {
          Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
           Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        try {
            Conexion oConexion = new Conexion("localhost", "insumos_tecnologicos", "root", "");    
            DAOProveedor oDAOProveedor = new DAOProveedor();
            
            Proveedor oProveedor = new Proveedor();
            oProveedor.setNombre(txtNombreProveedor.getText());
            oProveedor.setDireccion(txtDireccionProveedor.getText());
            oProveedor.setFono(txtFonoProveedor.getText());
            oProveedor.setCorreo(txtCorreoProveedor.getText());
            oDAOProveedor.crearProveedor(oProveedor);
            txtNombreProveedor.setText("");
            txtDireccionProveedor.setText("");
            txtFonoProveedor.setText("");
            txtCorreoProveedor.setText("");
            JOptionPane.showMessageDialog(this, "Registrado con éxito!");
            

            cargarTablasProveedor();
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btn_volver_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_menu3ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btn_volver_menu3ActionPerformed

    private void btn_volver_menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_menu4ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btn_volver_menu4ActionPerformed

    private void cargarTablasProveedor() throws Exception {
        try {
            Conexion oConexion = new Conexion("localhost", "insumos_tecnologicos", "root", "");
            DAOProveedor oDAOProveedor = new DAOProveedor();

            String[] fila = new String[7];
            oModelProveedor.setRowCount(0);

            for (Proveedor proveedor : oDAOProveedor.getProveedor()) {
                fila[0] = "" + proveedor.getIdProveedor();
                fila[1] = "" + proveedor.getIdProducto();
                fila[2] = "" + proveedor.getNombre();
                fila[3] = "" + proveedor.getDireccion();
                fila[4] = "" + proveedor.getFono();
                fila[5] = "" + proveedor.getCorreo();

                oModelProveedor.addRow(fila);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestionProveedores().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btn_volver_menu2;
    private javax.swing.JButton btn_volver_menu3;
    private javax.swing.JButton btn_volver_menu4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jblProductoEliminar;
    private javax.swing.JTable tb_actualizar_proveedor;
    private javax.swing.JTable tb_eliminar_proveedor;
    private javax.swing.JTable tb_registrar_proveedor;
    private javax.swing.JTextField txtActualizarCorreoProveedor;
    private javax.swing.JTextField txtActualizarDireccionProveedor;
    private javax.swing.JTextField txtActualizarFonoProveedor;
    private javax.swing.JTextField txtActualizarIdProveedor;
    private javax.swing.JTextField txtActualizarNombreProveedor;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtEliminarProveedor;
    private javax.swing.JTextField txtFonoProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtUpdateIdProducto;
    // End of variables declaration//GEN-END:variables



}
