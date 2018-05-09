package View;

import Controller.DatosProfController;
import Model.DatosProfesor;
import Controller.MateriaController;
import Model.Materia;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class RegistroProfesor extends javax.swing.JFrame {

    Inicio inicio = new Inicio();
    private static MateriaController matco = new MateriaController();
    private static DatosProfController datproco = new DatosProfController();
    int index_regprof;
    int index_regmat;

    public RegistroProfesor() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/logo3D.png")).getImage());
        setTitle("Registro de Profesor");
        datproco.listarTablaDatosProf(jTable);
        matco.ListarTabla(jTable2);

    }

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
        jButton2 = new javax.swing.JButton();
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
        jLabel9 = new javax.swing.JLabel();
        txtCreditoRegMat = new javax.swing.JTextField();
        btnCancelarRegMat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbHoraRegMat1 = new javax.swing.JComboBox<>();

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
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardarRegProf.setText("Guardar");
        btnGuardarRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegProfActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 28, 84, -1));

        btnEditarRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEditarRegProf.setText("Editar");
        btnEditarRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRegProfActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 65, 84, -1));

        btnEliminarRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarRegProf.setText("Eliminar");
        btnEliminarRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegProfActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 102, 84, -1));

        btnInicioRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnInicioRegProf.setText("Inicio");
        btnInicioRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioRegProfActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicioRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 176, 84, -1));

        txtCelProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCelProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 162, 185, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Cel / telf:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 164, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 117, -1, -1));

        txtCorreoProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCorreoProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoProfKeyPressed(evt);
            }
        });
        jPanel1.add(txtCorreoProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 115, 275, -1));

        txtNombreRegProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombreRegProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreRegProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 65, 275, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 67, -1, -1));

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
        jTable.getTableHeader().setReorderingAllowed(false);
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 277, 549, 150));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 139, -1, -1));

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Clase", "Materia", "Credito", "Salon de clases", "Profesor/a", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
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
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Nombre Materia:");

        txtNombreRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombreRegMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreRegMatKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Codigo Clase:");

        txtCodigoRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Profesor/a:");

        cbProfesorRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Hora de Entrada:");

        cbHoraRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbHoraRegMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:45 am", "7:00 am", "7:15 am", "7:30 am", "7:45 am", "8:00 am", "8:15 am", "8:30 am", "8:45 am", "9:00 am", "9:15 am", "9:30 am", "9:45 am", "10:00 am", "10:15 am", "10:30 am", "10:45 am", "11:00 am", "11:15 am", "11:30 am", "11:45 am", "12:00 pm", "12:15 pm", "12:30 pm", "12:45 pm", "1:00 pm", "1:15 pm", "1:30 pm", "1:45 pm", "2:00 pm", "2:15 pm", "2:30 pm", "2:45 pm", "3:00 pm", "3:15 pm", "3:30 pm", "3:45 pm", "4:00 pm", "4:15 pm", "4:30 pm", "4:45 pm", "5:00 pm", "5:15 pm", "5:30 pm", "5:45 pm", "6:00 pm", "6:15 pm", "6:30 pm", "6:45 pm", "7:00 pm", "7:15 pm", "7:30 pm", "7:45 pm", "8:00 pm", "8:15 pm", "8:30 pm", "8:45 pm", "9:00 pm", "9:15 pm", "9:30 pm", "9:45 pm", "10:00 pm", "10:15 pm", "10:30 pm", "10:45 pm", "11:00 pm", "11:15 pm", "11:30 pm", "11:45 pm", "12:00 am", "12:15 am", "12:30 am", "12:45 am" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Salon de clases:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Credito:");

        txtCreditoRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCreditoRegMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoRegMatKeyTyped(evt);
            }
        });

        btnCancelarRegMat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCancelarRegMat.setText("Cancelar");
        btnCancelarRegMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegMatActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Salida:");

        cbHoraRegMat1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbHoraRegMat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:45 am", "7:00 am", "7:15 am", "7:30 am", "7:45 am", "8:00 am", "8:15 am", "8:30 am", "8:45 am", "9:00 am", "9:15 am", "9:30 am", "9:45 am", "10:00 am", "10:15 am", "10:30 am", "10:45 am", "11:00 am", "11:15 am", "11:30 am", "11:45 am", "12:00 pm", "12:15 pm", "12:30 pm", "12:45 pm", "1:00 pm", "1:15 pm", "1:30 pm", "1:45 pm", "2:00 pm", "2:15 pm", "2:30 pm", "2:45 pm", "3:00 pm", "3:15 pm", "3:30 pm", "3:45 pm", "4:00 pm", "4:15 pm", "4:30 pm", "4:45 pm", "5:00 pm", "5:15 pm", "5:30 pm", "5:45 pm", "6:00 pm", "6:15 pm", "6:30 pm", "6:45 pm", "7:00 pm", "7:15 pm", "7:30 pm", "7:45 pm", "8:00 pm", "8:15 pm", "8:30 pm", "8:45 pm", "9:00 pm", "9:15 pm", "9:30 pm", "9:45 pm", "10:00 pm", "10:15 pm", "10:30 pm", "10:45 pm", "11:00 pm", "11:15 pm", "11:30 pm", "11:45 pm", "12:00 am", "12:15 am", "12:30 am", "12:45 am" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodigoRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCreditoRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbProfesorRegMat, 0, 247, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(txtSalonRegMat)))))
                                .addGap(147, 147, 147))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbHoraRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbHoraRegMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarRegMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarRegMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarRegMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarRegMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInicioRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCreditoRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigoRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSalonRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProfesorRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(cbHoraRegMat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(cbHoraRegMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarRegMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarRegMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarRegMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarRegMat)
                        .addGap(18, 18, 18)
                        .addComponent(btnInicioRegMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

        txtNombreRegProf.setText(datproco.read(index_regprof).getNombre());
        txtCorreoProf.setText(datproco.read(index_regprof).getCorreo());
        txtCelProf.setText(datproco.read(index_regprof).getNumeroCel());
    }//GEN-LAST:event_jTableMouseClicked

    private void btnEliminarRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegProfActionPerformed
        datproco.Eliminar(index_regprof, jTable);
    }//GEN-LAST:event_btnEliminarRegProfActionPerformed

    private void btnEditarRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegProfActionPerformed
        datproco.update(new DatosProfesor(txtNombreRegProf.getText(), txtCorreoProf.getText(), txtCelProf.getText()), index_regprof, jTable);
    }//GEN-LAST:event_btnEditarRegProfActionPerformed

    private void btnGuardarRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegProfActionPerformed
        datproco.Create(new DatosProfesor(txtNombreRegProf.getText(), txtCorreoProf.getText(), txtCelProf.getText()), jTable);
        borrarProf();
    }//GEN-LAST:event_btnGuardarRegProfActionPerformed

    private void btnGuardarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegMatActionPerformed
        matco.Create(new Materia(Integer.parseInt(txtCodigoRegMat.getText()), txtNombreRegMat.getText(), Integer.parseInt(txtCreditoRegMat.getText()), datproco.DatosProfesors().get(cbProfesorRegMat.getSelectedIndex()), txtSalonRegMat.getText(), (String) cbHoraRegMat.getSelectedItem(), (String) cbHoraRegMat1.getSelectedItem()), jTable2);
        borrarMat();
    }//GEN-LAST:event_btnGuardarRegMatActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        index_regmat = jTable2.getSelectedRow();

        txtNombreRegMat.setText(matco.read(index_regmat).getNombre_materia());
        txtCreditoRegMat.setText(String.valueOf(matco.read(index_regmat).getCredito()));
        txtCodigoRegMat.setText(String.valueOf(matco.read(index_regmat).getIndex()));
        txtSalonRegMat.setText(matco.read(index_regmat).getSalon_clases());
        cbProfesorRegMat.setSelectedItem(matco.read(index_regmat).getDprof().getNombre());
        cbHoraRegMat.setSelectedItem(matco.read(index_regmat).getHoraE());
        cbHoraRegMat1.setSelectedItem(matco.read(index_regmat).getHoraS());
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnInicioRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioRegMatActionPerformed
        inicio.btnCalificaciones.setEnabled(true);
        inicio.btnRegistroProf.setEnabled(true);
        inicio.deshabilitBien(false);
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioRegMatActionPerformed

    private void btnEditarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegMatActionPerformed
        matco.update(new Materia(Integer.parseInt(txtCodigoRegMat.getText()), txtNombreRegMat.getText(), Integer.parseInt(txtCreditoRegMat.getText()), datproco.DatosProfesors().get(cbProfesorRegMat.getSelectedIndex()), txtSalonRegMat.getText(), (String) cbHoraRegMat.getSelectedItem(), (String) cbHoraRegMat1.getSelectedItem()), index_regmat, jTable2);
    }//GEN-LAST:event_btnEditarRegMatActionPerformed

    private void btnEliminarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegMatActionPerformed
        matco.Eliminar(index_regmat, jTable2);
    }//GEN-LAST:event_btnEliminarRegMatActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        cbProfesorRegMat.removeAllItems();
        for (DatosProfesor dat : datproco.DatosProfesors()) {
            cbProfesorRegMat.addItem(dat.getNombre());
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnInicioRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioRegProfActionPerformed
        inicio.btnCalificaciones.setEnabled(true);
        inicio.btnRegistroProf.setEnabled(true);
        inicio.deshabilitBien(false);
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioRegProfActionPerformed

    private void btnCancelarRegMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegMatActionPerformed
        borrarMat();
    }//GEN-LAST:event_btnCancelarRegMatActionPerformed

    private void txtCreditoRegMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoRegMatKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCreditoRegMatKeyTyped

    private void txtCelProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelProfKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCelProfKeyTyped

    private void txtNombreRegProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRegProfKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreRegProfKeyTyped

    private void txtCorreoProfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProfKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoProfKeyPressed

    private void txtNombreRegMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRegMatKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreRegMatKeyTyped

    private void borrarMat() {
        String t = "";
        txtCodigoRegMat.setText(t);
        txtCreditoRegMat.setText(t);
        txtNombreRegMat.setText(t);
        txtSalonRegMat.setText(t);
    }

    private void borrarProf() {
        txtNombreRegProf.setText("");
        txtCorreoProf.setText("");
        txtCelProf.setText("");
    }

    public int tama() {
        int tam = cbProfesorRegMat.getItemCount();
        return tam;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarRegMat;
    private javax.swing.JButton btnEditarRegMat;
    private javax.swing.JButton btnEditarRegProf;
    private javax.swing.JButton btnEliminarRegMat;
    private javax.swing.JButton btnEliminarRegProf;
    private javax.swing.JButton btnGuardarRegMat;
    private javax.swing.JButton btnGuardarRegProf;
    private javax.swing.JButton btnInicioRegMat;
    private javax.swing.JButton btnInicioRegProf;
    private javax.swing.JComboBox<String> cbHoraRegMat;
    private javax.swing.JComboBox<String> cbHoraRegMat1;
    private javax.swing.JComboBox<String> cbProfesorRegMat;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtCreditoRegMat;
    private javax.swing.JTextField txtNombreRegMat;
    public javax.swing.JTextField txtNombreRegProf;
    private javax.swing.JTextField txtSalonRegMat;
    // End of variables declaration//GEN-END:variables
}
