package Java3.Stack;

import java.util.ArrayList;
import java.util.Stack;

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
        Cookie c4 = new Cookie("small", "oatmeal raisin", 1);
        Cookie c5 = new Cookie("small", "thin mints", 8);

        Stack<Cookie> cookies = new Stack<>();
        cookies.push(c1);
        cookies.push(c2);
        cookies.push(c3);
        cookies.push(c4);
        cookies.push(c5);

        System.out.println("Cookies stack:" + cookies);
        System.out.println("The last cookie is: " + cookies.peek());
        System.out.println("Removing " + cookies.pop());
        System.out.println("Cookies after removing first cookie: " + cookies);

    }

}