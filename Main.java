class Main {
  public static void main(String[] args) {
    int[] list = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    int[] unsortedList = {15, 10, 55, 20, 45, 30, 35, 40, 65, 50};
    int target = 25;
    System.out.println(binarySearch(list, target));
    selectionSort(unsortedList);
    print(unsortedList);
    
  }

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

  public static void print(int[] list){
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " ");
    }
  }
}