package Applet;

public class Parent {

}
class Child extends Parent
{
	
}
class Test 
{
	public static void main(String args[])
	{
		Child cobj = new Child();
		if(cobj instanceof Child)
			System.out.println("cobj is instance of child");
		else
			System.out.println("cobj is not instance of child");
		if(cobj instanceof Parent)
			System.out.println("cobj is instance of Parent");
		else
			System.out.println("cobj is not instance is parent");
		if(cobj instanceof Object)
			System.out.println("cobj is instance Object");
		else
			System.out.println("cobj is not instance of object");
		
		
	}
}
