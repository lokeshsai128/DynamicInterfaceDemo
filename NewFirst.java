package mypack;

public interface NewFirst 
{
	void show();
	static void display()
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
