import java.util.Scanner; 

public class problem82{
	public static void main(String[] args){
		final int rac = 4;
		Scanner s = new Scanner(System.in);
		double[][] num = new double[rac][rac];
		System.out.print("您好！请输入一个4x4的浮点数矩阵：");
		for(int i = 0; i < rac; ++i)
			for(int j = 0; j < rac; ++j)
				num[i][j] = s.nextDouble();
		double sum = 0;
		for(int i = 0; i < rac; ++i)
			sum += num[i][i];
		System.out.println("矩阵主对角线元素的和为:"+sum);
	}
}
