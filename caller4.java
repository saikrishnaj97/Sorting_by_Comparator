
//The main class which creates objects and calls sort method for Question4
public class caller4 {
	public static void main(String[] args) throws Exception {
		
	String[] array1= {"bcd","b","abc","aalm","sai","krishna","ireland","america","europe","france",
			          "india","canada","australia","boy","girl","phone"};
	
	Double[] array2= {9.999,8.68,2.35,6.58,0.199,1.29,2.344,100.0,0.001,123.1,1000.1,45.45,454.9,1.1,1.12,2.113};
	
	//Making sure that the lengths of both the arrays needs to be a power of 2
    if(!isPowerOfTwo(array1.length) || !isPowerOfTwo(array2.length))
    {
    throw new Exception();
    }
	
    //Printing the Arrays before sorting
	System.out.println("String Array Before Sorting");  
    for(int i=0; i < array1.length; i++){  
            System.out.print(array1[i] + " ,");  
    }  
    System.out.println();
    
    System.out.println("Double Array Before Sorting");  
    for(int i=0; i < array2.length; i++){  
            System.out.print(array2[i] + " ,");  
    }  
    System.out.println();
	
    question4 ob1 = new question4();
    question4 ob2 = new question4();
    
    StringComparator String_comp = new StringComparator();
    DoubleComparator Double_comp = new DoubleComparator();
    
    ob1.sort(array1, String_comp);
    ob2.sort(array2, Double_comp);
  
  //Printing the Arrays after sorting
    System.out.println("String Array after sorting");
    for(int i=0; i < array1.length; i++){  
        System.out.print(array1[i] + " ,");  
    }  
    System.out.println();
    
    System.out.println("Double Array after sorting");
    for(int i=0; i < array2.length; i++){  
        System.out.print(array2[i] + " ,");  
    }  
    System.out.println();
}
	
	//method to check if the length of array is power of 2
	static boolean isPowerOfTwo(int n)
    {
    	  if(n==0)
    	  return false;
    	  return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
          (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}