import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("How many elements will the array have? ");
      int n = scan.nextInt();

      int[] list = new int[n];
      double sum =0.0;

      for(int i=0;i<list.length;i++){
          System.out.print("["+i+"] = " );
          list[i]=scan.nextInt();
          sum+=list[i];

      }

      double avarage = sum/list.length;
      System.out.println("Average of the elements of the array : " + avarage);


    }
}

