//method overloading: same method name but different parameters
// in method overloading function name is same but there paramters or return type should be different

public class compileTime {

    String name;
    int rollNo;


    public void printInfo(String name){   //in method overloading -> if parameters are same then there return type should be different 
        this.name=name;
        System.out.println("Name: "+name);
    }


    public void printInfo(int rollNo){
        this.rollNo=rollNo;
        System.out.println("Roll No: "+rollNo);
    }

    public void printInfo(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
        System.out.println("Roll No: "+rollNo+", Name: "+name);
    }
    

    public static void main(String[] args) {
       compileTime s1=new compileTime();
       s1.printInfo("Alice");   
       s1.printInfo(101);
       s1.printInfo(102, "Bob");   
    }
}
