
import java.util.Comparator;

//String comparator to compare array elements of string types
class StringComparator<T extends Comparable<T>> implements Comparator<T> {
	
	  public int compare(T a, T b) {
		  if(a==null || b==null)
			{
				return 0;
			}
	    return a.compareTo(b);
	  }
	}