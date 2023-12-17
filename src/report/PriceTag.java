package report;

public class PriceTag {
	private int price;
	private float discount;
	
	public PriceTag(int v_price, float v_discount)
	{
		price = v_price;
		discount = v_discount;
	}
	
	public int CalcPrice()
	{
		return (int)(price * (1.0 - discount));
	}
	
	public void SetPrice(int v_price)
	{
		price = v_price;
	}
	
	public void SetDiscount(float v_discount)
	{
		discount = v_discount;
	}
}
