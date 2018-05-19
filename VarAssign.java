public class VarAssign
{
	int a=100;
	int b=10;

	static void m1(){
	VarAssign t = new VarAssign();
	System.out.println("Method1 Output:"+t.a);
	System.out.println("Method1 Output:"+t.b);
	}

	static void m2(){
    VarAssign t = new VarAssign();
	System.out.println("Method2 Output:"+t.a);
	System.out.println("Method2 Output:"+t.b);

	}
	public static void main(String[] args) 
	{
		
        m1();
		VarAssign.m2();
	}
}
