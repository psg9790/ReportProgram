package reader;

import builder.PageBuilder;
import page.Page;

public class ContentReader implements PageReader {
	
	int offset = 0;
	
	@Override
	public void ReadPage(PageBuilder v_builder, Page v_page) {
		offset = 0;
		
		while(offset < v_builder.GetContent().length())
		{
			v_page.IncreasePageCount();
			StringBuilder sb = new StringBuilder();
		
			for(int i = 0; i < 9; i++)
				sb.append("                                        \n");
			sb.append("                                         ");
		
			int endIdx = Math.min(offset + 40, v_builder.GetContent().length());
			sb.replace(41*3, 41*4-1, v_builder.GetContent().substring(offset, endIdx));
			offset = endIdx;
			
			if(offset < v_builder.GetContent().length())
			{				
			endIdx = Math.min(offset + 40, v_builder.GetContent().length());
			sb.replace(41*4, 41*5-1, v_builder.GetContent().substring(offset, endIdx));
			offset = endIdx;
			}
			if(offset < v_builder.GetContent().length())
			{
				
			endIdx = Math.min(offset + 40, v_builder.GetContent().length());
			sb.replace(41*5, 41*6-1, v_builder.GetContent().substring(offset, endIdx));
			offset = endIdx;
			}
		
			v_page.GetTails().Adjust(sb);
			
			System.out.println(sb.toString());
			v_page.SlicePage();
		}
		
	}

}
