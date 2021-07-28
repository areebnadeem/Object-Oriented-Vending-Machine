import java.util.Collections;

public class CmdRejectCoins implements Command {

	public String execute(VendingMachine v, String cmdPart) {

		String output = "";
		Integer sum = 0;
		Collections.sort(v.getInsertedCoins());

		for (int i = 0; i < v.getInsertedCoins().size(); i++) {
			if (i == (v.getInsertedCoins().size() - 1)) {
				output += "" + '$' + v.getInsertedCoins().get(i) + ". ";
			} else {
				output += "" + '$' + v.getInsertedCoins().get(i) + ", ";
			}
			sum += v.getInsertedCoins().get(i);
		}
		if (sum == 0) {
			return ("Rejected no coin!");
		}

		v.getInsertedCoins().clear();
		return ("Rejected " + output + '$' + sum + " in total.");

	}

}
