package Model;
public class Notas {
    
    private String materia;
    private double nota;
    
    public Notas (){
        
    }
    public Notas(String materia, double nota){
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
