package phonebookpack;
import java.util.*;
public class PhoneBook {


    //instance variable
    private Map<String, String> phonebook = new TreeMap<String, String>();
    private String displayfull;
    private Set keyset = phonebook.keySet();
    private List<Object> list = new ArrayList<Object>();
//    private String holdsall = phonebook.

    //  Constructor
    public PhoneBook() {
    }


    //Methods

    public String add(String name, String number) {
        phonebook.put(name, number);
        return name;
    }

    public String remove(String name) {
        phonebook.remove(name);
        return name;
    }

    public Set listNames() {
        return keyset;
    }

    public String lookup(String name) {
        return phonebook.get(name);
    }

    public String reverselookup(String number) {
        //loop through to find the key that is equal to the number entered
        for (Object o : phonebook.keySet()) {
            if (phonebook.get(o).equals(number)) {
                list.add(o);
            }
        }
        return number;
    }

    public String display() {

        String chew = "";

            for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                chew += key + " : " + value + "\n";
            }
                return chew;
        }

    }





























































































