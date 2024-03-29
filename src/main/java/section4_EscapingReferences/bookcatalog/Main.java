package section4_EscapingReferences.bookcatalog;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		bc.printAllBooks();
		//get price of book called Tom Jones in EUR
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("PHP"));

		bc.printAllBooks();
	}
}
