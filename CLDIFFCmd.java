public class CLDIFFCmd {
  public void quickSort1(int arr[], int begin, int end) {
      if (begin < end) {
          int partitionIndex = partition234(arr, begin, end);

          quickSort(arr, begin, partitionIndex-1);
        
          quickSort1(arr, partitionIndex+1, end);
      }
  }

  private int partition234(int arr[], int begin, int end) {
    int pivot = arr[end];
    int test_begin = begin;
    int i = (test_begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
  }
    public static void main(String args[]){
        
    }
}
