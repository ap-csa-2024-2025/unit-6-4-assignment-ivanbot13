import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] hasDupes = {1, 6, 3, 43, 21, 76, 2, 9, 5, 4, 21, 12, 16};
    int[] noDupes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    System.out.println(hasDuplicates(hasDupes));
    System.out.println(hasDuplicates(noDupes));
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i = 0; i < arr.length;i++)
    {
      String target = arr[i];
      if (target.length() == targetLength)
      {
        count++;
      } 
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length;i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++){
      for (int q = i+1; q < arr.length; q++){
        if (arr[q] == arr[i]){
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    int mode = arr[0];
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++){
      count = 0;
      for (q = i; q < arr.length; q++){
        if (arr[q] == arr[i]){
          count++;
        }
      }
      if (count > maxCount){
        maxCount = 0;
        mode = arr[q];
      }
    }
    return mode;
  }
}
