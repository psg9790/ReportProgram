package builder;

import page.Page;

public class PageBuilder {
	private String title;
	private String author;
	private String content;
	private String tel;
	private Page pages;
	
	public PageBuilder()
	{
		title = "No Title";
		author = "Noway Jose";
		content = "abcdefghijklmnopqrstuvwxyabcdefghijklmno"
				+ "pqrstuvwxyabcdefghijklmnopqrstuvwxyabcde"
				+ "fghijklmnopqrstuvwxyabcdefghijklmnopqrst"
				+ "uvwxyabcdefghijklmnopqrstuvwxyabcdefghij"
				+ "klmnopqrstuvwxyabcdefghijklmnopqrstuvwxy";
		tel = "2023-12-06";
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
