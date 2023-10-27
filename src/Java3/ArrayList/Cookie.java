package Java3.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Cookie implements Comparable<Cookie> {
    private String size, type;
    private int amount;

    public Cookie(String size, String type, int amount) {
        this.size = size;
        this.type = type;
        this.amount = amount;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSize() {
        return this.size;
    }

    public String getType() {
        return this.type;
    }

    public int getAmount() {
        return this.amount;
    }

    public String toString() {
        return this.type;
    }

    @Override
    public int compareTo(Cookie o) {
        return this.getAmount() - o.getAmount();
    }

    public static void main(String[] args) {
        Cookie c1 = new Cookie("large", "chocolate chip", 2);
        Cookie c2 = new Cookie("small", "white chocolate macademia", 7);
        Cookie c3 = new Cookie("large", "snickerdoodle", 5);

        ArrayList<Cookie> cookies = new ArrayList<>();
        cookies.add(c1);
        cookies.add(c2);
        cookies.add(c3);
        System.out.println(cookies);
        System.out.println(cookies.get(0));
        System.out.println(cookies.remove(0));
        System.out.println(cookies);
        cookies.sort(null); // sort by amount
        System.out.println(cookies);

    }

}
