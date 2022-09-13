
public class print_array_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		
	}

}
