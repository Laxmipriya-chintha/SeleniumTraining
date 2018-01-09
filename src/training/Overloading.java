package training;

public class Overloading {

	int add(int a, int b) 
    {
        return a+b;
    }
    int add(int a, int b, int c) 
    {
        return a+b+c;
    }
   
	public static void main(String[] args) {
		Overloading obj = new Overloading();
    	System.out.println("Sum of two numbers: "+obj.add(20, 21));
    	System.out.println("Sum of three numbers: "+obj.add(20, 21, 22));
    	
	}

}
