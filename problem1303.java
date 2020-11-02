import java.util.ArrayList;
import java.util.Scanner;

public class problem1303 {
  public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<Number>();
    System.out.println("请输入五个整数构成待排序的ArrayList：");
    Scanner input=new Scanner(System.in);
    int i_1=input.nextInt();
    int i_2=input.nextInt();
    int i_3=input.nextInt();
    int i_4=input.nextInt();
    int i_5=input.nextInt();
    list.add(i_1);
    list.add(i_2);
    list.add(i_3);
    list.add(i_4);
    list.add(i_5);
    sort(list);
    
    for (int i = 0; i < list.size(); i++) 
      System.out.print(list.get(i) + " ");
  }

  public static void sort(ArrayList<Number> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      Number currentMin = list.get(i);
      int currentMinIndex = i;

      for (int j = i + 1; j < list.size(); j++) {
        if (currentMin.doubleValue() > list.get(j).doubleValue()) {
          currentMin = list.get(j);
          currentMinIndex = j;
        }
      }

      if (currentMinIndex != i) {
        list.set(currentMinIndex, list.get(i));
        list.set(i, currentMin);
      }
    }
  }
}
