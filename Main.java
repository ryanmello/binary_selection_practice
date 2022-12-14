class Main {
  public static void main(String[] args) {
    int[] list = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    int[] unsortedList = {15, 10, 55, 20, 45, 30, 35, 40, 65, 50};
    int target = 25;
    System.out.println(binarySearch(list, target));
    selectionSort(unsortedList);
    print(unsortedList);
    System.out.println();
  }

  /*
  * the binarySerach function calls a binary search algorithm
  * on a list of integers when given a target. the alorithm only works
  * if the list is sorted (call the selectionSort() function to sort 
  * the array. the function will traverse through a portion of the sorted
  * array to find its target value.
  * @param int[] list
  * @param int target
  */
  public static int binarySearch(int[] list, int target){
    int min = 0;
    int max = list.length - 1;

    while(min <= max){
      int mid = (min + max) / 2;
      if(target == list[mid]){
        return mid;
      } else if(target > list[mid]){
        min = mid + 1;
      } else if(target < list[mid]){
        max = mid - 1;
      }
    }
    return -1;
  }
  
  /*
  * the selectionSort function calls a selection sort alorithm
  * on an array passed in as a parameter. the function loops through 
  * the entire array and swaps the indices of elements in order to 
  * put them in a sorted order. the algorithm runs in O(N^2) time complexity.
  * @param int[] list
  */
  public static void selectionSort(int[] list){
    for(int i = 0; i < list.length; i++){
      int smallestIndex = i;
      for(int j = i + 1; j < list.length; j++){
        if(list[smallestIndex] > list[j]){
          smallestIndex = j;
        }
      }
      int temp = list[smallestIndex];
      list[smallestIndex] = list[i];
      list[i] = temp;
    }
  }

  /*
  * the print method prints every element in an array
  * @param int[] list
  */
  public static void print(int[] list){
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " ");
    }
  }
}