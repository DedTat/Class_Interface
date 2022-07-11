/*
        1) Создать приложение с 2 классами - Book, Shoe  и  интерфейсом Product.
        Интерфейс содержит метод whoAmI, который будет реализован в имплементирующих классах.
        2) Определить новый интерфейс Present, расширяющий интерфейс Product и содержащий  метод itCanBePresented(), который может возвращать строку.
        3) Объявить 2 новых класса (например Toy, Picture), реализующих  интерфейс Present.
        4) В приложении создать массив объектов Product - (Book, Shoe, Toy, Picture), состоящий из количества элементов, заданного параметром.
        5) Найти в массиве те объекты, которые реализуют интерфейс Present и выполнить для них метод itCanBePresented().

 */



package ru.politech;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> arrList = new ArrayList();
        arrList.add(new Book());
        arrList.add(new Shoe());
        arrList.add(new Picture());
        arrList.add(new Toy());

        System.out.println(Arrays.toString(arrList.toArray()) + "\n");

        for(Product item : arrList){
            if(item instanceof Present){
                System.out.println(((Present) item).it_can_be_presented());
            }
        }
    }
}
