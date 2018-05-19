//class Emp{}
class Methodobjects 
{
	Emp m1(){
		System.out.println("Hi");
		//Emp e = new Emp();
		return new Emp();
	}
	public static void main(String[] args) 
	{   Emp e = new  Methodobjects().m1();//Methodobjects t 
	     //= t.m1();
		System.out.println(e);
	}
}
