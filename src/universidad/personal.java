package universidad;

public class personal 
{
    protected String tipoDcumento, documento, apellidos, nombres;
    protected int edad;
    protected boolean activo;

    public personal(String tipoDcumento, String documento, String apellidos, String nombres, int edad, boolean activo) {
        this.tipoDcumento = tipoDcumento;
        this.documento = documento;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.edad = edad;
        this.activo = activo;
    }
    public String mostrarinfo()
    {   
        String resultado=" ";
        String estado;
        if(this.activo)
            estado = "activo";
        else 
            estado = "inactivo";
        resultado = tipoDcumento+"\t"+documento+"\t"+apellidos+"\t"+nombres+"\t"+edad+"\t"+estado;
        return resultado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
