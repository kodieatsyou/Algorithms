public class Algorithms {
  public static void main(String[] args) {
    int[] arr = {3, 2, 11, 12, 5, 2, 6};
    for (int p=0; p<arr.length;p++) {
      System.out.println(arr[p]);
    }
  } 
  public static int max(int [] a) {
    int max = a[0];
    for(int x : a) {
      if(x > max) {
        max = x;
      }
    }
    return max;
  }
  public static int min(int [] a) {
    int min = a[0];
    for(int x : a) {
      if(x < min) {
        min = x;
      }
    }
    return min;
  }
  public static int[] sort(int[] a) {
    for(int n=0; n<a.length; n++) {
      for(int i=0; i<a.length-1; i++) {
        if (a[i] > a[i+1]) {
          int temp = a[i];
          a[i] = a[i+1];
          a[i+1] = temp;
        }
      }
    }
    return a;
  }
}      