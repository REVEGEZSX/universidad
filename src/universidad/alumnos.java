package universidad;

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
        String resultado ="";
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
    
}
