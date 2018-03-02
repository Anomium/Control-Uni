package Controller;

import Controller.MateriaController;
import Model.Calificacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CalificacionController {

    private static ArrayList<Calificacion> notas = new ArrayList<Calificacion>();
    private MateriaController matercot = new MateriaController();

    public void Create(Calificacion notasc) {
        notas.add(notasc);
    }
    
    public CalificacionController(){
        this.notas = new ArrayList();
    }

    public void update() {

    }

    public void read() {

    }

    public boolean delete(int notab) {
        boolean V = false;
        notab = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getNota() == notab) {
                notas.remove(i);
                V = true;
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Se ha borrado la materia.");
        return V;
    }

    public ArrayList<Calificacion> datosnotas() {
        return notas;
    }

    public void listarTablaCalificaciones(javax.swing.JTable jtCalificaciones) {
        Object[][] matriz = new Object[datosnotas().size()][2];
        for (int i = 0; i < datosnotas().size(); i++) {
            //matriz[i][0] = matercot.Materia().get(i).getNombre_materia();
            matriz[i][1] = notas.get(i).getNota();
        }

        jtCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Materia", "Calificacion"
                }
                
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        if (jtCalificaciones.getColumnModel().getColumnCount() > 0) {
            jtCalificaciones.getColumnModel().getColumn(0).setResizable(false);
            jtCalificaciones.getColumnModel().getColumn(1).setResizable(false);

        }

    }
    
}
