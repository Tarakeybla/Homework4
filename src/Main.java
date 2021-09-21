import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        chkText();

        PhoneBook pb = new PhoneBook();

        pb.add("Pavel",89008005533L);
        pb.add("Pavel",89605606060L);
        pb.add("Semjon", 89898988989L);

        System.out.println(pb.get("Pavel"));
    }

    
    private static void chkText(){

        String line = "Проверка - это практически то же самое \n" +
                "что и проверка, приктически идентично";

        String[] text;

        line = line.replaceAll("[\\pP]", " ");
        line = line.replaceAll("\\s+", " ");
        text = line.split(" ");

        Map<String, Integer> txt = new HashMap<String, Integer>();

        for (String s: text
        ) {

            if (txt.containsKey(s.toLowerCase())) {
                txt.put(s.toLowerCase(), txt.get(s.toLowerCase()) + 1);
            }
            else {
                txt.put(s.toLowerCase(),1);
            }
        }

        System.out.print("Количество слов в тексте");
        for (Map.Entry<String, Integer> key: txt.entrySet()
        ) {
            System.out.printf("\n%s = %d ", key.getKey(), key.getValue());
        }
    }
}
