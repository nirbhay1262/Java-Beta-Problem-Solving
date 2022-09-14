class Main {
  public static void main(String[] args) {
    // bubbleSort();
    
   // selectionSort();
    insertionSort();
  }
  public static void print(int[] arr ){
    for(int  i = 0; i <arr.length ;i++ ){
      System.out.print(arr[i ] +" ");
    }
  }
  public static void selectionSort(){
    int[] array = { 7, 8, 3, 5, 6, 1, 2 };
    for (int i = 0; i < array.length - 1; i++) {
      int smallest=i;
      for (int j = i+1; j < array.length; j++) {
       if(array[smallest]>array[j]){
         smallest=j;
       }
      }
      int temp= array[smallest];
          array[smallest ]= array[i];
          array[ i ]= temp;
    }
    print(array);
  }
  public static void insertionSort(){
    int[] array = { 7, 8, 3, 5, 6, 1, 2 };
    for(int i=1;i<array.length;i++){
      int curr= array[i];
      int j= i-1;
      while(j>=0 && curr<array[j]){
        array[j+1]= array[j];
        j--;
      }
      array[j+1]=curr;
    }
    print(array);
  }
  
  public static void bubbleSort(){
     int[] array = { 7, 8, 3, 5, 6, 1, 2 };
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp= array[j];
          array[j ]= array[ j +1];
          array[ j +1 ]= temp;
        }
      }
    }
    print(array);
  }
  
}