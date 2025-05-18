package org.example;

import poly.cafe.entity.Categories;

public class Main {
    public static void main(String[] args) {
        Categories c = new Categories("1", "12");
        System.out.println(c.getId());
    }
}