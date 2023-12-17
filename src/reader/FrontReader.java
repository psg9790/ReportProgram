package reader;

import builder.PageBuilder;
import page.PageTail;

public class FrontReader implements PageReader {

	@Override
	public void ReadPage(PageBuilder v_builder, PageTail v_tails) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 9; i++)
			sb.append("                                        \n");
		sb.append("                                        ");
		
		sb.replace(140, 140 + v_builder.GetTitle().length(), v_builder.GetTitle());
		System.out.println(sb.toString());
	}

}
