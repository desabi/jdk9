package com.desabisc.improvedstrem;

class Product {
    private String name;
    private int price;
    private boolean isActive;
    private String description;

    public Product(String name, int price, boolean isActive) {
        this.name = name;
        this.price = price;
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
