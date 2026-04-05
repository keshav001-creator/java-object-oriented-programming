

class student{
	private int rNo;
	String name;
	float cgpa;
	
	void setRollNo(int x){   //setter for private variable
		rNo=x;
	}
	
	int getRollNo(){       //getter for private variable
		return rNo;
	}

}


class setter{
	public static void main(String[] args){
		
		student s1=new student();
		s1.name="Aditya";
	    s1.setRollNo(20);	
		System.out.println(s1.name);
		
		System.out.println(s1.getRollNo());
	} 
}