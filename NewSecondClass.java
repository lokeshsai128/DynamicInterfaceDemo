package studenttribe;

import mypack.First;
import mypack.NewFirst;
import ourpack.NewFirstClass;
import yourpack.NewSecond;
import yourpack.Second;

public class NewSecondClass extends NewFirstClass implements NewSecond 
{
	public void method()
	{
		System.out.println("public method - SecondClass");
	}
	public void display()
	{
		System.out.println("this is from second class display method");
		NewSecond.super.display();
		NewFirst.display();                        //only here changed i.e we are not using the super class
		super.display();
		First.test();
		Second.test();
		System.out.println("display - SecondClass");
	}
	public static void main(String[] args) {
//		NewSecond s1 = new NewSecondClass();              //this is used when we keep method() in newsecond interface for overloading it in this class
//		NewFirst s1 = new NewSecondClass();               //this works only if the methods are called by interfacename as NewFirst
//		NewFirst.display();                               
//		NewFirst.method();                                //this doesn't work as the method in newfirst interface is private
		NewSecondClass s1 = new NewSecondClass();
		s1.method();
		s1.display();
	}
}

//output : 
//his is from second class display method
//display - Second Inheritance
//display - First Inheritance
//display - FirstClass
//test-FirstInterface
//test - Second Inheritance
//display - SecondClass
//public method - SecondClass

