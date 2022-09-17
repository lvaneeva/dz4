import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] testArray={"orange", "apple", "pineapple ", "cherry", "banana", "kiwi", "lemon", "avocado", "apple", "lemon"};
        System.out.println(Arrays.toString(testArray));

        Set<String> set = new HashSet<>();
        for(String fruit: testArray){
            set.add(fruit);
        }
        System.out.println(set);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            int c=0;
            for (String str2:testArray) {
                if (str.equals(str2)) {
                    c++;
                }
            }
            System.out.print("\t"+c+"\t");
        }
        System.out.println();

        /*HashMap<String, String> hm = new HashMap<>();
        hm.put("+79998888888", "Vaneeva");
        hm.put("+79998887777", "Smirnova");
        hm.put("+79998886666", "Timofeeva");
        hm.put("+79998885555", "Afanas'eva");*/

        Phonebook myPhonebook = new Phonebook();
        myPhonebook.add("Smirnova", "+79998880000");
        myPhonebook.add("Vaneeva", "+79998888888");
        myPhonebook.add("Smirnova", "+79998887777");
        myPhonebook.add("Timofeeva", "+79998886666");
        myPhonebook.add("Afanas'eva", "+79998885555");

        myPhonebook.print();
        String[] myresult=myPhonebook.get("Smirnova");
        System.out.println(Arrays.toString(myresult));

    }
}