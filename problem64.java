import java.util.Scanner; 

public class problem64{
  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("���ã�������һ��������");
	    int num = s.nextInt();
	    System.out.print("�������ķ������ǣ�" + reverse(num));
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
