package training;

public class Conditionstatement {

	void IfElse()
	{
		int a = -987;
		if(a>0)
		{
			System.out.println(a+ " is a positive number");
		}		
		else
		{
			System.out.println(a+ " is a negative number");
		}
	}
	int IfElseIf(int a)
	{
		if(a>0)
		{
			System.out.println(a+ " is a positive number");
		}		
		else if(a<0)
		{
			System.out.println(a+ " is a negative number");
		}
		else
		{
			System.out.println(a+ " Number is Zero");
		}
		return a;
	}
	void NestedIfElse()
	{
	int n1 = -1, n2 = 8, n3 = 5, largestNumber;
	 
    if (n1 >= n2) {
       if (n1 >= n3) {
         largestNumber = n1;
       }
       else {
         largestNumber = n3;
       }
    }
    else {
       if (n2 >= n3) {
         largestNumber = n2;
       }
       else {
         largestNumber = n3;
       }
    }

    System.out.println("Largest number is " + largestNumber);
}
	public static void main(String[] args) {
		int a = 123;
		if(a>0)
		{
			System.out.println(a+ " is a positive number");
		}
		Conditionstatement Ref = new Conditionstatement();
		Ref.IfElse();
		Ref.IfElseIf(0);
	Ref.NestedIfElse();
	}

}
