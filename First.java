package mypack;

public interface First 
{
	void show();
	default void display()
	{
		System.out.println("display - First Inheritance");
	}
	static void test()
	{
		System.out.println("test-FirstInterface");
	}
	private void method()
	{
		System.out.println("private method - First");
	}
}
