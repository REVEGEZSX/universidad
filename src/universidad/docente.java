package universidad;
/**
 * 
 * @author BAÑO Y MELENDEZ
 */
public class docente extends personal{
    protected String profesion;
    protected String asignatura;

    public docente(String profesion, String asignatura, String tipoDcumento, String documento, String apellidos, String nombres, int edad, boolean activo) {
        super(tipoDcumento, documento, apellidos, nombres, edad, activo);
        this.profesion = profesion;
        this.asignatura = asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
