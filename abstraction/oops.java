package abstraction;
// constructor chaining in abstraction- when we create an object of the child class, the constructor of the parent class is called first and then the constructor of the child class is called. This is called constructor chaining.
abstract class animal{     // abstract class cannot be instantiated, it can only be inherited
    abstract void walk();
    public animal(){
        System.out.println("this is an animal");
    }
}

class horse extends animal{

    horse(){
        System.out.println("this is a horse");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class duck extends animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class oops {
    public static void main(String[] args) {
        // animal a = new animal(); // cannot create object of abstract class
        // a.walk();

        horse h = new horse();
        h.walk();

        duck d = new duck();
        d.walk();
    }
}

