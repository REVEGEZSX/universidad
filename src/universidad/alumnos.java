package universidad;
/**
 * 
 * @author BAÑO Y MELENDEZ
 */
public class alumnos extends personal{
    private String codigo;
    private String facultad;
    private String programa;
    private int semestre;

    public alumnos(String codigo, String facultad, String programa, int semestre, String tipoDcumento, String documento, String apellidos, String nombres, int edad, boolean activo) {
        super(tipoDcumento, documento, apellidos, nombres, edad, activo);
        this.codigo = codigo;
        this.facultad = facultad;
        this.programa = programa;
        this.semestre = semestre;
    }
    public String mostrar()
    {
        String resultado =" ";
        resultado = mostrarinfo()+"\t"+codigo+"\t"+facultad+"\t"+programa+"\t"+semestre;
        return resultado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public void setTipoDcumento(String tipoDcumento) {
        this.tipoDcumento = tipoDcumento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

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

    @Override
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
