package Controller;

import Controller.MateriaController;
import Model.Calificacion;
import Model.Materia;
import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import View.RegistroProfesor;
import View.Inicio;

public class CalificacionController {

    private static RegistroProfesor regprof = new RegistroProfesor();
    private static ArrayList<Calificacion> notas = new ArrayList<Calificacion>();
    private static ArrayList<Materia> porcentaje = new ArrayList<Materia>();
    private static Inicio inicio = new Inicio();

    public void Create(Calificacion notasc) {
        notas.add(notasc);
    }

    public void createP(Materia mat) {
        porcentaje.add(mat);
    }

    public CalificacionController() {
        this.notas = new ArrayList();
    }

    public void update() {

    }

    public void updateP(int index, Materia mat, javax.swing.JTable jTable1) {
        porcentaje.set(index, mat);
        listarTablaCortes(jTable1);
    }

    public Materia readP(int index) {
        return porcentaje.get(index);
    }

    public Calificacion read(int index) {
        return notas.get(index);
    }

    public void delete(int index, javax.swing.JTable jtCalificaciones) {
        notas.remove(index);
        listarTablaCalificaciones(jtCalificaciones);
    }

    public ArrayList<Calificacion> datosnotas() {
        return notas;
    }

    public ArrayList<Materia> procentaje1() {
        return porcentaje;
    }

    public void ListarCB(MateriaController materico) {
        for (int i = 0; i < 10; i++) {
            materico.Materia().get(i).getNombre_materia();
        }

    }

    public void PreomedioMat(String materia) {
        double promMat = 0;
        double[] vec = new double[100];
        int corte = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getMateria().getNombre_materia().equals(materia)) {

                System.out.println(notas.get(i).getNota());
                switch (corte) {
                    case 0:
                        promMat = promMat + (notas.get(i).getNota() * (porcentaje.get(0).getCorte1() * 0.01));
                        System.out.println(notas.get(i).getNota());
                        break;
                    case 1:
                        promMat = promMat + (notas.get(i).getNota() * (porcentaje.get(0).getCorte2() * 0.01));
                        //System.out.println(promMat);
                        break;
                    case 2:
                        promMat = promMat + (notas.get(i).getNota() * (porcentaje.get(0).getCorte3() * 0.01));
                        //System.out.println(promMat);
                        break;
                }
                corte++;
            }

        }

        JOptionPane.showMessageDialog(null, "La el promedio de la materia " + materia + " es: " + promMat);
    }

    public void Promedio(String materia) {
        double prom = 0;
        double[] vec = new double[3];
        int corte = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getMateria().getNombre_materia().equals(materia)) {

                System.out.println(notas.get(i).getNota());
                switch (corte) {
                    case 0:
                        prom = prom + (notas.get(i).getNota() * (porcentaje.get(0).getCorte1() * 0.01));
                        System.out.println(notas.get(i).getNota());
                        break;
                    case 1:
                        prom = prom + (notas.get(i).getNota() * (porcentaje.get(0).getCorte2() * 0.01));
                        //System.out.println(promMat);
                        break;
                    case 2:
                        prom = prom + (notas.get(i).getNota() * (porcentaje.get(0).getCorte3() * 0.01));
                        //System.out.println(promMat);
                        break;
                }
                corte++;
            }
            vec[i] = prom * porcentaje.get(i).getCredito();
        }
        for (int i = 0; i < vec.length; i++) {
            prom = vec[i];
        }
        prom = prom;
        JOptionPane.showMessageDialog(null, "La el promedio de la materia " + materia + " es: " + prom);
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

    public void listarTablaCortes(javax.swing.JTable jTable1) {
        Object[][] matriz = new Object[porcentaje.size()][3];
        for (int i = 0; i < porcentaje.size(); i++) {
            matriz[i][0] = porcentaje.get(i).getCorte1();
            matriz[i][1] = porcentaje.get(i).getCorte2();
            matriz[i][2] = porcentaje.get(i).getCorte3();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Primer Corte", "Segundo Corte", "Tercer Corte"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jTable1.getTableHeader().setReorderingAllowed(false);

        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

    }

}
