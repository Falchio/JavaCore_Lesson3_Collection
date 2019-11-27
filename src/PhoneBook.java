
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;


public class PhoneBook {
    private HashMap<String, Set<String>> phone = new HashMap<>();

    public void add(String name, String tel) {

        Set<String> phoneSet = phone.get(name);
        if (phoneSet == null) {
            phoneSet = new TreeSet<String>() {
            };
        }
        phoneSet.add(tel);
        phone.put(name, phoneSet);
    }

    public Set<String> get(String name) {
        return phone.get(name);
    }

}


//public class PhoneBook {
//
//    public static void main(String[] args){
//
//        String[][] phoneArray =new String[][]{
//                {"Ivanov","8-999-999-99-99"},{"Ivanov","8-777-999-99-99"},
//                {"Petrov","8-666-999-99-99"},{"Petrov","8-111-999-99-99"},
//                {"Petrov","8-888-999-99-99"},{"Sidorov","8-333-999-99-99"},
//                {"Varov","8-666-999-99-99"},{"Varov","8-444-999-99-99"},
//                {"Varov","8-222-999-99-99"},{"Korovkin","8-555-999-99-99"},
//        };
//
//        Map<String, Set<String>> phoneBook = new HashMap<String,Set <String>>();
//
//        for (int i = 0; i <phoneArray.length ; i++) {
//            Set<String> phoneNumber = new HashSet<String>();
//            phoneBook.put(phoneArray[i][0], phoneNumber);
//
//        }
//
//        for (int i = 0; i <phoneArray.length ; i++) {
//            phoneBook.get(phoneArray[i][0]).add(phoneArray[i][1]);
//        }
//
//        phoneBook.forEach((key, value)-> System.out.println(key + " : " + value));
//        System.out.println(phoneBook.get("Ivanov"));
//    }
//
//}
