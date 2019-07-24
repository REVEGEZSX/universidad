package universidad;
/**
 * 
 * @author BAÑO Y MELENDEZ
 */
public class planta extends docente {
    private String fechaContrato;
    private int cantProyectos;

    public planta(String fechaContrato, int cantProyectos, String profesion, String asignatura, String tipoDcumento, String documento, String apellidos, String nombres, int edad, boolean activo) {
        super(profesion, asignatura, tipoDcumento, documento, apellidos, nombres, edad, activo);
        this.fechaContrato = fechaContrato;
        this.cantProyectos = cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }
    
    public String mostrar()
    {
        String resultado="";
        resultado = mostrarinfo()+"\t"+profesion+"\t"+asignatura+"\t"+fechaContrato+"\t"+cantProyectos;
        return resultado;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
}
