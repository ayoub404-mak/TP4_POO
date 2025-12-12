//------------------PARTIE 1---------------------------

interface A {
    default void methodefault(){
        System.out.println("la method de  A");
    }
}

interface B {
    default void methodefault(){       
        System.out.println("la method de  B");
}
}
class  C implements A,B{
    public void methodefault(){
        System.out.println("la method de class C");
    }
}


//-------------------------------------PARTIE 2------------------------------
public class Parent {
    public void calcul(){
        System.out.println("hello je suis le pere");
    }
}
interface  Calculateur {
    default void calcul(){
        System.out.println("je suis interface");
    }
}



class Enfant extends Parent implements Calculateur{
    public static void main(String[] args) {
        Enfant e =new Enfant();
        e.calcul();//---> APPELLE A SUPER CLASSE
        //common on on fais la appelle a un method dans interface
      
    }  
   
}
