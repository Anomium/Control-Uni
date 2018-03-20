package View;
import Controller.DatosProfController;
import Model.DatosProfesor;
import Controller.MateriaController;
import Model.Materia;
public class RegistroProfesor extends javax.swing.JFrame {
    

    private static MateriaController matco = new MateriaController();
    private static DatosProfController datproco = new DatosProfController();
    int index_regprof;
    int index_regmat;
    public RegistroProfesor() {
        initComponents();
        setLocationRelativeTo(null);
        datproco.listarTablaDatosProf(jTable);
        
        for(DatosProfesor dat : datproco.DatosProfesors()){
            cbProfesorRegMat.addItem(dat.getNombre());
        }
    }
    private static Inicio inicio = new Inicio();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnGuardarRegProf = new javax.swing.JButton();
        btnEditarRegProf = new javax.swing.JButton();
        btnEliminarRegProf = new javax.swing.JButton();
        btnInicioRegProf = new javax.swing.JButton();
        txtCelProf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreoProf = new javax.swing.JTextField();
        txtNombreRegProf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnGuardarRegMat = new javax.swing.JButton();
        btnEditarRegMat = new javax.swing.JButton();
        btnEliminarRegMat = new javax.swing.JButton();
        btnInicioRegMat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNombreRegMat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoRegMat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbProfesorRegMat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbHoraRegMat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtSalonRegMat = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btnGuardarRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardarRegProf.setText("Guardar");
        btnGuardarRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegProfActionPerformed(evt);
            }
        });

        btnEditarRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEditarRegProf.setText("Editar");
        btnEditarRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRegProfActionPerformed(evt);
            }
        });

        btnEliminarRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarRegProf.setText("Eliminar");
        btnEliminarRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegProfActionPerformed(evt);
            }
        });

        btnInicioRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnInicioRegProf.setText("Inicio");
        btnInicioRegProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioRegProfMouseClicked(evt);
            }
        });

        txtCelProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Cel / telf:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Correo:");

        txtCorreoProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtNombreRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jTable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Cel / telf"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelProf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarRegProf)
                            .addComponent(btnEditarRegProf)
                            .addComponent(btnInicioRegProf)
                            .addComponent(btnEliminarRegProf))
                        .addGap(97, 97, 97)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnGuardarRegProf)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarRegProf)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarRegProf)
                        .addGap(18, 18, 18)
                        .addComponent(btnInicioRegProf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Registro Profesor", jPanel1);

        btnGuardarRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardarRegMat.setText("Guardar");
        btnGuardarRegMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegMatActionPerformed(evt);
            }
        });

        btnEditarRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEditarRegMat.setText("Editar");
        btnEditarRegMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRegMatActionPerformed(evt);
            }
        });

        btnEliminarRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarRegMat.setText("Eliminar");
        btnEliminarRegMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegMatActionPerformed(evt);
            }
        });

        btnInicioRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnInicioRegMat.setText("Inicio");
        btnInicioRegMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioRegMatActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Clase", "Materia", "Salon de clases", "Profesor/a", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Nombre Materia:");

        txtNombreRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel5.setText("Codigo Clase:");

        jLabel6.setText("Profesor/a:");

        jLabel7.setText("Hora:");

        cbHoraRegMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:45 am", "7:00 am", "7:15 am", "7:30 am", "7:45 am", "8:00 am", "8:15 am", "8:30 am", "8:45 am", "9:00 am", "9:15 am", "9:30 am", "9:45 am", "10:00 am", "10:15 am", "10:30 am", "10:45 am", "11:00 am", "11:15 am", "11:30 am", "11:45 am", "12:00 pm", "12:15 pm", "12:30 pm", "12:45 pm", "1:00 pm", "1:15 pm", "1:30 pm", "1:45 pm", "2:00 pm", "2:15 pm", "2:30 pm", "2:45 pm", "3:00 pm", "3:15 pm", "3:30 pm", "3:45 pm", "4:00 pm", "4:15 pm", "4:30 pm", "4:45 pm", "5:00 pm", "5:15 pm", "5:30 pm", "5:45 pm", "6:00 pm", "6:15 pm", "6:30 pm", "6:45 pm", "7:00 pm", "7:15 pm", "7:30 pm", "7:45 pm", "8:00 pm", "8:15 pm", "8:30 pm", "8:45 pm", "9:00 pm", "9:15 pm", "9:30 pm", "9:45 pm", "10:00 pm", "10:15 pm", "10:30 pm", "10:45 pm", "11:00 pm", "11:15 pm", "11:30 pm", "11:45 pm", "12:00 am", "12:15 am", "12:30 am", "12:45 am" }));

        jLabel8.setText("Salon de clases:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreRegMat, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(txtCodigoRegMat)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbProfesorRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbHoraRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalonRegMat, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInicioRegMat)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGuardarRegMat)
                                .addComponent(btnEditarRegMat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEliminarRegMat, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnGuardarRegMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarRegMat))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigoRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSalonRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarRegMat)
                    .addComponent(jLabel6)
                    .addComponent(cbProfesorRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicioRegMat)
                    .addComponent(jLabel7)
                    .addComponent(cbHoraRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro Materia", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        this.index_regprof = jTable.getSelectedRow();
    }//GEN-LAST:event_jTableMouseClicked

    private void btnInicioRegProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioRegProfMouseClicked
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioRegProfMouseClicked

    private void btnEliminarRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegProfActionPerformed
        datproco.Eliminar(index_regprof, jTable);
    }//GEN-LAST:event_btnEliminarRegProfActionPerformed

    private void btnEditarRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegProfActionPerformed
        datproco.update(new DatosProfesor(txtNombreRegProf.getText(), txtCorreoProf.getText(), txtCelProf.getText()), index_regprof, jTable);
    }//GEN-LAST:event_btnEditarRegProfActionPerformed

    private void btnGuardarRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegProfActionPerformed
        datproco.Create(new DatosProfesor(txtNombreRegProf.getText(), txtCorreoProf.getText(), txtCelProf.getText()),jTable);
    }//GEN-LAST:event_btnGuardarRegProfActionPerformed

    private void btnGuardarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegMatActionPerformed
        matco.Create(new Materia(Integer.parseInt(txtCodigoRegMat.getText()), txtNombreRegMat.getText(), datproco.DatosProfesors().get(cbProfesorRegMat.getSelectedIndex()), txtNombreRegMat.getText(), (String) cbHoraRegMat.getSelectedItem()), jTable2);
    }//GEN-LAST:event_btnGuardarRegMatActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        index_regmat = jTable2.getSelectedRow();
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnInicioRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioRegMatActionPerformed
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioRegMatActionPerformed

    private void btnEditarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegMatActionPerformed
        matco.update(new Materia(Integer.parseInt(txtCodigoRegMat.getText()), txtNombreRegMat.getText(), datproco.DatosProfesors().get(cbProfesorRegMat.getSelectedIndex()), txtSalonRegMat.getText(), (String) cbHoraRegMat.getSelectedItem()), index_regmat, jTable2);
    }//GEN-LAST:event_btnEditarRegMatActionPerformed

    private void btnEliminarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegMatActionPerformed
        matco.Eliminar(index_regmat, jTable2);
    }//GEN-LAST:event_btnEliminarRegMatActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarRegMat;
    private javax.swing.JButton btnEditarRegProf;
    private javax.swing.JButton btnEliminarRegMat;
    private javax.swing.JButton btnEliminarRegProf;
    private javax.swing.JButton btnGuardarRegMat;
    private javax.swing.JButton btnGuardarRegProf;
    private javax.swing.JButton btnInicioRegMat;
    private javax.swing.JButton btnInicioRegProf;
    private javax.swing.JComboBox<String> cbHoraRegMat;
    private javax.swing.JComboBox<String> cbProfesorRegMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCelProf;
    private javax.swing.JTextField txtCodigoRegMat;
    private javax.swing.JTextField txtCorreoProf;
    private javax.swing.JTextField txtNombreRegMat;
    public javax.swing.JTextField txtNombreRegProf;
    private javax.swing.JTextField txtSalonRegMat;
    // End of variables declaration//GEN-END:variables
}
