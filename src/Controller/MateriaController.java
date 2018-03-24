package Controller;

import Model.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controller.DatosProfController;

public class MateriaController {

    private static ArrayList<Materia> materia = new ArrayList<Materia>();
    private DatosProfController datosprofcontroller = new DatosProfController();

    public void Create(Materia mater2, javax.swing.JTable jTable2) {
        materia.add(mater2);
        ListarTabla(jTable2);
    }

    public void update(Materia mat, int index, javax.swing.JTable jTable) {
        materia.set(index, mat);
        ListarTabla(jTable);
    }

    public Materia read(int index) {
        return materia.get(index);
    }

    public void Eliminar(int Index, javax.swing.JTable jTable2) {
        materia.remove(Index);
        ListarTabla(jTable2);
    }

    public ArrayList<Materia> Materia() {
        return materia;
    }

    public void ListarTabla(javax.swing.JTable jTable2) {
        Object[][] matriz = new Object[Materia().size()][7];

        for (int i = 0; i < Materia().size(); i++) {
            matriz[i][0] = Materia().get(i).getIndex();
            matriz[i][1] = Materia().get(i).getNombre_materia();
            matriz[i][2] = Materia().get(i).getHoraS();
            matriz[i][3] = Materia().get(i).getSalon_clases();
            matriz[i][4] = Materia().get(i).getDprof().getNombre();
            matriz[i][5] = Materia().get(i).getHoraE();
            matriz[i][6] = Materia().get(i).getHoraS();

        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Codigo Clase", "Materia", "Credito",  "Salon de clases", "Profesor/a", "Entrada", "Salida"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jTable2.getTableHeader().setReorderingAllowed(false);

        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });

        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

    }

}
