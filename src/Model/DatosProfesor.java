package Model;
public class DatosProfesor {
    public String nombre;
    public String correo;
    public int numeroCel;
    
    public DatosProfesor(){
        
    }
    public DatosProfesor(String nombre, String correo, int numeroCel){
        this.nombre = nombre;
        this.correo = correo;
        this.numeroCel = numeroCel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(int numeroCel) {
        this.numeroCel = numeroCel;
    }
    
    
}
