package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *Class Tracker
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Tracker {
    // массив для хранения заявок
    private Item[] items = new Item[100];

    // указатель на ячейку, следующую за последней
    private int position = 0;

    private static final Random RN = new Random();

    /**
     * Метод генерирует уникальный ключ для заявки.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis()) + String.valueOf(RN.nextInt());
    }

    /**
     * добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position] = item;
        this.position++;
        return item;
    }

    /**
     * Найти элемент по его id
     *
     * @param id id элемента
     * @return найденный элемент
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Найти массив заявок с заданным name
     *
     * @param name name заявки
     * @return массив найденных заявок
     */
    protected Item[] findByName(String name) {
        // создадим и заполним выходной массив
        Item[] result = new Item[100];
        int index = 0;
        for (Item item : this.items) {
            if (item != null && item.getName().equals(name)) {
                result[index] = item;
                index++;
            }
        }
        // обрежем лишние элементы
        result = Arrays.copyOf(result, index);

        return result;
    }

    /**
     * Заменить данные элемента по его id
     *
     * @param id   id элемента для замены
     * @param item элемента предоставляет данные, которые нужно заменить элемент по его id
     */
    public void replaceItem(String id, Item item) {
        Item repItem = this.findById(id);
        repItem.setName(item.getName());
        repItem.setDescription(item.getDescription());
        repItem.setCreated(item.getCreated());
    }

    /**
     * Получить список всех заявок
     *
     * @return список заявок
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * удалить элемент по его id
     *
     * @param id id элемента для удаления
     */
    public void delete(String id) {
        for (int pos = 0; pos < this.position; pos++) {
            if (this.items[pos].getId().equals(id)) {
                if (pos < this.position - 1) {
                    System.arraycopy(this.items, pos + 1, this.items, pos, this.items.length - 2);
                }
                this.position--;
                break;
            }
        }
    }
}
