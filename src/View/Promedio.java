package View;
import Model.Materia;
import java.util.ArrayList;
import Controller.CalificacionController;
import Controller.MateriaController;
public class Promedio extends javax.swing.JFrame {

    
    private static MateriaController matco = new MateriaController();
    private static CalificacionController califcon = new CalificacionController();
    private ArrayList<Materia> ArrayMat = new ArrayList<Materia>();
    public Promedio() {
        initComponents();
        setLocationRelativeTo(null);
        
        for (Materia mat : matco.Materia()) {
            ArrayMat.add(mat);
            cbMateriaPro.addItem(mat.getNombre_materia());
        }
    }
    private static Inicio inicio = new Inicio();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        btnPromedioG = new javax.swing.JButton();
        btnPromMat = new javax.swing.JButton();
        cbMateriaPro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setText("Inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnPromedioG.setText("Promedio General");
        btnPromedioG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioGActionPerformed(evt);
            }
        });

        btnPromMat.setText("Promedio por Materia");
        btnPromMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromMatActionPerformed(evt);
            }
        });

        jLabel1.setText("Materia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPromedioG))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMateriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnPromMat)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPromMat)
                    .addComponent(cbMateriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(btnPromedioG)
                .addGap(37, 37, 37)
                .addComponent(btnInicio)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnPromedioGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioGActionPerformed
        califcon.Promedio();
    }//GEN-LAST:event_btnPromedioGActionPerformed

    private void btnPromMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromMatActionPerformed
        califcon.PreomedioMat((String) cbMateriaPro.getSelectedItem());
    }//GEN-LAST:event_btnPromMatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPromMat;
    private javax.swing.JButton btnPromedioG;
    private javax.swing.JComboBox<String> cbMateriaPro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
