import java.util.*;

public class PhoneBook  {

    private HashMap<String, List<Long>> phoneClient;

    public PhoneBook() {
        this.phoneClient = new HashMap<String, List<Long>>();
    }

    public void add(String s, Long l) {
        List<Long> num = new ArrayList<Long>();

        if (this.phoneClient.containsKey(s)){
            num = this.phoneClient.get(s);
            num.add(l);
            this.phoneClient.put(s, num);
        }
        else {
            num.add(l);
            this.phoneClient.put(s, num);
        }
    }

    public String get(String s){
        String res = "";

        if (this.phoneClient.containsKey(s)) {
            res = "\nТелефон клиента " + s + ": " +
                    this.phoneClient.get(s).toString()
                            .replace("[","")
                            .replace("]", "")
                            .replace(",", "")
                            .trim();
        } else {
            res = "Такого клиента нет в справочнике";
        }
        return res;
    }
}
