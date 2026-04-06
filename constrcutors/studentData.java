public class studentData {
    

    public static class marks{
        String name;
        int rollNo;
        int[]marks;
        
        marks(int s){
            marks=new int[s];
        }
    } 

    public static void main(String[] args) {
       
        marks s1=new marks(3);

        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=70;


        for(int i=0; i<s1.marks.length; i++){
            System.out.println("Marks: "+s1.marks[i]);
        }
    }
}
