package Model;
public class Materia{
    
    private DatosProfesor dprof;
    private String Nombre_materia;
    private String salon_clases;
    private String hora;
    private int Index;
    
    //CONSTRUCTORES
    public Materia(){
        
    }
    public Materia(int Index, String Nombre_materia, DatosProfesor dprof, String salon_clases, String hora){
        this.dprof = dprof;
        this.Index = Index;
        this.Nombre_materia = Nombre_materia;
        this.salon_clases = salon_clases;
        this.hora = hora;
    }
    public Materia(String Nombre_materia){
        this.Nombre_materia = Nombre_materia;
    }
    
    //SET AND GET
        public int getIndex() {
        return Index;
    }

    public void setIndex(int Index) {
        this.Index = Index;
    }
    
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

    public DatosProfesor getDprof() {
        return dprof;
    }

    public void setDprof(DatosProfesor dprof) {
        this.dprof = dprof;
    }
    
    
}
