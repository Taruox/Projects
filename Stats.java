import java.util.Arrays;
public class Stats {

	public static void main(String[] args) {
		int[] a = {5,3,6,9,23,-15,7,20,86,23}
		Arrays.sort(a);
	}

	public static int min(int[] a) {

		int x = a[0];
		return x;
	}

	public static int max(int[] a) {
		int x = a[a.length-1];
		return x;
	}


	public static double median(int[] a) {
		int x = a.length/2;
		return a[x];
	}

	public static int quartile1(int[] a) {
		
	}

























}