package com.company;


public class Produkty implements Comparable<Produkty> {
    private String type;
    private String name;
    private int price;

    public Produkty(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Produkty v) {
        return this.name.compareTo(v.name);
    }

}
