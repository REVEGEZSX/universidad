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

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public void setTipoDcumento(String tipoDcumento) {
        this.tipoDcumento = tipoDcumento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     *
     * @param apellidos
     */
    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
