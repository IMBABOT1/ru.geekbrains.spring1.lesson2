package ru.geekbrains.spring1.lesson1.Model;

public class Box {

    private long id;
    private String color;
    private int size;

    public Box(long id, String color, int size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
