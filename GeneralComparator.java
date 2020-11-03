import java.util.Comparator;

//Generic comparator to compare array elements of all types in the future if required
class GeneralComparator<T extends Comparable<T>> implements Comparator<T> {
	
	  public int compare(T a, T b) {
		  if(a==null || b==null)
			{
				return 0;
			}
	    return a.compareTo(b);
	  }
	}
