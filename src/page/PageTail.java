package page;

import options.PriceTag;

public class PageTail {
	private PageTail nextTail;
	private String text;
	private int rows;
	private int cols;
	private boolean inversionDir;
	private PriceTag price;
	
	public PageTail(String v_text, int v_rows, int v_cols, boolean v_inversion, PriceTag v_price)
	{
		text = v_text;
		rows = v_rows;
		cols = v_cols;
		inversionDir = v_inversion;
		price = v_price;
	}
	
	public void Adjust(StringBuilder v_builder)
	{
		if(inversionDir == false) // 정방향
		{
			int endPos = rows * 41 + cols + text.length();
			v_builder.replace(rows * 41 + cols, endPos, text);
		}
		else // 역방향
		{
			int endPos = rows * 41 + cols - text.length();
			v_builder.replace(endPos, rows * 41 + cols, text);
		}
		if(nextTail != null)
			nextTail.Adjust(v_builder);
	}
	
	public int CalcPrice()
	{
		if(nextTail != null)
		{
			return nextTail.CalcPrice() + price.CalcPrice();
		}
		return price.CalcPrice();
	}
	
	public void SetNextTail(PageTail v_tail)
	{
		if(nextTail != null)
		{
			nextTail.SetNextTail(v_tail);
			return;
		}
		nextTail = v_tail;
	}
}
