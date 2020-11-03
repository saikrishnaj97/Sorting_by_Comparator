
import java.util.*; 
import java.util.Comparator;
public class question2 <T extends Comparable<T>> {
	T[] array;
	Comparator comp;
	 
	static boolean isPowerOfTwo (int x)
    {
      /* First x in the below expression is 
        for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);
    }
	
	 public void sort(T[] array,Comparator comp) { // array length must be a power of 2
	 this.array = array;
	 this.comp=comp;
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
	 //comparing objects of different types using compare method of Comparator class 
	 if(comp.compare(array[i], array[j])>0)
	 swap(i, j);
	 }
	 private void swap(int i, int j) {
	 T h = array[i];
	 array[i] = array[j];
	 array[j] = h;
	 }
}

