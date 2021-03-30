import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NextShipmentDate {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Recharged date: ");
		Date rDate = sdf.parse(sc.nextLine());
		System.out.print("Validity days: ");
		int vDays = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Recharge Date: " + sdf.format(rDate));
		System.out.println("Validity days: " + vDays);
		
		sc.close();
	}

}
