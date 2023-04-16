package String_API;

class A 
{
	public void show() {
		System.out.println("In class A");
	}
	public void config() {
		System.out.println("Inside config A");
	}
}

class B extends A{
	public void show() {
		System.out.println("In class B");
	}
	public void config() {
		System.out.println("Inside config B");
	}

}

class C extends A{

	public void show() {
		System.out.println("In class C");
	}
	public void config() {
		System.out.println("Inside config C");
	}
}

public class RuntimePolyMorphism {

	public static void main(String[] args) 
	{
		A a = new B();//assignment of reference takes place at run time
		a.show();
		a.config();
		a=new C();
		a.show();//Dynamic method dispatch.
		a.config();;
		
		
		
		
	}

}
