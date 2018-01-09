package training;

class OverridingMain extends OverRiding
{
    public int speedLimit()
    {
        return 150;
    }
	public static void main(String[] args) 
	{
		OverRiding obj = new OverridingMain();
    	int num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);

	}

}
