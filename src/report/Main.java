package report;

import builder.PageBuilderFactory;
import builder.DefaultFactory;

public class Main {

	public static void main(String[] args) {
		PageBuilderFactory factory = new DefaultFactory();
		factory.GetBuilder();
	}

}
