//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Sort.java
public class Sort
{
  //Description: Uses the bubble sort method to sort elements in an array in ascending order.
  //Post: Elements in arr sorted in ascending order
  public static void bubbleSort(int[] arr)
  {
    for(int pass=1;pass<arr.length;++pass)
      for(int j=0;j<arr.length-pass;++j)
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
  }
  //Description: Uses the bubble sort method to sort elements in an array in descending order.
  //Post: Elements in arr sorted in descending order
  public static void bubbleSortD(int[] arr)
  {
    for(int pass=1;pass<arr.length;++pass)
      for(int j=0;j<arr.length-pass;++j)
        if(arr[j]<arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
  }
  //Description: Uses the selection sort method to sort elements in an array in ascending order.
  //Post: Elements in arr sorted in ascending order
  public static void selectionSort(int[] arr)
  {

    for (int pass=0;pass<arr.length-1;++pass)
    {
    int min=pass;
      for (int j =pass+1; j<arr.length;++j)
        if (arr[j] < arr[min]) min=j;
        int temp = arr[min];
        arr[min] = arr[pass];
        arr[pass] = temp;
    }
  }
  //Description: Uses the selection sort method to sort elements in an array in descending order.
  //Post: Elements in arr sorted in descending order
  public static void selectionSortD(int[] arr)
  {
    for(int pass=0;pass<arr.length-1;++pass)
    {
      int max=pass;
      for(int j=pass+1;j<arr.length;++j)
        if(arr[j]>arr[max]) max=j;
      int temp=arr[max];
      arr[max]=arr[pass];
      arr[pass]=temp;
    }
  }
  //Description: Uses the insertion sort method to sort elements in an array in ascending order.
  //Post: Elements in arr sorted in ascending order
  public static void insertionSort(int[] arr)
  {
    for(int pass=1;pass<arr.length;++pass)
    {
      int pulled=arr[pass];
      int i=pass-1;
      while(i>=0)
      {
        if(arr[i]>pulled) arr[i+1]=arr[i];
        else break;
        i--;
      }
      arr[i+1]=pulled;
    }
  }
  //Description: Uses the insertion sort method to sort elements in an array in descending order.
  //Post: Elements in arr sorted in descending order
  public static void insertionSortD(int[] arr)
  {
    for(int pass=1;pass<arr.length;++pass)
    {
      int pulled=arr[pass];
      int i=pass-1;
      while(i>=0)
      {
        if(arr[i]<pulled) arr[i+1]=arr[i];
        else break;
        i--;
      }
      arr[i+1]=pulled;
    }
  }
}
