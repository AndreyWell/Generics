import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        MagicBox<String> magicBox = new MagicBox<>(5);

        magicBox.add("A");
        magicBox.add("B");
        magicBox.add("C");
        magicBox.add("D");
        magicBox.add("E");
        magicBox.add("F");

        System.out.println(Arrays.toString(magicBox.getItems()));

        System.out.println("Случайное значение: " + magicBox.pick());


        MagicBox<Integer> magicBox1 = new MagicBox<>(3);

        magicBox1.add(1);

        System.out.println(Arrays.toString(magicBox1.getItems()));

        System.out.println("Случайное значение: " + magicBox1.pick());

    }
}
