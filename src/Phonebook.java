import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private HashMap<String, String> hm= new HashMap<>();
   /* public Phonebook(HashMap<String, String> hm) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("+79998888888", "Vaneeva");
        hm.put("+79998887777", "Smirnova");
        hm.put("+79998886666", "Timofeeva");
        hm.put("+79998885555", "Afanas'eva");
        this.hm=hm;

    }*/
   public Phonebook(){}
    public void add(String family, String phone) {
        hm.put(phone, family);
    }

    public String[] get(String family) {
        ArrayList<String> phones=new ArrayList();
        for (Map.Entry<String, String> o : hm.entrySet()) {
            if (o.getValue().equals(family)) {
                //System.out.println(o.getKey());
                phones.add(o.getKey().toString());
            }
        }
        return phones.toArray(new String[0]);
    }
    public void print(){
        for (Map.Entry<String, String> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}
