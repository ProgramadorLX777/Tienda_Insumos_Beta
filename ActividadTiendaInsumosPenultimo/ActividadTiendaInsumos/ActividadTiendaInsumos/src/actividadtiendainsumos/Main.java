package actividadtiendainsumos;

import bd.DAOProducto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Producto;
import bd.Conexion;


public class Main extends javax.swing.JFrame {

    DefaultTableModel oModel= new DefaultTableModel();
    
    public Main() throws Exception {
        initComponents(); 
        setLocationRelativeTo(null);
        
        this.setTitle("Insumos tecnologicos");
        
        oModel.addColumn("Id producto");
        oModel.addColumn("Nombre ");
        oModel.addColumn("Descripción");
        oModel.addColumn("Precio");
        oModel.addColumn("CantidadStock");
        oModel.addColumn("Categoria");
        tblRegistro.setModel(oModel);
        tblBuscar.setModel(oModel);
        tblActualizar.setModel(oModel);
        tblEliminar.setModel(oModel);
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jblNombre = new javax.swing.JLabel();
        jblDescripcion = new javax.swing.JLabel();
        jblPrecio = new javax.swing.JLabel();
        jblCantidad = new javax.swing.JLabel();
        jblCategoria = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblActualizar = new javax.swing.JTable();
        jblId = new javax.swing.JLabel();
        jblNombreNuevo = new javax.swing.JLabel();
        jblDescripcionNuevo = new javax.swing.JLabel();
        jblPrecioNuevo = new javax.swing.JLabel();
        jblCantidadNuevo = new javax.swing.JLabel();
        jblCategoriaNuevo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtDescripcionUpdate = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombreUpdate = new javax.swing.JTextField();
        txtPrecioUpdate = new javax.swing.JTextField();
        txtCategoriaUpdate = new javax.swing.JTextField();
        spnCantidadUpdate = new javax.swing.JSpinner();
        btnVolver2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jblProductoEliminar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtProductoEliminar = new javax.swing.JTextField();
        btnVolver3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEliminar = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 51, 0));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblRegistro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegistro.setShowGrid(true);
        jScrollPane2.setViewportView(tblRegistro);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jblNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblNombre.setText("Nombre:");

        jblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblDescripcion.setText("Descripción:");

        jblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblPrecio.setText("Precio:");

        jblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblCantidad.setText("Cantidad Stock:");

        jblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblCategoria.setText("Categoria:");

        btnGuardar.setBackground(new java.awt.Color(153, 51, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar Registro");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnCantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("$");

        btnVolver1.setBackground(new java.awt.Color(153, 51, 0));
        btnVolver1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver1.setText("Volver al menú");
        btnVolver1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblCategoria)
                                    .addComponent(jblDescripcion)
                                    .addComponent(jblNombre)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jblPrecio)
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel1)))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jblCantidad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(txtPrecio)
                            .addComponent(txtCategoria)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblDescripcion))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblPrecio)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCantidad)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCategoria)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblActualizar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tblActualizar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActualizar.setShowGrid(true);
        jScrollPane3.setViewportView(tblActualizar);

        jblId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblId.setText("Id:");

        jblNombreNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblNombreNuevo.setText("Nuevo Nombre:");

        jblDescripcionNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblDescripcionNuevo.setText("Nueva descripción:");

        jblPrecioNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblPrecioNuevo.setText("Nuevo precio:");

        jblCantidadNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblCantidadNuevo.setText("Nueva cantidad stock:");

        jblCategoriaNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblCategoriaNuevo.setText("Nueva categoría:");

        btnActualizar.setBackground(new java.awt.Color(0, 102, 153));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar Registro");
        btnActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtDescripcionUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripcionUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcionUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtNombreUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtPrecioUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecioUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtCategoriaUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoriaUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoriaUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        spnCantidadUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnCantidadUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnVolver2.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver2.setText("Volver al menú");
        btnVolver2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreNuevo)
                            .addComponent(jblDescripcionNuevo)
                            .addComponent(jblId)
                            .addComponent(jblPrecioNuevo)
                            .addComponent(jblCantidadNuevo)
                            .addComponent(jblCategoriaNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnCantidadUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(txtDescripcionUpdate)
                            .addComponent(txtNombreUpdate)
                            .addComponent(txtId)
                            .addComponent(txtCategoriaUpdate)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNombreNuevo)
                            .addComponent(txtNombreUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblDescripcionNuevo)
                            .addComponent(txtDescripcionUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblPrecioNuevo)
                            .addComponent(txtPrecioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCantidadNuevo)
                            .addComponent(spnCantidadUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCategoriaNuevo)
                            .addComponent(txtCategoriaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar", jPanel2);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jblProductoEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblProductoEliminar.setText("Ingrese id de producto:");

        btnEliminar.setBackground(new java.awt.Color(204, 102, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtProductoEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtProductoEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProductoEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnVolver3.setBackground(new java.awt.Color(204, 102, 0));
        btnVolver3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver3.setText("Volver al menú");
        btnVolver3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jblProductoEliminar)
                        .addGap(29, 29, 29)
                        .addComponent(txtProductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblProductoEliminar)
                    .addComponent(txtProductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblEliminar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tblEliminar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEliminar.setShowGrid(true);
        jScrollPane1.setViewportView(tblEliminar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(638, 638, 638))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(153, 51, 0));

        jblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblBuscar.setText("Producto a buscar:");

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnVolver.setBackground(new java.awt.Color(0, 102, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setText("Volver al menú");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar productos");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblBuscar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuscar.setShowGrid(true);
        jScrollPane4.setViewportView(tblBuscar);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(jblBuscar)
                        .addGap(32, 32, 32)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    try {
    Conexion oConexion = new Conexion("localhost", "insumos_tecnologicos", "root", "");
    DAOProducto oDAOProducto = new DAOProducto();

    Producto oProducto = new Producto();
    oProducto.setNombre(txtNombre.getText());
    oProducto.setDescripcion(txtDescripcion.getText());

    // Obtener el texto del campo de precio
    String precioText = txtPrecio.getText();
    int precio;

    // Verificar si el campo no está vacío
    if (!precioText.isEmpty()) {
        // Si el campo no está vacío, convertir el texto a un entero
        precio = Integer.parseInt(precioText);
    } else {
        // Si el campo está vacío, establecer el precio en 0
        precio = 0;
    }

    oProducto.setPrecio(precio);

    oProducto.setCantidadStock((int) spnCantidad.getValue());
    oProducto.setCategoria(txtCategoria.getText());

    oDAOProducto.crearProducto(oProducto);

    // Limpiar campos después de registrar
    txtNombre.setText("");
    txtDescripcion.setText("");
    txtPrecio.setText("");
    spnCantidad.setValue(0);
    txtCategoria.setText("");

    JOptionPane.showMessageDialog(this, "Registrado con éxito en el sistema!");
    cargarTablas();

} catch (SQLException ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
} catch (Exception ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            Conexion oConexion=new Conexion ("localhost", "insumos_tecnologicos", "root", "");
            DAOProducto oDAOProductos = new DAOProducto();
            oDAOProductos.UpdateProducto(Integer.parseInt(txtId.getText()), txtNombreUpdate.getText(), txtDescripcionUpdate.getText(), Integer.parseInt(txtPrecioUpdate.getText()), (int) spnCantidadUpdate.getValue(), txtCategoriaUpdate.getText());
            JOptionPane.showMessageDialog(this, "Actualizado Correctamente");
            
            txtId.setText("");
            txtNombreUpdate.setText("");
            txtDescripcionUpdate.setText("");
            txtPrecioUpdate.setText("");
            spnCantidadUpdate.setValue(0);           
            txtCategoriaUpdate.setText("");
            
            cargarTablas();
        } catch (SQLException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Conexion oConexion=new Conexion ("localhost", "insumos_tecnologicos", "root", "");
            DAOProducto oDAOProducto = new DAOProducto();
            String []fila= new String[6];
            oModel.setRowCount(0);
            for (Producto producto : oDAOProducto.getProductosegunFiltro(txtBuscar.getText())) {
                fila[0]=""+producto.getId_producto();
                fila[1]=""+producto.getNombre();
                fila[2]=""+producto.getDescripcion();
                fila[3]=""+producto.getPrecio();
                fila[4]=""+producto.getCantidadStock();
                fila[5]=""+producto.getCategoria();
                oModel.addRow(fila);
                
            }
            txtBuscar.setText("");
        } catch (SQLException ex) {
            
        } catch (Exception ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
           Conexion oConexion=new Conexion ("localhost", "insumos_tecnologicos", "root", "");    
            DAOProducto oDAOProducto = new DAOProducto();
            
            oDAOProducto.borrarProducto(Integer.parseInt(txtProductoEliminar.getText()));
            JOptionPane.showMessageDialog(this, "Borrado Correctamente");
            
            txtProductoEliminar.setText("");
            cargarTablas();
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btnVolver3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
       private void cargarTablas() throws Exception{
        try {
            Conexion oConexion=new Conexion ("localhost", "insumos_tecnologicos", "root", "");    
            DAOProducto oDAOProducto = new DAOProducto();
            
            String []fila= new String[7];
            oModel.setRowCount(0);
            
            for (Producto producto : oDAOProducto.getProducto()) {
                fila[0]=""+producto.getId_producto();
                fila[1]=""+producto.getNombre();
                fila[2]=""+producto.getDescripcion();
                fila[3]=""+producto.getPrecio();
                fila[4]=""+producto.getCantidadStock();
                fila[5]=""+producto.getCategoria();
                
                oModel.addRow(fila);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        }
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jblBuscar;
    private javax.swing.JLabel jblCantidad;
    private javax.swing.JLabel jblCantidadNuevo;
    private javax.swing.JLabel jblCategoria;
    private javax.swing.JLabel jblCategoriaNuevo;
    private javax.swing.JLabel jblDescripcion;
    private javax.swing.JLabel jblDescripcionNuevo;
    private javax.swing.JLabel jblId;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel jblNombreNuevo;
    private javax.swing.JLabel jblPrecio;
    private javax.swing.JLabel jblPrecioNuevo;
    private javax.swing.JLabel jblProductoEliminar;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnCantidadUpdate;
    private javax.swing.JTable tblActualizar;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTable tblEliminar;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCategoriaUpdate;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionUpdate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUpdate;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioUpdate;
    private javax.swing.JTextField txtProductoEliminar;
    // End of variables declaration//GEN-END:variables
}
