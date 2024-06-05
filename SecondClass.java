package studenttribe;

import mypack.First;
import ourpack.FirstClass;
import yourpack.Second;

public class SecondClass extends FirstClass implements Second, First 
{
	public void method()
	{
		System.out.println("public method - SecondClass");
	}
	public void display()
	{
		System.out.println("this is from second class display method");
		Second.super.display();
		First.super.display();
		super.display();
		First.test();
		Second.test();
		System.out.println("display - SecondClass");
		
		
		
	}
	
	public static void main(String ar[])
	{
//		SecondClass obj = new SecondClass();
//		FirstClass obj1 = new SecondClass();                    //this also works
//		First obj = new SecondClass();
//		obj.show();
//		Second obj1 = new SecondClass();
//		obj1.demo();
//		Second.super.demo();                                  //this doesn't work to access super in static method
		SecondClass s1 = new SecondClass();
		s1.display();
		s1.method();
//		Second o1=new SecondClass();
		
	}
	
//output : 
//	this is from second class display method
//	display - Second Inheritance
//	display - First Inheritance
//	display - FirstClass
//	test-FirstInterface
//	test - Second Inheritance
//	display - SecondClass
//	public method - SecondClass
}
