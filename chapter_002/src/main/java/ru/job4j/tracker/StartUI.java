package ru.job4j.tracker;

public class StartUI {
    // константы для элементов меню
    private static final String ADD_NEW_ITEM = "0";
    private static final String SHOW_ALL_ITEMS = "1";
    private static final String EDIT_ITEM = "2";
    private static final String DELETE_ITEM = "3";
    private static final String FIND_ITEM_BY_ID = "4";
    private static final String FIND_ITEM_BY_NAME = "5";
    private static final String EXIT_MENU = "6";

    // Получение данных от пользователя.
    private final Input input;

    // Хранилище заявок.
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
    */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD_NEW_ITEM.equals(answer)) {
                this.createItem();
            } else if (SHOW_ALL_ITEMS.equals(answer)) {
                this.showItems(this.tracker.findAll());
            }  else if (EDIT_ITEM.equals(answer)) {
                this.editItemById();
            } else if (DELETE_ITEM.equals(answer)) {
                this.deleteItemById();
            } else if (FIND_ITEM_BY_ID.equals(answer)) {
                this.showItemById();
            } else if (FIND_ITEM_BY_NAME.equals(answer)) {
                this.showItemsByName();
            } else if (EXIT_MENU.equals(answer)) {
                exit = true;
            }
        }
    }

    // Метод реализует добавленяи новый заявки в хранилище.
    private void createItem() {
        System.out.println("------------ Добавление новой языки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        this.tracker.add(item);
        System.out.println("------------ Создана новая заявка с getId : " + item.getId() + " -----------");
    }

    private void showMenu() {
        System.out.println("");
        System.out.println("Меню.");
        System.out.println("0. Добавить новую заявку.");
        System.out.println("1. Показать все заявки.");
        System.out.println("2. Редактировать заявку.");
        System.out.println("3. Удалить заявку.");
        System.out.println("4. Найти заявку по id.");
        System.out.println("5. Найти заявки по name.");
        System.out.println("6. Выход из программы.");
        System.out.println("Ваш выбор:.");
    }

    // показать заявки из переданного массива заявок
    private void showItems(Item[] items) {
        int i = 1;
        for (Item item : items) {
            System.out.println(String.valueOf(i) + "."
                    + " Название: " + item.getName()
                    + ", описание: " + item.getDescription()
                    + ", создана: " + String.valueOf(item.getCreated())
            );
            i++;
        }
    }

    // запросить id и редактировать заявку
    private void editItemById() {
        Item item = this.tracker.findById(this.input.ask("Введите id заявки для редактирования :"));
        item.setName(this.input.ask("Введите новое имя :"));
        item.setDescription(this.input.ask("Введите новое описание заявки :"));
    }

    // запросить id и удалить заявку
    private void deleteItemById() {
        String id = this.input.ask("Введите id заявки для удаления :");
        this.tracker.delete(id);
        System.out.println("Заявка с id '" + id + "' удалена.");
    }

    // запросить id и показать заявку
    private void showItemById() {
        this.showItems(
                new Item[] {this.tracker.findById(this.input.ask("Введите id заявки для показа: "))}
                );
    }

    // запросить имя заявки и показать все найденные
    private void showItemsByName() {
        this.showItems(this.tracker.findByName(this.input.ask("Введите имя заявки для показа: ")));
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
