public class VarAssign2
{
	int a=100;
	int b=10;
	static int c=10;
	static int d=20;

	void m1(){
// Acessing instance variables in instance method directly 
	System.out.println("Method1 Instance Output:"+a);
	System.out.println("Method1 Instance Output:"+b);
//	VarAssign2 t = new VarAssign2();
// Acessing static variables in instance method using class name. 
	System.out.println("Method1 static Output:"+VarAssign2.c);
	System.out.println("Method1 static Output:"+VarAssign2.d);
	}

	static void m2(){
// Acessing instance variables in static method by using object
    VarAssign2 t = new VarAssign2();
	System.out.println("Method2 Instance Output:"+t.a);
	System.out.println("Method2 Instance Output:"+t.b);
// Acessing static variables in static method by using class name.
	System.out.println("Method2 static Output:"+VarAssign2.c);
	System.out.println("Method2 static Output:"+VarAssign2.d);

	}
	public static void main(String[] args) 
	{
		VarAssign2 t = new VarAssign2();
        t.m1();   
		m2();
	}
}
