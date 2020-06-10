package dp;
import java.text.DecimalFormat;

public class SingletonTest {

	public static void main(String[] args) {

		Renban a = Renban.getInstance();
		Renban b = Renban.getInstance();

		System.out.println(a.getNumber());
		System.out.println(b.getNumber());
		System.out.println(b.getNumber());
		System.out.println(a.getNumber());

	}

}

class Renban{
	private static Renban Renban = new Renban();
	private int number;
	DecimalFormat format = new DecimalFormat("0000");

	private Renban() {
		number = 0;
	}

	public static Renban getInstance() {
		return Renban;
	}

	public String getNumber() {
		if(number > 10000) {
			return format.format(number);
		}
		number = number + 1;
		return format.format(number);
	}

}
