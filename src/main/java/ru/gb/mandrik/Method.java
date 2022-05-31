package ru.gb.mandrik;

public class Method {
    public void method(String[][] arr) {
        int sum = 0;
        if (arr[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4!!!");
        }
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4!!!");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException("В ячейке " + "[" + i + "]" + "[" + j + "]" +
                                " - неверные данные!!!");
                    } catch (MyArrayDataException m) {
                        System.out.println(m.getMessage());
                    }
                }
                System.out.println("Сумма элементов массива равна: " + sum);
            }
        }
    }
}
