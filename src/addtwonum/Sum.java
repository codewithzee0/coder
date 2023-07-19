package addtwonum;

public class Sum {
	
	public   int addnumbers(int a , int b) {
		return a + b;
	}
	public static void main(String[]args) {
		int num1 = 5;
		int num2 =2;
		Sum sum =new Sum ();
		int add = sum.addnumbers(num1,num2);
		System.out.println(add);
	}
}
