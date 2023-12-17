package builder;

import options.SymbolLine;
import page.Page;

public class PageBuilder {
	private String title;
	private String author;
	private String content;
	private String tel;
	private SymbolLine header;
	private SymbolLine tail;
	private Page pages;
	
	public PageBuilder()
	{
		title = "No Title";
		author = "test author";
		content = "I am Report";
		tel = "010-1234-5678";
		header = new SymbolLine('*');
		tail = new SymbolLine('=');
	}
	
	public void Print()
	{
		System.out.println("------------------page------------------");
		pages.Print(this);
	}
	
	public int CalcPrice()
	{
		return pages.CalcPrice();
	}
	
	public void SetTitle(String v_title)
	{
		title = v_title;
	}
	
	public void SetAuthor(String v_author)
	{
		author = v_author;
	}
	
	public void SetContent(String v_content)
	{
		content = v_content;
	}
	
	public void SetTel(String v_tel)
	{
		tel = v_tel;
	}
	
	public void SetHeaderSymbol(char v_header)
	{
		header = new SymbolLine(v_header);
	}
	
	public void SetTailSymbol(char v_tail)
	{
		tail = new SymbolLine(v_tail);
	}
	
	public String GetTitle()
	{
		return title;
	}
	
	public String GetAuthor()
	{
		return author;
	}
	
	public String GetContent()
	{
		return content;
	}
	
	public String GetTel()
	{
		return tel;
	}
	
	public SymbolLine GetHeader()
	{
		if(header == null)
			header = new SymbolLine('*');
		return header;
	}
	
	public SymbolLine GetTail()
	{
		if(tail == null)
			tail = new SymbolLine('=');
		return tail;
	}
	
	public void AddPage(Page v_page)
	{
		if(pages != null)
		{
			pages.SetNextPage(v_page);
			return;
		}
		pages = v_page;
	}
}
