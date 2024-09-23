package javaPractice;
//instance  members (variable,block )execution order first come first serve)
//at last main method  will execute 
//aftter static members executionJvm will check any java statement is there or not.
//if statement is there an execute that if not then don't do any thig.
//instance 0 se start hota hai.
//public class ExecuteMethod {
	public class ExecutionOrder {
		static {
			System.out.println("static block2");
			}
	int a=10;
	int b=m2();
	static int c=30;//
	static int d=m3();
	{
		System.out.println("instance block");}
	static {
		System.out.println("static block");
	}
	void m1() {
		System.out.println("m1");
	}
	int m2() {
		
		
		System.out.println("m2");
		return 50;
	}
	static int m3() {
		
		System.out.println(d);
		System.out.println( "m3");
		return 60;
	}
	static void m4 () {
		System.out.println("m4"); 
	}
	public static void main(String[] args) {
		System.out.println("nikki");//FCFS phele ye chlega 
	ExecutionOrder Exe1 = new ExecutionOrder();
	System.out.println("main  method  started");
	//ExecutionOrdero1 =new ExecutionOrder();
	System.out.println("main method finished");
	} 
	static {
		System.out.println("static block 3 : "+d);
		}
	ExecutionOrder(){
		System.out.println( "constructor ");
		}
	}
//constructor last me hoga 
