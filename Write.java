import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * This class will add elements to 
 * a shared list that is created with an Arraylist.
 */

class Write {

	private List<Animal> list;

	// Receive a shared list in constructor
	Write(List<Animal> list) {
		this.list = list;
	}

	// add items
	public void addItem(Animal item) {

		this.list.add(item);
	}
}