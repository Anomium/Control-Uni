package Controller;

import Model.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controller.DatosProfController;
public class MateriaController {
    
    private static ArrayList<Materia> materia = new ArrayList<Materia>();
    private DatosProfController datosprofcontroller = new DatosProfController();
    
    public void Create(Materia mater2) {
        materia.add(mater2);
    }

    public void update() {

    }

    public void read() {

    }
    
    public boolean Eliminar(int Index) {
        boolean V = false;
        for (int i = 0; i < materia.size(); i++) {
            if (materia.get(i).getIndex() == Index) {
                materia.remove(i);
                V = true;
                break;
            }
        }
        JOptionPane.showMessageDialog(null,"Se ha borrado la materia.");
        return V;
    }

    public ArrayList<Materia> Materia(){
        return materia;
    }

    public void ListarTabla(javax.swing.JTable jTable) {
        Object[][] matriz = new Object[Materia().size()][5];

        for (int i = 0; i < Materia().size(); i++) {
            matriz[i][0] = Materia().get(i).getIndex();
            matriz[i][1] = Materia().get(i).getNombre_materia();
            matriz[i][2] = Materia().get(i).getSalon_clases();
            matriz[i][3] = datosprofcontroller.DatosProfesors().get(i).getNombre();
            matriz[i][4] = Materia().get(i).getHora();
            
        }
        jTable.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Codigo Clase", "Materia", "Salon de clases", "Profesor/a", "Hora"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
        }

    }

}
