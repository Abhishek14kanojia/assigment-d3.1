
public class print_ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,6,7,9,8,2,3,4};     
        int temp = 0;    
                
        for (int i = 0; i < arr.length; i++) {     
            System.out.println(arr[i]);    
        }      
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();          
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }     
}

