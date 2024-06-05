package yourpack;

public interface Second 
{
	void show();
	default void display()
	{
		System.out.println("display - Second Inheritance");
	}
	static void test()
	{
		System.out.println("test - Second Inheritance");
	}
}
