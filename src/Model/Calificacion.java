package Model;
public class Calificacion {
    private Materia materia;
    private double nota;
    
    public Calificacion (){
        
    }
    public Calificacion(double nota, Materia materia){
        this.materia = materia;
        this.nota = nota;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}
