package Model;
public class Calificacion {
    
    private double nota;
    
    public Calificacion (){
        
    }
    public Calificacion(double nota){
        this.nota = nota;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    public double getNota(){
        return nota;
    }
    
}
