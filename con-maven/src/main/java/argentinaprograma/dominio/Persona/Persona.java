package argentinaprograma.dominio.Persona;

public class Persona {
    private String Nombre;
    private  String Apellido;

    private String documento;
    private TipoDocumento tipoDocumento;
    private int cantDiasPresentes;



    public Persona(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }
    public String Presentate(){ return "Mi nombre es " + this.Nombre + " " + this.Apellido; }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCantDiasPresentes() {
        return cantDiasPresentes;
    }

    public void setCantDiasPresentes(int cantDiasPresentes) {
        this.cantDiasPresentes = cantDiasPresentes;
    }
}
