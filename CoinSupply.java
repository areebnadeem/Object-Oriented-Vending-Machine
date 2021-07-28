import java.util.ArrayList;

public class CoinSupply {

	ArrayList<Integer> coinSupply = new ArrayList<Integer>();
	Integer change = 0;
	String coinChangeUnsorted = "";
	String coinChangeSorted = "";
	String output = "";

	public String getChange(int change, VendingMachine v, int sum, String item) {
		coinSupply.add(1);
		coinSupply.add(2);
		coinSupply.add(5);
		coinSupply.add(10);

		for (int i = 3; i >= 0; i--) {
			while (coinSupply.get(i) <= change) {
				coinChangeUnsorted += '$' + "" + coinSupply.get(i) + ", ";
				change = change - coinSupply.get(i);

			}
		}
		String[] split_out = coinChangeUnsorted.split(", ");
		for (int i = split_out.length - 1; i >= 0; i--) {
			if (i == 0) {
				coinChangeSorted += "" + split_out[i] + '.';
			} else {
				coinChangeSorted += "" + split_out[i] + ", ";
			}
		}
		output = "Dropped " + item + ". " + "Paid $" + sum + ". " + "Your change: " + coinChangeSorted;

		return output;
	}

}
