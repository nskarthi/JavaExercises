import java.util.Scanner;

public class CutPaste {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String str = sc.nextLine();

		System.out.print("Enter the Position: ");
		int pos = sc.nextInt();
		sc.nextLine();

		String result = str.substring(0, pos-1) + str.substring(pos);
		System.out.println(result);

		sc.close();
	}
}
