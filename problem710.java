import java.util.Scanner; 

public class problem710{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    double[] array = new double[10];
	    System.out.print("���ã�������10�����֣�");
	    for (int i = 0; i < array.length; i++) {
	        array[i] = s.nextDouble();
	    }
	    System.out.print("��СԪ�ص��±��ǣ�" + minIndex(array));
	}
	 
	private static int minIndex(double[] array) {
	    int minIndex = 0;
	    for (int i = 0; i < array.length; i++) {
	        if (array[minIndex] > array[i]) {
	            minIndex = i;
	        }
	    }
	    return minIndex;
	}

}