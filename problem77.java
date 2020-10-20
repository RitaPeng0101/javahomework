public class problem77{
	public static void main(String[] args) {
	    int[] numarray = new int[100];
	    int[] numcount = new int[10];
	    int i = 0;
	    while (i < numarray.length) {
	        numarray[i] = (int) (Math.random() * 10);
	        System.out.print(numarray[i] + " ");
	        numcount[numarray[i]]++;
	        i++;
	        if (i % 10 == 0) {
	            System.out.println();
	        }
	    }
	    System.out.println("--------------------");
	    for (int j = 0; j < numcount.length; j++) {
	        System.out.print(j + " 出现了 ");
	        System.out.printf("%d%s\n", numcount[j], " 次.");
	    }
	}
}
