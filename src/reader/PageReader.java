package reader;

import builder.PageBuilder;
import page.PageTail;

public interface PageReader {
	public void ReadPage(PageBuilder v_builder, PageTail v_tail);
}
