class A
{
   void A1()
   {
	  System.out.println("Inside A1 method");
   }
   void A2()
   {
	   System.out.println("Inside A2 method"); 
   }
   void A3()
   {
	   System.out.println("Inside A3 method");
   }
}
class B extends A
{
	void B1()
	   {
		System.out.println("Inside B1 method");
	   }
	void B2()
	   {
		System.out.println("Inside B2 method");
	   }
	
}
public class Inheritance {
	public static void main(String[] args) {
	B b1=new B();
	b1.A1();

	}

}
