package ru.gb.mandrik;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[4][4];
        arr[0][0] = "25";
        arr[0][1] = "1";
        arr[0][2] = "Hello";
        arr[2][1] = "256";

        Method method = new Method();
        try {
           method.method(arr);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}


