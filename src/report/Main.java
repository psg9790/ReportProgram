package report;

import builder.PageBuilderFactory;
import builder.CoverDiscountFactory;
import builder.DefaultFactory;
import builder.NoTailFactory;
import builder.PageBuilder;

public class Main {

	public static void main(String[] args) {
		PageBuilderFactory factory = new NoTailFactory();
		
		PageBuilder builder = factory.GetBuilder();
		builder.Print();
		System.out.println("price: " + builder.CalcPrice());
	}
}

		
		