package options;

public class SymbolLine {
	private char symbol;
	private PriceTag price;
	
	public SymbolLine(char v_symbol)
	{
		symbol = v_symbol;
		price = new PriceTag(20, 0);
	}
	
	public SymbolLine(char v_symbol, PriceTag v_tag)
	{
		symbol = v_symbol;
		price = v_tag;
	}
	
	public void Print()
	{
		
	}
	
	public int CalcPrice()
	{
		return price.CalcPrice();
	}
	
	public PriceTag GetPriceTag()
	{
		return price;
	}
}
