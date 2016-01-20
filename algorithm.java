public class Algorithms {
  public static void main(String[] args) {
    int[] arr = {3, 2, 11, 12, 5, 2, 6};
  }
  public static int max(int [] a) {
    int curmax = 0;
    for(int i=0; i<a.length; i++) {
      if(i > curmax) {
        curmax = i;
      }
    }
    return curmax;
  }
}      