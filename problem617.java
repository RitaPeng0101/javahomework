import java.util.Scanner; 

public class problem617{
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("���ã������һ������n�����ݴˣ���������һ��nxn�ľ���Ԫ��Ϊ�����0��1�������룺");
	    int n = s.nextInt();
	    printMatrix(n);
	}
	 
	public static void printMatrix(int n) {
	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= n; j++) {
	            System.out.print(Math.round(Math.random()) + " ");
	        }
	        System.out.println();
	    }
	}
}
