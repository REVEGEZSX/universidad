package universidad;
public class Universidad {

    public static void main(String[] args) 
    {
        alumnos A11;
        administrativo AD1;
        catedratico CA1;
        planta PL1;
        A11 = new alumnos("1234","Cocina","Nacional",5,"CC","1004373717","Melendez","Stiven",19,true);
        System.out.println(A11.mostrar());
        AD1 = new administrativo("Contador","2019-03-08","CC","100454994","Vergara","Mauricio",25,true);
        System.out.println(AD1.mostrar());
        CA1 = new catedratico("2005-03-01","2018-05-01","CC","4559787","Ingeniero","Calculo","Ardila","William",35,false);
        System.out.println(CA1.mostrar());
        PL1 = new planta("2019-03-01",20,"CC","4559787","Chef","Oriental","Ortiz","Daniel",55,true);
        System.out.println(PL1.mostrar());
    }
    
}
