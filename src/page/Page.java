package page;

import builder.PageBuilder;
import options.PriceTag;
import reader.PageReader;

public class Page {
	protected Page nextPage;
	protected PageTail tails;
	protected PriceTag price;
	protected PageReader reader;
	
	public Page(PriceTag v_price, PageReader v_reader)
	{
		price = v_price;
		reader = v_reader;
	}
	
	public void Print(PageBuilder v_builder) 
	{
		reader.ReadPage(v_builder, tails);
		
		SlicePage();
		if(nextPage != null)
			nextPage.Print(v_builder);
	}
	public int CalcPrice()
	{
		int ret = price.CalcPrice();
		if(tails != null)
			ret += tails.CalcPrice();
		if(nextPage != null)
		{
			return nextPage.CalcPrice() + ret;
		}
		return ret;
	}
	
	public void SetNextPage(Page v_page)
	{
		if(nextPage == null)
		{
			nextPage = v_page;
			return;
		}
		nextPage.SetNextPage(v_page);
	}
	
	protected void SlicePage()
	{
		System.out.println("------------------page------------------");
	}
	
	public void AddTail(PageTail v_tail)
	{
		if(tails == null)
		{
			tails = v_tail;
			return;
		}
		tails.SetNextTail(v_tail);
	}
}
