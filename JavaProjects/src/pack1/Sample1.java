package pack1;

public class Sample1 {

public static void main(String[] args) {
	Sample1 obj=new Sample1();
	System.out.println(obj.add(5,9));
	obj.show();
	Sample1.print();

	}
public int add(int a, int b ) {
		int c=a+b;
		return c;
	}
public void show()
{
	System.out.println("Meenu");
}

public static void print()
{
System.out.println("Hello")	;
}
}