import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    public static void main(String[] args){

        String[][] phoneArray =new String[][]{
                {"Ivanov","8-999-999-99-99"},{"Ivanov","8-777-999-99-99"},
                {"Petrov","8-666-999-99-99"},{"Petrov","8-111-999-99-99"},
                {"Petrov","8-888-999-99-99"},{"Sidorov","8-333-999-99-99"},
                {"Varov","8-666-999-99-99"},{"Varov","8-444-999-99-99"},
                {"Varov","8-222-999-99-99"},{"Korovkin","8-555-999-99-99"},
        };

        Map<String, Set<String>> phoneBook = new HashMap<String,Set <String>>();

        for (int i = 0; i <phoneArray.length ; i++) {
            Set<String> phoneNumber = new HashSet<String>();
            phoneNumber.add(phoneArray[i][1]);
            phoneBook.put(phoneArray[i][0], phoneNumber);
        }

        for (int i = 0; i <phoneArray.length ; i++) {
                Set<String> phoneNumber = new HashSet<String>();
                phoneNumber.add(phoneArray[i][1]);
                phoneBook.get(phoneArray[i][0]).add(phoneArray[i][1]);
        }
//////        Set<String> phoneNumber = new HashSet<String>();
////        phoneNumber.add("8-999-999-99-99");
////        phoneNumber.add("8-999-999-99-91");
//
//
//        phoneBook.put("Petrov", phoneNumber);
//
//        phoneBook.get("Petrov").add("8888");
////        phoneBook.get("Вщвщв").add("8888");
        phoneBook.forEach((key, value)-> System.out.println(key + " : " + value));
    }

}
