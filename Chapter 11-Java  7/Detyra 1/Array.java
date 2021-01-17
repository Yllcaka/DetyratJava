import java.util.ArrayList;
import java.util.Iterator;

class Array {
    public static void main(String[] args) {
        ArrayList<String> shkrimtaret = new ArrayList<String>();
        shkrimtaret.add("Ismail Kadare");
        shkrimtaret.add("Franz Kafka");
        shkrimtaret.add("Charles Bukowski");
        shkrimtaret.add("Leo Tolsoty");
        shkrimtaret.add("Fyodor Dostoevsky");
        Iterator i = shkrimtaret.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}