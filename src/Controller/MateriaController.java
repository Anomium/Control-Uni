package Controller;

import Model.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MateriaController {

    private ArrayList<Materia> mater = new ArrayList<Materia>();

    public void Create(Materia mater2) {
        mater.add(mater2);
    }
    
    public MateriaController(){
        this.mater = new ArrayList();
    }

    public void update() {

    }

    public void read() {

    }
    
    public boolean Eliminar(int Index) {
        boolean V = false;
        for (int i = 0; i < mater.size(); i++) {
            if (mater.get(i).getIndex() == Index) {
                mater.remove(i);
                V = true;
                break;
            }
        }
        JOptionPane.showMessageDialog(null,"Se ha borrado la materia.");
        return V;
    }

    public ArrayList<Materia> getMater() {
        return mater;
    }

    public void ListarTabla(javax.swing.JTable jTable) {
        Object[][] matriz = new Object[getMater().size()][5];

        for (int i = 0; i < getMater().size(); i++) {
            matriz[i][0] = getMater().get(i).getIndex();
            matriz[i][1] = getMater().get(i).getNombre_materia();
            matriz[i][2] = getMater().get(i).getSalon_clases();
            matriz[i][3] = getMater().get(i).getNombre_materia();
            matriz[i][4] = getMater().get(i).getHora();
            
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
