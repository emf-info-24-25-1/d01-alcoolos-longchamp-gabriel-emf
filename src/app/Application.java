package app;

public class Application {
    public static void main(String[] args) {
        Ami ami1 = new Ami("Luc", 5);
        Ami ami2 = new Ami("Marie", 3);
        Ami ami3 = new Ami("Paul", 2);

       
        System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBieresRestantes() + " bières.");
        System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBieresRestantes() + " bières.");
        System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBieresRestantes() + " bières.");

       
        ami1.boitUneBiere();
        ami2.boitUneBiere();
        ami3.boitUneBiere();
        ami3.boitUneBiere();
        ami3.boitUneBiere(); 
        
        System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBieresRestantes() + " bières.");
        System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBieresRestantes() + " bières.");
        System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBieresRestantes() + " bières.");
    }
}




