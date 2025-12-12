public class Voiture implements Vehicule{
    private String marque;
    private int vitasse;
    private String pay;

    Voiture(String marque,int vitasse,String pay){
        this.marque=marque;
        this.vitasse=vitasse;
        this.pay=pay;
    }
    public void demarrer() {
        System.out.print("la voiture demarre ");
    }
     
    public void affich_info(){
        afficherMarque(marque);
        Vehicule.info(vitasse,pay);
    }
}
class Main2{
    public static void main(String [] args){
        Voiture v1= new Voiture("toyota",300,"japan");
        v1.affich_info();
    }
}
interface Vehicule {
    void demarrer();
    default void afficherMarque(String marque){
        System.out.print("Marque: "+marque);
    }
    static void info(int vitasse,String pay){
        System.out.println(" | vitesse: "+vitasse+" | pay: "+pay);
    }
    
}