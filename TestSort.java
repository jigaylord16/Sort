//Jacob Gaylord
//jigaylord16@ole.augie.edu
//TestSort.java
public class TestSort
{
  //Description: Tests 3 kinds of sorting methods in java bubble, selection, and insertion.
  //Output: The elements of an array sorted in ascending and descending order for each method.
  public static void main(String[] args)
  {
    int[] arr={3,5,6,2,4};
    Sort.bubbleSort(arr);
    for(int i=0;i<arr.length;++i)
      System.out.print(arr[i]+" ");
    System.out.println();
    Sort.bubbleSortD(arr);
    for(int i=0;i<arr.length;++i)
      System.out.print(arr[i]+" ");
    System.out.println();
    Sort.selectionSort(arr);
    for(int i=0;i<arr.length;++i)
      System.out.print(arr[i]+" ");
    System.out.println();
    Sort.selectionSortD(arr);
    for(int i=0;i<arr.length;++i)
      System.out.print(arr[i]+" ");
    System.out.println();
    Sort.insertionSort(arr);
    for(int i=0;i<arr.length;++i)
      System.out.print(arr[i]+" ");
    System.out.println();
    Sort.insertionSortD(arr);
    for(int i=0;i<arr.length;++i)
      System.out.print(arr[i]+" ");
    System.out.println();
  }
}
