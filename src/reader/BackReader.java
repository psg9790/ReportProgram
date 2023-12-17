package reader;

import builder.PageBuilder;
import page.PageTail;

public class BackReader implements PageReader {

	@Override
	public void ReadPage(PageBuilder v_builder, PageTail v_tails) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 9; i++)
			sb.append("                                        \n");
		sb.append("                                        ");
		
		v_tails.Adjust(sb);
		System.out.println(sb.toString());
	}

}
