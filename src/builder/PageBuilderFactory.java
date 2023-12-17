package builder;

public abstract class PageBuilderFactory {
	protected String title = "";
	protected String author = "";
	protected String content = "";
	protected String tel = "";
	
	public abstract PageBuilder GetBuilder();
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
}
