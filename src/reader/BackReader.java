package reader;

import builder.PageBuilder;
import page.Page;

public class BackReader implements PageReader {

	@Override
	public void ReadPage(PageBuilder v_builder, Page v_page) {
		v_page.IncreasePageCount();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 9; i++)
			sb.append("                                        \n");
		sb.append("                                         ");
		
		v_page.GetTails().Adjust(sb);
		System.out.println(sb.toString());
		
		v_page.SlicePage();
	}

}
