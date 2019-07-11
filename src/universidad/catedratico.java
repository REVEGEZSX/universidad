package universidad;

public class catedratico extends docente{
    private String fechaInicio;
    private String fechaFin;

    public catedratico(String fechaInicio, String fechaFin, String profesion, String asignatura, String tipoDcumento, String documento, String apellidos, String nombres, int edad, boolean activo) {
        super(profesion, asignatura, tipoDcumento, documento, apellidos, nombres, edad, activo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public String mostrar()
    {
        String resultado = "";
        resultado = mostrarinfo()+"\t"+profesion+"\t"+asignatura+"\t"+fechaInicio+"\t"+fechaFin;
        return resultado;
    }
}
