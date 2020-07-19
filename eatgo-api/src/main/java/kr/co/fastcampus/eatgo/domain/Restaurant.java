package kr.co.fastcampus.eatgo.domain;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Restaurant() {}

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getInformation() {
        return this.name + " in " + this.address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems) {
            addMenuItem(menuItem);
        }
    }
}
