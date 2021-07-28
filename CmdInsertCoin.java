
public class CmdInsertCoin implements Command {

	public String execute(VendingMachine v, String cmdPart) {
		Integer c = Integer.valueOf(cmdPart);

		v.insertCoin(c);

		Integer sum = 0;

		for (Integer x : v.getInsertedCoins()) {
			sum += x;
		}

		String output = "Inserted a $" + c + " coin. $" + sum + " in total.";
		return output;

	}
}
