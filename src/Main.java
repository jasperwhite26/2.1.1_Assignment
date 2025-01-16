import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Fred");

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(6);

        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(60.76);

    }
}
