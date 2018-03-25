package View;

import javax.swing.ImageIcon;
import Controller.CalificacionController;
import Model.Materia;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inicio extends javax.swing.JFrame {

    private static CalificacionController calif = new CalificacionController();
    int num;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/logo3D.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnCalificaciones = new javax.swing.JButton();
        btnRegistroProf = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCorte1 = new javax.swing.JTextField();
        btnGuardarBien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtCorte3 = new javax.swing.JTextField();
        txtCorte2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbtnEditBien = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        btnCalificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCalificaciones.setEnabled(false);
        btnCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificacionesActionPerformed(evt);
            }
        });

        btnRegistroProf.setEnabled(false);
        btnRegistroProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroProfActionPerformed(evt);
            }
        });

        jLabel5.setText("Calificaciones");

        jLabel2.setText("Registro de Profesores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistroProf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroProf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(95, 95, 95))
        );

        jTabbedPane1.addTab("Menú", jPanel2);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Porcentajes de cortes");

        txtCorte1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btnGuardarBien.setText("Guardar");
        btnGuardarBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBienActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Primer Corte", "Segundo Corte", "Tercer Corte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        txtCorte3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtCorte2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel3.setText("Primer Corte:");

        jLabel4.setText("Segundo Corte:");

        jLabel6.setText("Tercer Corte:");

        tbtnEditBien.setText("Editar");
        tbtnEditBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnEditBienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tbtnEditBien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarBien))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorte1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorte2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCorte3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnEditBien)
                    .addComponent(btnGuardarBien))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bienvenido", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBienActionPerformed
        double num;
        try {
            num = Double.parseDouble(txtCorte1.getText()) + Double.parseDouble(txtCorte2.getText()) + Double.parseDouble(txtCorte3.getText());
            if (num > 0 && num == 100) {
                calif.createP(new Materia(Double.parseDouble(txtCorte1.getText()), Double.parseDouble(txtCorte2.getText()), Double.parseDouble(txtCorte3.getText())));
                calif.listarTablaCortes(jTable1);
                borrar();
                deshabilitBien(false);
                btnCalificaciones.setEnabled(true);
                btnRegistroProf.setEnabled(true);
            } else if (num > 100) {
                JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser mayor a 100%");

            } else if (num < 0) {
                JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser menor a 0%");
            } else if (num < 100) {
                JOptionPane.showMessageDialog(null, "La suma de porcentajes debe de ser 100%");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "• Solo se pueden digitar numeros\n• La suma de porcentajes no puede pasar el 100%\n• Los porcentajes no pueden ser negativos");
        }
    }//GEN-LAST:event_btnGuardarBienActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        num = jTable1.getSelectedRow();
        DatosTxtField();
    }//GEN-LAST:event_jTable1MouseClicked

    private void tbtnEditBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnEditBienActionPerformed
        if (tbtnEditBien.getText().equals("Editar")) {
            int OpcEditPor = JOptionPane.showConfirmDialog(null, "¿Desea editar?");
            if (OpcEditPor == 0) {
                DatosTxtField();
                deshabilitBien(true);
                tbtnEditBien.setText("Guardar Cambios");
                btnGuardarBien.setEnabled(false);
            }
        } else if (tbtnEditBien.getText().equals("Guardar Cambios")) {
            calif.updateP(num, new Materia(Double.parseDouble(txtCorte1.getText()), Double.parseDouble(txtCorte2.getText()), Double.parseDouble(txtCorte3.getText())), jTable1);
            tbtnEditBien.setText("Editar");
            deshabilitBien(false);
        }
    }//GEN-LAST:event_tbtnEditBienActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        calif.listarTablaCortes(jTable1);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnRegistroProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroProfActionPerformed
        Calificaciones calif = new Calificaciones();
        calif.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroProfActionPerformed

    private void btnCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificacionesActionPerformed
        RegistroProfesor RegProf = new RegistroProfesor();
        RegProf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCalificacionesActionPerformed

    public void DatosTxtField() {
        txtCorte1.setText(String.valueOf(calif.readP(num).getCorte1()));
        txtCorte2.setText(String.valueOf(calif.readP(num).getCorte2()));
        txtCorte3.setText(String.valueOf(calif.readP(num).getCorte3()));
    }

    public void deshabilitBien(boolean v) {
        btnGuardarBien.setEnabled(v);
        txtCorte1.setEnabled(v);
        txtCorte2.setEnabled(v);
        txtCorte3.setEnabled(v);
    }

    private void borrar() {
        String borrar = "";
        txtCorte1.setText(borrar);
        txtCorte2.setText(borrar);
        txtCorte3.setText(borrar);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalificaciones;
    private javax.swing.JButton btnGuardarBien;
    public javax.swing.JButton btnRegistroProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton tbtnEditBien;
    private javax.swing.JTextField txtCorte1;
    private javax.swing.JTextField txtCorte2;
    private javax.swing.JTextField txtCorte3;
    // End of variables declaration//GEN-END:variables
}
