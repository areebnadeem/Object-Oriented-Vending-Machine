public class CmdPurchase implements Command {

	public String execute(VendingMachine v, String cmdPart) {

		CoinSupply c = new CoinSupply();

		Integer sum = 0;
		Integer change = 0;
		String output = "";

		for (Integer x : v.getInsertedCoins()) {
			sum += x;
		}

		for (int i = 0; i < v.getProduct().size(); i++) {

			String item = v.getProduct().get(i).getName();
			int price = v.getProduct().get(i).getPrice();
			int quantity = v.getProduct().get(i).getQuantity();

			if (cmdPart.equals(item)) {

				if (sum >= price) {
					if (quantity > 0) {

						v.getInsertedCoins().clear();

						change = sum - price;

						if (change == 0) {
							output = "Dropped " + item + ". " + "Paid $" + sum + ". No change.";
						}

						else {

							output = c.getChange(change, v, sum, item);
						}

						v.getProduct().get(i).setProduct();

						return (output);

					} else {
						return (item + " is out of stock!");
					}
				} else {
					return ("Not enough credit to buy " + item + "! Inserted $" + sum + " but needs $" + price + '.');
				}
			}
		}

		return "";

	}

}
