
//The main class which creates objects and calls sort method for Question1
public class caller1 {

	public static void main(String[] args) throws Exception {
		
        int array1[]= {200,100,101,99,6,4,9,115,295,444,223,34,98,99,107,3};
        
        //Making sure that the length of the array needs to be a power of 2
        if(!isPowerOfTwo(array1.length))
        {
        throw new Exception();
        }
        	
        //Printing array before sorting
        System.out.println("Array Before Sorting");  
        for(int i=0; i < array1.length; i++){  
                System.out.print(array1[i] + " ");  
        }  
        System.out.println(); 
        
        //creating object for question1 to call sort method on this object
        question1 ob1=new question1();     
        ob1.sort(array1);
        
        //Printing array after sorting
        System.out.println("Array after sorting");
        for(int i=0; i < array1.length; i++){  
            System.out.print(array1[i] + " ");  
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
