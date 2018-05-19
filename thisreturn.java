//class Emp{}
class thisreturn 
{ 
	int a=100;
	int m1(int a){
		System.out.println("Hi");
		//Emp e = new Emp();
		return this.a;//instance variable
	}
		int m2(int a){
		System.out.println("m2");
		//Emp e = new Emp();
		return a;//local variable
	}
	public static void main(String[] args) 
	{   thisreturn t = new  thisreturn();
	    //Emp e = t.m1();
		//System.out.println(e);
         int x=  t.m1(10);
		 System.out.println("Instance variable is "+x);
		 int x1=  t.m2(1023);
		 System.out.println("local variable is "+x1);
	}
}
