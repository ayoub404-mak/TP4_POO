public class CompteBancaire {
    private int numeroCompte;
    private int solde;
    static int compteur = 0;

    CompteBancaire(int numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        compteur += 1;
    }

    public static int getNombreComptes() {
        return compteur;
    }
}

    class test {
    public static void main(String[] agrs){
        CompteBancaire c1 = new CompteBancaire(133812,1000);
        System.out.println("c1 cont "+c1.compteur);

        CompteBancaire c2 = new CompteBancaire(3388,1000);
        System.out.println("c1 cont "+CompteBancaire.compteur);

        CompteBancaire c3 = new CompteBancaire(2443,1000);
        System.out.println("c1 cont "+CompteBancaire.compteur);

        System.out.println("count compt. "+CompteBancaire.getNombreComptes());
    }
}
