import java.util.Scanner; 

public class problem82{
	public static void main(String[] args){
		final int rac = 4;
		Scanner s = new Scanner(System.in);
		double[][] num = new double[rac][rac];
		System.out.print("���ã�������һ��4x4�ĸ���������");
		for(int i = 0; i < rac; ++i)
			for(int j = 0; j < rac; ++j)
				num[i][j] = s.nextDouble();
		double sum = 0;
		for(int i = 0; i < rac; ++i)
			sum += num[i][i];
		System.out.println("�������Խ���Ԫ�صĺ�Ϊ:"+sum);
	}
}
