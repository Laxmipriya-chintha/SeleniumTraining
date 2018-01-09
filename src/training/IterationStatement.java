package training;

public class IterationStatement {

	void While()
	{
	int n = 10;
    while (n > 0) {
        System.out.println("tick " + n);
        n--;
    }
	}
	int DoWhile(int a)
	{
		do {
            System.out.println("tick " + a);
            a--;
        } while (a > 0);
		return a;
	}
	void For()
	{
		int b;
        for (b = 10; b > 0; b--) System.out.println("number " + b);
	}
	public static void main(String[] args) {
	
		IterationStatement Ref = new IterationStatement();
		Ref.While();
		Ref.DoWhile(11);
		Ref.For();

	}

}
