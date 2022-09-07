import java.util.Random;

public class MagicBox<T> {

    private int maxItem;
    private T[] items;
    int count;

    public MagicBox(int maxItem) {
        this.maxItem = maxItem;
        this.items = (T[]) new Object[maxItem];
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

    public T pick() throws Exception {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                count++;
                continue;
            };
            throw new Exception("Коробка не полная, осталось мест: "
                    + (items.length - count));
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];

    }

    public T[] getItems() {
        return items;
    }
}
