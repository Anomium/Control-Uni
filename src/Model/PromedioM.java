package Model;
import Controller.CalificacionController;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class PromedioM{
    
    public void promedio(ArrayList<Calificacion> calif){
        double resultado = 0;
        for (int i = 0; i < calif.size(); i++) {
            resultado = resultado + calif.get(i).getNota();
        }
        resultado = resultado / calif.size();
        JOptionPane.showMessageDialog(null,"El promedio es: " + resultado);
    }

}
