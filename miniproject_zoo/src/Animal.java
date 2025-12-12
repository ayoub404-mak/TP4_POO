public abstract class Animal {
    protected String nom;
    protected int age;

    

    public void sePresent(){
        System.out.println("this is sepresent");
    }

    abstract void crier();

}

//----------------------------------------------------------------------
interface Carnivore {
    void methodeabstrac1();
    default void methodefault(){
        System.out.println("this interface Carnivore");
    }
}
interface Herbivore {
    void methodeabstrac2();
    default void methodefault(){
        System.out.println("this interface Herbivoc");
    }
}

//---------------------------------------------------------------------
class Lion extends Animal implements Carnivore {
    
    Lion(String nom,int age){
        this.nom=nom;
        this.age=age;
    }
    public void crier(){
        System.out.println("this abstraction of lion");
    }
    public void methodeabstrac1(){
        System.out.println("this is implimentation in lion");
    }
}
//-----------------------------------------------------------------------
class Vache extends Animal implements Herbivore{
   
    Vache(String nom,int age){
        this.nom=nom;
        this.age=age;
    }
    public void crier(){
        System.out.println("this abstraction of vache");
    }
    public void methodeabstrac2(){
        System.out.println("this is implimentation in vach");
    }
}
//--------------------------------------------------------------------------

class Ours extends Animal implements Carnivore,Herbivore {
    
    Ours(String nom,int age){
        this.nom=nom;
        this.age=age;
    }
    public void crier(){
        System.out.println("this abstraction of Ours");
    }
    public void methodeabstrac1(){
        System.out.println("this is implimentation in OUrs for first abs ");
    }
    public void methodeabstrac2(){
        System.out.println("this is implimentation in OUrs for second abs");
    }
    @Override
    public void methodefault() {
        System.out.println("new defaulte methode override in ours ");
        //Carnivore.super.methodefault();//--> est impossible de faire sa dans main
    }
    
}

//------------------------------------------------------------------------------------
class Main {

    public static void main(String[] args) {
        Ours a = new Ours("our",13);
        a.crier();
        a.methodeabstrac1();
        a.methodefault();
        System.out.println("---------------------------------------------");
        a.sePresent();
       
    }


    
}

