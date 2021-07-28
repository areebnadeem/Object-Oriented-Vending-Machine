
public class Product {

	  private String name;
	  private int price;
	  private int quantity;

	  public Product(String name, int price, int quantity) {
	    this.name = name;
	    this.price = price;
	    this.quantity = quantity;
	  }
		
	  /* You may add other properties and methods */
	  public String getName() {
		  return name;
	  }
	  
	  public Integer getQuantity() {
		  return quantity;
	  }
	  
	  public Integer getPrice() {
		  return price;
	  }
	  
	  public void setProduct() {
		  quantity = quantity - 1;
	  }
	}

