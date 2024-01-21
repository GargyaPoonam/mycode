package ecommerceApp.com;

public class firstproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.err.println("Soniya");

		   int arr[] = {1,2,3,4,5,6,7,8,0,9};
		   int max = arr[0];
		  // System.out.println(arr.length);
		   for (int i =0;i<arr.length; i++) {
			   System.out.print(arr[i]);
         if( arr[i]>max)
	        max = arr[i];
		   }
		   
		   System.out.print(max);


	}

}
