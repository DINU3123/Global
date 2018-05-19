class  innermethod 
{
	void m1 (int a,char b){
		System.out.println("Heloow world");
	}
    void m1 (int a,char b){
		System.out.println("m2 method");
	}
   public static void main(String[] args) 
	{
      innermethod t = new innermethod();
	  t.m1(10,'c');
	  t.m2(10,'c');
	}
}