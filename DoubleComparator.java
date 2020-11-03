
import java.util.Comparator;

//Double comparator to compare array elements of double data-types
class DoubleComparator<T extends Comparable<T>> implements Comparator<T> {
	
	  public int compare(T a, T b) {
		if(a==null || b==null)
		{
			return 0;
		}
	    return a.compareTo(b);
	  }
	}