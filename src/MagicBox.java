import java.util.Random;

public class MagicBox<T> {

    private int maxItem;
    private T[] items;
    private int count;
    private Random random;

    public MagicBox(int maxItem) {
        this.maxItem = maxItem;
        this.items = (T[]) new Object[maxItem];
        this.random = new Random();
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                continue;
            }
            items[i] = item;
            return true;
        }
        System.out.println("Для " + item + " нет места");
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                count++;
                continue;
            };
            throw new RuntimeException("Коробка не полная, осталось мест: "
                    + (items.length - count));
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];

    }

    public T[] getItems() {
        return items;
    }
}
