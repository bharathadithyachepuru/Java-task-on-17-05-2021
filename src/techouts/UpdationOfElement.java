package techouts;

import java.util.ArrayList;

public class UpdationOfElement {

	public static void main(String[] args) {

		// Create a list and add some colors to the list
		  ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Update the third element with "Yellow"
		  list_Strings.set(2, "Yellow");
		   // Print the list again
		  System.out.println(list_Strings);
	}

}
