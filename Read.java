import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Read class will read elements form a shared list
 */
class Read {

	private List<Animal> list;

	// Receive shared list in constructor
	Read(List<Animal> list) {
		this.list = list;
	}

	// Read the items
	public void readItem() {

		for (Animal item : list) {
			System.out.println(item.toString());
		}

	}
	public void leerItem() {

		for (Animal item : list) {
			System.out.println(item.frase());
		}

	}
	public void géneroItem() {

		for (Animal item : list) {
			System.out.println(item.getgénero());
		}

	}
	public void tipoItem() {

		for (Animal item : list) {
			System.out.println(item.getTipo());
		}

	}
	public void typeItem() {

		for (Animal item : list) {
			System.out.println(item.getType());
		}

	}

}