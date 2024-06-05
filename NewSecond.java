package yourpack;
import mypack.NewFirst;

public interface NewSecond extends NewFirst
{
	void show();
	void method();
	default void display()
	{
		System.out.println("display - Second Inheritance");
	}
	static void test()
	{
		System.out.println("test - Second Inheritance");
	}
}
