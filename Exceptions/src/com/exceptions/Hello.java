package com.exceptions;

public class Hello {

    int[] arr = {1, 2, 3, 4, 5};

    public void arr() {
        try {
            for (int i = 0; i <= 8; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array index out");
        }
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.arr();
    }
}