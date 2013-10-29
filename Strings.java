public class Strings {

	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";

		if(str.equals(s)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

		for (int i = 0;i<str.length() ;i++ ) {
			System.out.println(str.charAt(i));
		}
	}

	public static ball(String s, String t) {

	}

	public static boolean contains(String s, String t) {
		for(int i=0; i<=s.length(); i++) {
			if(s.substring(i, i+t.length().equals(t)) {
				return true;
			}
		}
	}
}