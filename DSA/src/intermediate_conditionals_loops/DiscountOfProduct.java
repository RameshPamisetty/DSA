package intermediate_conditionals_loops;

public class DiscountOfProduct {

	public static void main(String[] args) {
		float markedPrice = 120;
		float sellingPrice = 100;
		float discount;

		discount = markedPrice - sellingPrice;
		float discountPercentage = (discount / markedPrice) * 100;
		System.out.println(discountPercentage);
	}
}
