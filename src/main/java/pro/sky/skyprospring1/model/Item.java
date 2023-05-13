package pro.sky.skyprospring1.model;

import java.util.List;
import java.util.stream.Collector;

public class Item {
    private int id;
    private String title;
    public Item(int id, String title){
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
