package Model;
public class Materia{
    
    private DatosProfesor dprof;
    private String Nombre_materia;
    private int Credito;
    private String salon_clases;
    private String horaE;
    private String horaS;
    private int Index;
    private double porcentaje;
    private double corte1;
    private double corte2;
    private double corte3;
    //CONSTRUCTORES
    public Materia(){
        
    }
    public Materia(int Index, String Nombre_materia, int Credito, DatosProfesor dprof, String salon_clases, String horaE, String horaS){
        this.dprof = dprof;
        this.Index = Index;
        this.Nombre_materia = Nombre_materia;
        this.Credito = Credito;
        this.salon_clases = salon_clases;
        this.horaE = horaE;
        this.horaS = horaS;
    }
    public Materia(String Nombre_materia){
        this.Nombre_materia = Nombre_materia;
    }
    public Materia(double corte1, double corte2, double corte3){
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
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

    public String getHoraE() {
        return horaE;
    }

    public void setHoraE(String horaE) {
        this.horaE = horaE;
    }

    public DatosProfesor getDprof() {
        return dprof;
    }

    public void setDprof(DatosProfesor dprof) {
        this.dprof = dprof;
    }

    public String getHoraS() {
        return horaS;
    }

    public void setHoraS(String horaS) {
        this.horaS = horaS;
    }

    public int getCredito() {
        return Credito;
    }

    public void setCredito(int Credito) {
        this.Credito = Credito;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getCorte1() {
        return corte1;
    }

    public void setCorte1(double corte1) {
        this.corte1 = corte1;
    }

    public double getCorte2() {
        return corte2;
    }

    public void setCorte2(double corte2) {
        this.corte2 = corte2;
    }

    public double getCorte3() {
        return corte3;
    }

    public void setCorte3(double corte3) {
        this.corte3 = corte3;
    }
    
    
}
