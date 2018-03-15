package Controller;

import Controller.MateriaController;
import Model.Calificacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CalificacionController {
    
    private static ArrayList<Calificacion> notas = new ArrayList<Calificacion>();

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

    public void delete(int index, javax.swing.JTable jtCalificaciones) {
        notas.remove(index);
        listarTablaCalificaciones(jtCalificaciones);
    }

    public ArrayList<Calificacion> datosnotas() {
        return notas;
    }
    
    public void PreomedioMat(String materia){
        double promMat = 0;
        int cont = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getMateria().getNombre_materia() == materia) {
                promMat = promMat + notas.get(i).getNota();
                cont++;
            }
        }
        promMat = promMat / cont;
        JOptionPane.showMessageDialog(null,"La el promedio de la materia " + materia + " es: " + promMat);
    }
    
    public double Promedio(){
        double prom = 0;
        int cont = 0;
        for (int i = 0; i < notas.size(); i++) {
           prom = prom + notas.get(i).getNota();
           cont += 1;
        }
        
        prom = prom / cont;
        System.out.println(prom);
        JOptionPane.showMessageDialog(null, "El Promedio general es: " + prom);
        return prom;
    }

    public void listarTablaCalificaciones(javax.swing.JTable jtCalificaciones) {
        Object[][] matriz = new Object[datosnotas().size()][2];
        for (int i = 0; i < datosnotas().size(); i++) {
            matriz[i][0] = datosnotas().get(i).getMateria().getNombre_materia();
            matriz[i][1] = datosnotas().get(i).getNota();
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
