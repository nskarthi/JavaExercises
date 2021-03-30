import java.math.BigInteger;
import java.util.Scanner;

public class StringToHexaDecimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value: ");
		String str = sc.nextLine();

		String result = toHex(str);
		System.out.println(result);

		sc.close();
	}
	
	public static String toHex(String arg) {
	    return String.format("%040x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
	}
}