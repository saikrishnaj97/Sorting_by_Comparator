import java.util.Comparator;
import java.util.Random;
import java.util.Scanner; 
public class question1 {
     int[] array;
	

	static boolean isPowerOfTwo (int x)
    {
      /* First x in the below expression is 
        for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);
         
    }
	 public void sort(int[] array) { // array length must be a power of 2
	 this.array = array;
	 sort(0, array.length);
	 }
	 private void sort(int low, int n) {

	 if (n > 1) {
	 int mid = n >> 1;

	 sort(low, mid);
	 sort(low + mid, mid);

	 combine(low, n, 1);
	 }
	 }
	 
	 private void combine(int low, int n, int st) {
	 int m = st << 1;
	 if (m < n) {
	 combine(low, n, m);
	 combine(low + st, n, m);
	 for (int i = low + st; i + st < low + n; i += m)
	 compareAndSwap(i, i + st);
	 } else
	 compareAndSwap(low, low + st);
	 }
	 private void compareAndSwap(int i, int j) {
	 if (array[i] > array[j])
	 swap(i, j);
	 }
	 private void swap(int i, int j) {
	 int h = array[i];
	 array[i] = array[j];
	 array[j] = h;
	 }

}
