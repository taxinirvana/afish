package ru.netology.manager;

import ru.netology.domain.Billboard;

public class BillboardManager {
    private Billboard[] films = new Billboard[0];
    private int numberOfFilms = 10;

    public BillboardManager() {
    }

    public BillboardManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void add(Billboard film) {
        Billboard[] tmp = new Billboard[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public Billboard[] findAll() {return this.films;}

    public Billboard[] findLast() {
        int resultLength;
        if (films.length < numberOfFilms) {
            resultLength = films.length;
        } else {
            resultLength = numberOfFilms;
        }
        Billboard[] result = new Billboard[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - i - 1];
        }
        return result;
    }
}
