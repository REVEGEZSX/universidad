package universidad;
import java.util.*;
/**
 * 
 * @author BAÑO Y MELENDEZ
 */
public class Universidad {
    public static ArrayList <alumnos> AL = new ArrayList();
    public static ArrayList <administrativo> AD = new ArrayList();
    public static ArrayList <catedratico> CT = new ArrayList();
    public static ArrayList <planta> PL = new ArrayList();
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        boolean AC;
        boolean cc = true;
        String N,A,TD,D,FA,PR,C,CR,FC,AG,PF,FI,FF;
        int E,SE,Cont,ACN,CP;
        //alumnos
        while(cc == true)
        {
        System.out.println("ingrese el nombre");
        N = leer.next();
        System.out.println("ingrese el apellido");
        A = leer.next();
        System.out.println("ingrese el tipo documento");
        TD = leer.next();
        System.out.println("ingrese el documento");
        D = leer.next();
        System.out.println("ingrese la edad");
        E = leer.nextInt();
        System.out.println("ingrese la facultad");
        FA = leer.next();
        System.out.println("ingrese el programa");
        PR = leer.next();
        System.out.println("ingrese el semestre");
        SE = leer.nextInt();
        System.out.println("ingrese el codigo");
        C = leer.next();
        System.out.println("ingrese si esta activo, si=0, no=1");
        ACN = leer.nextInt();
            if(ACN == 0)
            {
                 AC = true;
            }
            else
            {
                AC = false;
            }
        AL.add(new alumnos(C,FA,PR,SE,TD,D,A,N,E,AC));
        System.out.println("Desea continuar, si=0, no=1");
        Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }
        }
        cc = true;
    //administrativo
    while(cc=true)
    {
        System.out.println("ingrese el nombre");
        N = leer.next();
        System.out.println("ingrese el apellido");
        A = leer.next();
        System.out.println("ingrese la fechaContrato");
        FC = leer.next();
        System.out.println("ingrese el Cargo");
        CR = leer.next();
        System.out.println("ingrese el tipo documento");
        TD = leer.next();
        System.out.println("ingrese el documento");
        D = leer.next();
        System.out.println("ingrese la edad");
        E = leer.nextInt();
        System.out.println("ingrese la facultad");
        FA = leer.next();
        System.out.println("ingrese el programa");
        PR = leer.next();
        System.out.println("ingrese el semestre");
        SE = leer.nextInt();
        System.out.println("ingrese el codigo");
        C = leer.next();
        System.out.println("ingrese si esta activo, si=0, no=1");
        ACN = leer.nextInt();
            if(ACN == 0)
            {
                 AC = true;
            }
            else
            {
                AC = false;
            }
        AD.add(new administrativo(CR,FC,TD,D,A,N,E,AC));
        System.out.println("Desea continuar, si=0, no=1");
        Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }
            
        }
    cc=true;
    //planta
    while(cc=true)
    {
        System.out.println("ingrese el nombre");
        N = leer.next();
        System.out.println("ingrese el apellido");
        A = leer.next();
        System.out.println("ingrese la fechaContrato");
        FC = leer.next();
        System.out.println("ingrese la cantidad de proyectos");
        CP = leer.nextInt();
        System.out.println("ingrese la profesion");
        PF = leer.next();
        System.out.println("ingrese la asignatura");
        AG = leer.next();
        System.out.println("ingrese el tipo documento");
        TD = leer.next();
        System.out.println("ingrese el documento");
        D = leer.next();
        System.out.println("ingrese la edad");
        E = leer.nextInt();
        System.out.println("ingrese la facultad");
        FA = leer.next();
        System.out.println("ingrese el programa");
        PR = leer.next();
        System.out.println("ingrese el semestre");
        SE = leer.nextInt();
        System.out.println("ingrese el codigo");
        C = leer.next();
        System.out.println("ingrese si esta activo, si=0, no=1");
        ACN = leer.nextInt();
            if(ACN == 0)
            {
                 AC = true;
            }
            else
            {
                AC = false;
            }
        PL.add(new planta(FC,CP,PF,AG,TD,D,A,N,E,AC));
        System.out.println("Desea continuar, si=0, no=1");
        Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        cc=true;
        //catedratico
    while(cc=true)
    {
        System.out.println("ingrese el nombre");
        N = leer.next();
        System.out.println("ingrese el apellido");
        A = leer.next();
        System.out.println("ingrese la fecha de inicio");
        FI= leer.next();
        System.out.println("ingrese la fecha final");
        FF = leer.next();
        System.out.println("ingrese la profesion");
        PF = leer.next();
        System.out.println("ingrese la asignatura");
        AG = leer.next();
        System.out.println("ingrese el tipo documento");
        TD = leer.next();
        System.out.println("ingrese el documento");
        D = leer.next();
        System.out.println("ingrese la edad");
        E = leer.nextInt();
        System.out.println("ingrese la facultad");
        FA = leer.next();
        System.out.println("ingrese el programa");
        PR = leer.next();
        System.out.println("ingrese el semestre");
        SE = leer.nextInt();
        System.out.println("ingrese el codigo");
        C = leer.next();
        System.out.println("ingrese si esta activo, si=0, no=1");
        ACN = leer.nextInt();
            if(ACN == 0)
            {
                 AC = true;
            }
            else
            {
                AC = false;
            }
        CT.add(new catedratico(FI,FF,PF,AG,TD,D,A,N,E,AC));
        System.out.println("Desea continuar, si=0, no=1");
        Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        for(int x=0;x<AL.size();x++)
        {
            System.out.println(AL.get(x).mostrar());
        }
        for(int x=0;x<CT.size();x++)
        {
            System.out.println(CT.get(x).mostrar());
        }
        for(int x=0;x<PL.size();x++)
        {
            System.out.println(PL.get(x).mostrar());
        }
        for(int x=0;x<AD.size();x++)
        {
            System.out.println(AD.get(x).mostrar());
        }
        cc=true;
        //set de tipo documento ALUMNOS
        while(cc=true)
        {
            int x = 0;
            System.out.println("ingrese la posicion del que quiere cambiar del alumno");
            x = leer.nextInt();
            System.out.println("ingrese el nuevo tipo de documento");
            AL.get(x).setTipoDcumento(leer.next());
            System.out.println("Desea continuar, si=0, no=1");
            Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        cc=true;
        //set de documento DE ALUMNOS
        while(cc=true)
        {
            int x = 0;
            System.out.println("ingrese la posicion del que quiere cambiar del alumno ");
            x = leer.nextInt();
            System.out.println("ingrese el nuevo documento");
            AL.get(x).setDocumento(leer.next());
            System.out.println("Desea continuar, si=0, no=1");
            Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        cc=true;
        //set de cargo DE ADMINISTRATIVO
        while(cc=true)
        {
            int x = 0;
            System.out.println("ingrese la posicion del que quiere cambiar del administrativo");
            x = leer.nextInt();
            System.out.println("ingrese el nuevo cargo");
            AD.get(x).setCargo(leer.next());
            System.out.println("Desea continuar, si=0, no=1");
            Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        cc=true;
        //set de documento DE CATEDRATICO
        while(cc=true)
        {
            int x = 0;
            System.out.println("ingrese la posicion del que quiere cambiar del catedratico");
            x = leer.nextInt();
            System.out.println("ingrese el nuevo documento");
            CT.get(x).setDocumento(leer.next());
            System.out.println("Desea continuar, si=0, no=1");
            Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        cc=true;
        //set de documento DE PLANTA
        while(cc=true)
        {
            int x = 0;
            System.out.println("ingrese la posicion del que quiere cambiar del docente de planta");
            x = leer.nextInt();
            System.out.println("ingrese el nuevo documento");
            PL.get(x).setDocumento(leer.next());
            System.out.println("Desea continuar, si=0, no=1");
            Cont = leer.nextInt();
            if(Cont == 0)
            {
                 cc = true;
            }
            else
            {
                cc = false;
            }  
        }
        for(int x=0;x<AL.size();x++)
        {
            System.out.println(AL.get(x).mostrar());
        }
        for(int x=0;x<CT.size();x++)
        {
            System.out.println(CT.get(x).mostrar());
        }
        for(int x=0;x<PL.size();x++)
        {
            System.out.println(PL.get(x).mostrar());
        }
        for(int x=0;x<AD.size();x++)
        {
            System.out.println(AD.get(x).mostrar());
        }
    }
}
