class X{}
class Y{}
class Student{}
class Emp{}
class  test 
{
	void m1 (X x,Emp e){
		System.out.println("Heloow world");
	}
	static void m2 (Y y,Student s){
		System.out.println("m2 method");
	}
   public static void main(String[] args) 
	{
      test t = new test();
	  Emp xx = new Emp();
	  X x1 = new X();
      t.m1(x1,xx);//t.m1(xx,x1)----will_result in Incompatible types--interchange of values in param
	  Student s = new Student();
	  Y y = new Y();
	  test.m2(y,s);
	}
}
