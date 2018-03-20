package Controller;
import Model.DatosProfesor;
import java.util.ArrayList;
public class DatosProfController {
    
    private static ArrayList<DatosProfesor> DProf = new ArrayList<DatosProfesor>();
    
    public void Create(DatosProfesor datosprofesor, javax.swing.JTable jTable){ 
        DProf.add(datosprofesor);
        listarTablaDatosProf(jTable);
    }
    
    public void update(DatosProfesor datprof, int index, javax.swing.JTable jTable1) {
        DProf.set(index, datprof);
        listarTablaDatosProf(jTable1);
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

    public void listarTablaDatosProf(javax.swing.JTable jTable1){
        Object[][] matriz = new Object[DatosProfesors().size()][3];
        for (int q = 0; q < DatosProfesors().size(); q++) {
            matriz[q][0] = DatosProfesors().get(q).getNombre();
            matriz[q][1] = DatosProfesors().get(q).getCorreo();
            matriz[q][2] = DatosProfesors().get(q).getNumeroCel();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                
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


        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

    }
}
