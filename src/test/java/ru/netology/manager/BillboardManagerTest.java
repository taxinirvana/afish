package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Billboard;

import static org.junit.jupiter.api.Assertions.*;

class BillboardManagerTest {

    Billboard first = new Billboard(1, "First");
    Billboard second = new Billboard(2, "Second");
    Billboard third = new Billboard(3, "Third");
    Billboard fourth = new Billboard(4, "Fourth");
    Billboard fifth = new Billboard(5, "Fifth");
    Billboard sixth = new Billboard(6, "Sixth");
    Billboard seventh = new Billboard(7, "Seventh");
    Billboard eighth = new Billboard(8, "Eighth");
    Billboard ninth = new Billboard(9, "Ninth");
    Billboard tenth = new Billboard(10, "Tenth");
    Billboard eleventh = new Billboard(11, "Eleventh");

    @Test
    public void shouldSaveAllFilms() {
        BillboardManager manager = new BillboardManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Billboard[] expected = {first, second, third};
        Billboard[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseConstructor() {
        BillboardManager manager = new BillboardManager(3);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Billboard[] expected = {fourth, third, second};
        Billboard[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseConstructorNoParam() {
        BillboardManager manager = new BillboardManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Billboard[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth,fifth, fourth, third, second};
        Billboard[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }
}