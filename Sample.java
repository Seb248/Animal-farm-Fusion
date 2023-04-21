// Test class.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sample{
    
    public static void main(String[] args) {

        // Use synchronized list to avoid exception
        List<Animal> list = Collections
                .synchronizedList(new ArrayList<Animal>());

        Write w = new Write(list);
        Read r = new Read(list);
        Animal creatura = new Animal();
        Animal creatura2 = new Animal();
        w.addItem(creatura);
        w.addItem(creatura2);

		r.readItem();
		r.leerItem();
	}
}