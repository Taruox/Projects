public class Array {

	public static void main(String[] args) {
		int[] data = new int[10];

		for(int i = 0, j = 10; i < data.length; i++, j--){
			data[i] = j;
		}

		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i] + " ");
		}
	}
	
}