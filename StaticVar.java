public class   StaticVar

{
	static int a=100;
	static int b=200;
	public static void main(String[] args) 
	{
		System.out.println(StaticVar.a);
		System.out.println(StaticVar.b);
        StaticVar sv=new StaticVar();
		sv.m1();
        
	}

 void m1(){
 
 		System.out.println(StaticVar.a);
		System.out.println(StaticVar.b);
 
 }

}
