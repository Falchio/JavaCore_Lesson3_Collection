
import java.util.HashMap;
import java.util.Map;

public class SomeWords {

    public static void main(String[] args) {

        String[] someWords = {"АБАЖУР", "АБАЖУР", "АББАТ", "АББАТ",
                "АБЕРРАЦИЯ", "АБЕРРАЦИЯ", "АБОРИГЕН", "АБРАКАДАБРА", "АБРАКАДАБРА",
                "АБРАКАДАБРА", "АБСТРАКТНЫЙ", "АБСТРАКТНЫЙ", "АВТОДАФЕ", "АВТОДАФЕ",
                "АГЕНТ", "АГЕНТ", "Рефракция", "Чебоксары", "Чебурашка", "Чебурашка",
                "Чебуреки", "Чемодан", "Чемодан", "Чемодан"};

        Map<String, Integer> hmSomeWords = new HashMap<>();

        for (int i = 0; i < someWords.length; i++) {
            String thisWord = someWords[i];
            hmSomeWords.put(thisWord, hmSomeWords.getOrDefault(thisWord, 0) + 1);
        }

        System.out.println(hmSomeWords);


        String[][] phoneArray = new String[][]{
                {"Ivanov", "8-999-999-99-99"}, {"Ivanov", "8-777-999-99-99"},
                {"Petrov", "8-666-999-99-99"}, {"Petrov", "8-111-999-99-99"},
                {"Petrov", "8-888-999-99-99"}, {"Sidorov", "8-333-999-99-99"},
                {"Varov", "8-666-999-99-99"}, {"Ivanov", "8-444-999-99-99"},
                {"Varov", "8-222-999-99-99"}, {"Korovkin", "8-555-999-99-99"},
        };

        PhoneBook phoneBook = new PhoneBook();

        for (int i = 0; i < phoneArray.length; i++) {
            phoneBook.add(phoneArray[i][0], phoneArray[i][1]);
        }

        String surNameForSearch = "Ivanov";
        System.out.println("\n" + surNameForSearch + ":" + phoneBook.get(surNameForSearch));
    }

}
