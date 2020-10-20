import java.util.Scanner; 

public class problem64{
  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("您好！请输入一个整数：");
	    int num = s.nextInt();
	    System.out.print("该整数的反向数是：" + reverse(num));
  }
  public static int reverse(int num) {
	 int result = 0;
	 while (num != 0) {
	   result = (result * 10) + num % 10;
	   num /= 10;
	 }
	 return result;
  }
}
