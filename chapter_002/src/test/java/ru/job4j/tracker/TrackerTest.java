package ru.job4j.tracker;

import org.junit.Test;

import javax.sound.midi.Track;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Test.
 *
 * @author Alexander Zabelin (zabelinn@yandex.ru)
 * @version 0.1
 * @since 0.1
 */
public class TrackerTest {

    // тест на Tracker().add()
    @Test
    public void whenAddNewItemThenShowHisId() {
        Item item = new Item("name", "desc", 111);
        item = new Tracker().add(item);
        System.out.println(item.getId());
    }

    // тест на Tracker.findById()
    @Test
    public void whenGenerateIdThenFindIt() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 111);
        item = tracker.add(item);
        assertThat(item, is(tracker.findById(item.getId())));
    }

    // тест на Tracker.findByName()
    @Test
    public void whenGenerateNameThenFindIt() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("name1", "desc11", 111));
        tracker.add(new Item("name1", "desc12", 111));
        tracker.add(new Item("name2", "desc22", 222));
        Item[] items = tracker.findByName("name1");

        String[] names = new String[2];
        int i = 0;
        for (Item item : tracker.findByName("name1")) {
            names[i] = item.getDescription();
            i++;
        }
        assertThat(names, is(new String[] {"desc11", "desc12"}));
    }

    // тест на Tracker.replaceItem()
    @Test
    public void whenReplaceItemThenCompareValues() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 111);
        item = tracker.add(item);

        Item item2 = new Item("name2", "desc2", 222L);
        tracker.replaceItem(item.getId(), item2);

        assertThat(item.getName(), is("name2"));
        assertThat(item.getDescription(), is("desc2"));
        assertThat(item.getCreated(), is(222L));
    }

    // тест на Tracker.findAll()
    @Test
    public void whenFindAllThenCompareWithPattern() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("name1", "desc1", 1));
        tracker.add(new Item("name2", "desc2", 2));
        tracker.add(new Item("name3", "desc3", 3));

        String[] names = new String[tracker.findAll().length];
        int i = 0;
        for (Item item : tracker.findAll()) {
            names[i] = item.getName();
            i++;
        }
        assertThat(names, is(new String[] {"name1", "name2", "name3"}));
    }

    // тест на Tracker.delete()
    @Test
    public void whenDeleteItemItemThenCompareItems() {
        Tracker tracker;
        Item item1, item2, item3;
        int i;
        String[] names = new String[2];
        String idForDelete;

        // удаление последнего элемента
        tracker = new Tracker();
        tracker.add(new Item("name1", "desc1", 1));
        tracker.add(new Item("name2", "desc2", 2));
        item3  = tracker.add(new Item("name3", "desc3", 3));
        idForDelete = item3.getId();
        tracker.delete(idForDelete);
        i = 0;
        for (Item item : tracker.findAll()) {
            names[i] = item.getName();
            i++;
        }
        assertThat(names, is(new String[]{"name1", "name2"}));

        // удаление элемента из середины
        tracker = new Tracker();
        tracker.add(new Item("name1", "desc1", 1));
        item2 = tracker.add(new Item("name2", "desc2", 2));
        tracker.add(new Item("name3", "desc3", 3));
        idForDelete = item2.getId();
        tracker.delete(idForDelete);
        i = 0;
        for (Item item : tracker.findAll()) {
            names[i] = item.getName();
            i++;
        }
        assertThat(names, is(new String[]{"name1", "name3"}));

        // удаление первого элемента
        tracker = new Tracker();
        item1  = tracker.add(new Item("name1", "desc1", 1));
        tracker.add(new Item("name2", "desc2", 2));
        tracker.add(new Item("name3", "desc3", 3));
        idForDelete = item1.getId();
        tracker.delete(idForDelete);
        i = 0;
        for (Item item : tracker.findAll()) {
            names[i] = item.getName();
            i++;
        }
        assertThat(names, is(new String[]{"name2", "name3"}));
    }
}
