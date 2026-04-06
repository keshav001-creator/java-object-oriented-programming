public class thisKeyword {
    

     public static class marks{
        String name;
        int rollNo;
        int[]marks;
        
        marks(int s){
            marks=new int[s];
        }


        //this keyword is used to refer to the current object instance. It is used to differentiate between instance variables and parameters when they have the same name.
        marks(String name, int rollNo){
            this.name=name;                       
            this.rollNo=rollNo;
        }
    } 

    public static void main(String[] args) {
       
        marks s1=new marks(3);
        marks s2=new marks("Alice", 101);

        System.out.println("Name: " + s2.name);

        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=70;


        for(int i=0; i<s1.marks.length; i++){
            System.out.println("Marks: "+s1.marks[i]);
        }
    }

}
