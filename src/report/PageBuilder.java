package report;

public class PageBuilder {
	private String title;
	private String author;
	private String content;
	private SymbolLine header;
	private SymbolLine tail;
	private Page pages;
	
	public void Print()
	{
		
	}
	
	public int CalcPrice()
	{
		return 0;
	}
	
	public void SetTitle(String v_title)
	{
		
	}
	
	public void SetAuthor(String v_author)
	{
		
	}
	
	public void SetContent(String v_content)
	{
		
	}
	
	public void SetHeaderSymbol(char v_header)
	{
		header = new SymbolLine(v_header);
	}
	
	public void SetTailSymbol(char v_tail)
	{
		tail = new SymbolLine(v_tail);
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
}
