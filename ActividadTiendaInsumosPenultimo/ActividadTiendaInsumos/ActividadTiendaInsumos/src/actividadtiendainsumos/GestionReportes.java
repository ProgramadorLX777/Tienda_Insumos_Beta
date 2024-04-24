package actividadtiendainsumos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionReportes extends javax.swing.JFrame {

    public GestionReportes() {
        initComponents();
        this.setTitle("Generar Reportes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl_fecha_reporte_1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_id_reporte_1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_hora_reporte_1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_id_primer_producto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stock_inicial_producto1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        stock_final_producto1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_cantidad_vendidos1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_producto_mas_vendido = new javax.swing.JLabel();
        btn_generar_reporte = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbl_producto_menos_vendido = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_inventario_minimo = new javax.swing.JLabel();
        btn_generar_reporte1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbl_fecha_reporte_2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_id_reporte_2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_hora_reporte_2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_id_segundo_producto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stock_inicial_producto2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        stock_final_producto2 = new javax.swing.JLabel();
        lbl_cantidad_vendidos2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        lbl_fecha_reporte_3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_id_reporte_3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl_hora_reporte_3 = new javax.swing.JLabel();
        lbl_id_tercer_producto = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        stock_inicial_producto3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        stock_final_producto3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_cantidad_vendidos3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("REPORTE INVENTARIO");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto-tecnologico (1).png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto-tecnologico (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(jLabel40)
                .addGap(115, 115, 115))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jLabel41)
                    .addContainerGap(873, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel41)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true), "Primer Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 18))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setText("Fecha Reporte:");

        lbl_fecha_reporte_1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_fecha_reporte_1.setText("--");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("ID Reporte:");

        lbl_id_reporte_1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_id_reporte_1.setText("--");

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setText("Hora Reporte:");

        lbl_hora_reporte_1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_hora_reporte_1.setText("--");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("ID Producto:");

        lbl_id_primer_producto.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_id_primer_producto.setText("--");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Stock Inicial: (Pre-Inventario)");

        stock_inicial_producto1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        stock_inicial_producto1.setText("--");

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel14.setText("Stock Final: (Post-Inventario)");

        stock_final_producto1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        stock_final_producto1.setText("--");

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel15.setText("Cantidad Vendidos:");

        lbl_cantidad_vendidos1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_cantidad_vendidos1.setText("--");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_fecha_reporte_1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_id_reporte_1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_hora_reporte_1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_id_primer_producto))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_cantidad_vendidos1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stock_inicial_producto1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(stock_final_producto1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_id_reporte_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_id_primer_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_fecha_reporte_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_hora_reporte_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_cantidad_vendidos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stock_inicial_producto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(stock_final_producto1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 102, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel12.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel12.setText("Producto más Vendido:");

        lbl_producto_mas_vendido.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_producto_mas_vendido.setText("--");

        btn_generar_reporte.setBackground(new java.awt.Color(153, 102, 0));
        btn_generar_reporte.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        btn_generar_reporte.setText("Generar Reporte");
        btn_generar_reporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_generar_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_reporteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel13.setText("Producto menos Vendido:");

        lbl_producto_menos_vendido.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_producto_menos_vendido.setText("--");

        jLabel18.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel18.setText("Inventario Mínimo:");

        lbl_inventario_minimo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_inventario_minimo.setText("--");

        btn_generar_reporte1.setBackground(new java.awt.Color(153, 102, 0));
        btn_generar_reporte1.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        btn_generar_reporte1.setText("Volver");
        btn_generar_reporte1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btn_generar_reporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_reporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_producto_menos_vendido))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_producto_mas_vendido)
                            .addComponent(lbl_inventario_minimo))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btn_generar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_generar_reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn_generar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_generar_reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lbl_inventario_minimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_producto_mas_vendido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_producto_menos_vendido)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14))
        );

        jPanel6.setBackground(new java.awt.Color(153, 102, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true), "Segundo Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("Fecha Reporte:");

        lbl_fecha_reporte_2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_fecha_reporte_2.setText("--");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("ID Reporte:");

        lbl_id_reporte_2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_id_reporte_2.setText("--");

        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel22.setText("Hora Reporte:");

        lbl_hora_reporte_2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_hora_reporte_2.setText("--");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("ID Producto:");

        lbl_id_segundo_producto.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_id_segundo_producto.setText("--");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("Stock Inicial: (Pre-Inventario)");

        stock_inicial_producto2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        stock_inicial_producto2.setText("--");

        jLabel26.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel26.setText("Stock Final: (Post-Inventario)");

        stock_final_producto2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        stock_final_producto2.setText("--");

        lbl_cantidad_vendidos2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_cantidad_vendidos2.setText("--");

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel16.setText("Cantidad Vendidos:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_fecha_reporte_2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_id_reporte_2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_hora_reporte_2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_id_segundo_producto))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stock_inicial_producto2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(stock_final_producto2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_cantidad_vendidos2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_id_reporte_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_id_segundo_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbl_fecha_reporte_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lbl_hora_reporte_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lbl_cantidad_vendidos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stock_inicial_producto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(stock_final_producto2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 102, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true), "Tercer Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 18))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel28.setText("Fecha Reporte:");

        lbl_fecha_reporte_3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_fecha_reporte_3.setText("--");

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setText("ID Reporte:");

        lbl_id_reporte_3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_id_reporte_3.setText("--");

        jLabel31.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel31.setText("Hora Reporte:");

        lbl_hora_reporte_3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_hora_reporte_3.setText("--");

        lbl_id_tercer_producto.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbl_id_tercer_producto.setText("ID Producto:");

        jLabel34.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel34.setText("--");

        jLabel35.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel35.setText("Stock Inicial: (Pre-Inventario)");

        stock_inicial_producto3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        stock_inicial_producto3.setText("--");

        jLabel37.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel37.setText("Stock Final: (Post-Inventario)");

        stock_final_producto3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        stock_final_producto3.setText("--");

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel17.setText("Cantidad Vendidos:");

        lbl_cantidad_vendidos3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbl_cantidad_vendidos3.setText("--");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_fecha_reporte_3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_id_reporte_3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_hora_reporte_3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbl_id_tercer_producto)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stock_inicial_producto3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(stock_final_producto3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_cantidad_vendidos3)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_id_reporte_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id_tercer_producto)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lbl_fecha_reporte_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lbl_hora_reporte_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lbl_cantidad_vendidos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(stock_inicial_producto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(stock_final_producto3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generar_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_reporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_generar_reporteActionPerformed

    private void btn_generar_reporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_reporte1ActionPerformed
        Inicio oInicio = null;
        try {
            oInicio = new Inicio();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        oInicio.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_btn_generar_reporte1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar_reporte;
    private javax.swing.JButton btn_generar_reporte1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_cantidad_vendidos1;
    private javax.swing.JLabel lbl_cantidad_vendidos2;
    private javax.swing.JLabel lbl_cantidad_vendidos3;
    private javax.swing.JLabel lbl_fecha_reporte_1;
    private javax.swing.JLabel lbl_fecha_reporte_2;
    private javax.swing.JLabel lbl_fecha_reporte_3;
    private javax.swing.JLabel lbl_hora_reporte_1;
    private javax.swing.JLabel lbl_hora_reporte_2;
    private javax.swing.JLabel lbl_hora_reporte_3;
    private javax.swing.JLabel lbl_id_primer_producto;
    private javax.swing.JLabel lbl_id_reporte_1;
    private javax.swing.JLabel lbl_id_reporte_2;
    private javax.swing.JLabel lbl_id_reporte_3;
    private javax.swing.JLabel lbl_id_segundo_producto;
    private javax.swing.JLabel lbl_id_tercer_producto;
    private javax.swing.JLabel lbl_inventario_minimo;
    private javax.swing.JLabel lbl_producto_mas_vendido;
    private javax.swing.JLabel lbl_producto_menos_vendido;
    private javax.swing.JLabel stock_final_producto1;
    private javax.swing.JLabel stock_final_producto2;
    private javax.swing.JLabel stock_final_producto3;
    private javax.swing.JLabel stock_inicial_producto1;
    private javax.swing.JLabel stock_inicial_producto2;
    private javax.swing.JLabel stock_inicial_producto3;
    // End of variables declaration//GEN-END:variables
}
