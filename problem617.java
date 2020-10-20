import java.util.Scanner; 

public class problem617{
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("您好！请给出一个整数n，根据此，将会生成一个nxn的矩阵，元素为随机的0或1。请输入：");
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
