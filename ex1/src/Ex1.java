abstract class Personne{
    private String nom;
    private int age;
    Personne(String nom,int age){
        this.nom=nom;
        this.age=age;
    }
    abstract void afficherRole();
    public void sePresenter(){
        System.out.print("nom : "+nom+" | age : "+age);
    }
}
    class Enseignant extends Personne {
    private String Role;

    Enseignant(String nom,int age){
        super(nom,age);
        Role="Enseignant";
    }
    void afficherRole (){
        sePresenter();
        System.out.print(" | Role : "+Role+"\n");
    }
}

    class Etudiant extends Personne  {
    private String Role;

    Etudiant(String nom,int age){
        super(nom,age);
        Role="Etudiant";
    }
    void afficherRole (){
        sePresenter();
        System.out.print(" | Role : "+Role+"\n");
    }
}
public class Ex1 {
    public static void main(String[] ars){
        Etudiant e1=new Etudiant("ali",13);
        Enseignant e2 = new Enseignant("mostafa",33);
        e1.afficherRole();
        e2.afficherRole();
        //Personne p= new Etudiant("hel", 0); --> possible
        //Personne p= new Personne();         --> impossible canot be type
    }
}
