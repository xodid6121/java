package day8;

public class InheritanceEx1 {

	public static void main(String[] args) {
			Child c1 = new Child();
			c1.print2();
		
	}

}

class Child extends Parent{
	private int e;
	point p1 =new point();
	public void print2() {
	//print();
		System.out.printf("%d,%d\n",p1.x,p1.y);
		System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%d\n",a,b,c,getD(),e); 
		
	}
}
class Parent{
	public int a;
	protected int b;
	int c; 
	private int d=10;
	public void print() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n",a,b,c,d);
	}
	public Parent(){}
	public Parent(int a,int b,int c, int d) {
		//super(); 
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
}

