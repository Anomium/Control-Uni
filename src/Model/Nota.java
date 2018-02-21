package Model;
public class Nota {
    
    private String materia;
    private double nota;
    
    public Nota (){
        
    }
    public Nota(String materia, double nota){
        this.materia = materia;
        this.nota = nota;
    }
    
    //Set
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    
    //get
    public String getMateria(){
        return materia;
    }
    public double getNota(){
        return nota;
    }
    
}
