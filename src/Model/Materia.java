package Model;
public class Materia {
    
    private String Nombre_materia;
    private String salon_clases;
    private String hora;
    
    //CONSTRUCTORES
    public Materia(){
        
    }
    public Materia(String Nombre_materia, String salon_clases, String hora){
        this.Nombre_materia = Nombre_materia;
        this.salon_clases = salon_clases;
        this.hora = hora;
    }
    
    //SET AND GET
    public String getNombre_materia() {
        return Nombre_materia;
    }

    public void setNombre_materia(String Nombre_materia) {
        this.Nombre_materia = Nombre_materia;
    }

    public String getSalon_clases() {
        return salon_clases;
    }

    public void setSalon_clases(String salon_clases) {
        this.salon_clases = salon_clases;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
