package reader;

import builder.PageBuilder;
import page.Page;

public interface PageReader {
	public void ReadPage(PageBuilder v_builder, Page v_page);
}
