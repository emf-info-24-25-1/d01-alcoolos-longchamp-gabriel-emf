public class Ami {
    private final String nom;
    private final int bieresRestantes;

    public Ami(String nom, int bieresRestantes) {
        this.nom = nom;
        this.bieresRestantes = bieresRestantes;
    }

    public String getNom() {
        return nom;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }

    public static void boitUneBiere() {
        if (bieresRestantes > 0) {
            bieresRestantes --;
            System.out.println(nom + "a bu une bière, il lui reste : " + bieresRestantes + "bières");
        } else {
            System.out.println(nom + "est déjà saoul et ne oeut plus boire de bières.");
        }
    }
}
