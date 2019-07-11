package universidad;

public class administrativo extends personal{
    private String cargo;
    private String fechaContrato;

    public administrativo(String cargo, String fechaContrato, String tipoDcumento, String documento, String apellidos, String nombres, int edad, boolean activo) {
        super(tipoDcumento, documento, apellidos, nombres, edad, activo);
        this.cargo = cargo;
        this.fechaContrato = fechaContrato;
    }
    
    public String mostrar()
    {
        String resultado="";
        resultado = mostrarinfo()+"\t"+cargo+"\t"+fechaContrato;
        return resultado;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
