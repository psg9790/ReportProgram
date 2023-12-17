package builder;

import options.PriceTag;
import page.Page;
import page.PageTail;
import reader.BackReader;
import reader.ContentReader;
import reader.FrontReader;

public class DefaultFactory extends PageBuilderFactory {

	@Override
	public PageBuilder GetBuilder() {
		PageBuilder builder = new PageBuilder();

		builder.AddPage(new Page(new PriceTag(100, 0), new FrontReader()));
		
		Page cPage = new Page(new PriceTag(100, 0), new ContentReader());
		cPage.AddTail(new PageTail("****************************************", 0, 0, false, new PriceTag(10, 0)));
		cPage.AddTail(new PageTail("****************************************", 1, 0, false, new PriceTag(10, 0)));
		cPage.AddTail(new PageTail("========================================", 7, 0, false, new PriceTag(10, 0)));
		cPage.AddTail(new PageTail("========================================", 8, 0, false, new PriceTag(10, 0)));
		cPage.AddTail(new PageTail(builder.GetTel(), 9,  0, false, new PriceTag(20, 0)));
		cPage.AddTail(new PageTail(builder.GetTitle(), 9,  40, true, new PriceTag(20, 0)));
		builder.AddPage(cPage);
		
		builder.AddPage(new Page(new PriceTag(100, 0), new BackReader()));
		
		builder.Print();
		System.out.println("price: " + builder.CalcPrice());
		
		return builder;
	}

}
