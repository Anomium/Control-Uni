package Controller;
import Model.DatosProfesor;
import java.util.ArrayList;
public class DatosProfController {
    
    private static ArrayList<DatosProfesor> DProf = new ArrayList<DatosProfesor>();
    
    public void Create(DatosProfesor datosprofesor){
        
        DProf.add(datosprofesor);
        
    }
    
    public void update() {

    }

    public void read() {

    }

    public void Eliminar(int Index, javax.swing.JTable jTable) {
        DProf.remove(Index);
        listarTablaDatosProf(jTable);
    }
    
    public ArrayList<DatosProfesor> DatosProfesors(){
        return DProf;
    }    

    public void listarTablaDatosProf(javax.swing.JTable jTable){
        Object[][] matriz = new Object[DatosProfesors().size()][3];
        for (int q = 0; q < DatosProfesors().size(); q++) {
            matriz[q][0] = DatosProfesors().get(q).getNombre();
            matriz[q][1] = DatosProfesors().get(q).getCorreo();
            matriz[q][2] = DatosProfesors().get(q).getNumeroCel();
        }
        jTable.setModel(new javax.swing.table.DefaultTableModel(
                
            matriz,
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


        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
        }

    }
}
