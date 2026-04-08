class animal{
    public void eat(){
        System.out.println("eating...");
    }
}

class Dog extends animal{   //dog class inheriting properties of animal class
    public void eat(){   // this is method overriding -> run time polymorphism as method behavior is changing
        System.out.println("barking...");
    }
}

class cat extends animal{   //cat class inheriting properties of animal class
    public void eat(int x){ // this is method overloading -> compile time polymorphism same method name but different parameters
        System.out.println("eating " + x + " units...");
    }
}

public class singleLevel {
    public static void main(String[] args) {
        
    }
}
