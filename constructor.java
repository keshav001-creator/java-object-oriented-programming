
public class constructor{
  
   
  public static class car{
  
    int seats;
	String name;
	
	car(){}   //default constructor- not called when a paramtersied constructor is already called
	
	car(int x,String s){
	   seats=x;
	   name=s;
	}
	
	void print(){
		System.out.println(seats+" "+name);
	}
  
  }

  public static void main(String[] args){
  
     car c1=new car(4,"honda");
	 c1.print();
  
  }

}