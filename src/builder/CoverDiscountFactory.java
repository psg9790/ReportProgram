package builder;

import options.PriceTag;
import page.Page;
import page.PageTail;
import reader.BackReader;
import reader.ContentReader;
import reader.FrontReader;

public class CoverDiscountFactory extends PageBuilderFactory {

	@Override
	public PageBuilder GetBuilder() {
		PageBuilder builder = new PageBuilder();
		if(author.isEmpty() == false)
			builder.SetAuthor(author);
		if(title.isEmpty() == false)
			builder.SetTitle(title);
		if(content.isEmpty() == false)	
			builder.SetContent(content);
		if(tel.isEmpty() == false)	
			builder.SetTel(tel);

		builder.AddPage(new Page(new PriceTag(100, 0.33f), new FrontReader()));
		
		Page cPage = new Page(new PriceTag(100, 0), new ContentReader());
		cPage.AddTail(new PageTail("****************************************", 0, 0, false, new PriceTag(0, 0)));
		cPage.AddTail(new PageTail("****************************************", 1, 0, false, new PriceTag(0, 0)));
		cPage.AddTail(new PageTail("========================================", 7, 0, false, new PriceTag(0, 0)));
		cPage.AddTail(new PageTail("========================================", 8, 0, false, new PriceTag(0, 0)));
		cPage.AddTail(new PageTail(builder.GetTel(), 9,  0, false, new PriceTag(50, 0)));
		cPage.AddTail(new PageTail(builder.GetTitle(), 9,  40, true, new PriceTag(50, 0)));
		builder.AddPage(cPage);
		
		Page bPage = new Page(new PriceTag(100, 0.33f), new BackReader());
		bPage.AddTail(new PageTail(builder.GetAuthor(), 8, 40, true, new PriceTag(0, 0)));
		builder.AddPage(bPage);
		
		
		return builder;
	}

}
