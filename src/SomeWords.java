
import java.util.HashMap;
import java.util.Map;

public class SomeWords {

    public static void main(String[] args) {

        String[] someWords = {"Чебурашка", "Чемодан", "Чебоксары", "Чебуреки",
                "Чебурашка", "Чемодан", "Рефракция", "АБАЖУР", "АББАТ",
                "АББАТ", "АБЕРРАЦИЯ", "АБОРИГЕН", "АБРАКАДАБРА", "Чемодан",
                "АБРАКАДАБРА", "АВТОДАФЕ", "АВТОДАФЕ", "АБАЖУР", "АБЕРРАЦИЯ", "АБСТРАКТНЫЙ",
                "АГЕНТ", "АГЕНТ", "АБРАКАДАБРА", "АБСТРАКТНЫЙ",};

        Map<String, Integer> hmSomeWords = new HashMap<>();

        for (int i = 0; i < someWords.length; i++) {
            String thisWord = someWords[i];
            hmSomeWords.put(thisWord, hmSomeWords.getOrDefault(thisWord, 0) + 1);
        }

        System.out.println(hmSomeWords);
    }

}
