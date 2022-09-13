
public class frequencyarray {

	public static void main(String[] args) {
		int[] arr = {2,7,4,7,5,2};
		for (int i=0; i<arr.length; i++) {
			int frequence=0;
			for (int j=i; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					frequence++;
				}
			}
			System.out.println(frequence);
		}
		
	}

}
