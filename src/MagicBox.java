import java.util.Random;


public class MagicBox<T> {
    private T[] items;
    private int count;
    Random random = new Random();


    public void setBoxCapacity(int number) {
        items = (T[]) new Object[number];


    }


    public boolean add(T item) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                continue;
            }
            items[i] = item;
            return true;
        }
        return false;
    }

    public T pick() {

        try {

            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    count++;
                }
            }

        } finally {
            if (count > 0) {
                throw new RuntimeException("Коробка не заполнена! Не заполнено" + " " + count + " " + "ячеек!");
            } else {
                int randomInt = random.nextInt(items.length);
                return items[randomInt];
            }
        }
    }

}





