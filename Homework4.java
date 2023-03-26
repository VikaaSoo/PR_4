/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.homework4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


/**
 *
 * @author druda
 */
public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Вариант № 1. Согрина Виктория Алексеевна, группа: РИБО-03-21");
        int a;
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("x001xx", new Car ("Volvo s90", 2010));
        cars.put("x002xx", new Car ("Lada Vesta", 2022));
        cars.put("x003xx", new Car ("Kia Rio", 2014));
        
        System.out.println("Список автомобилей: ");
        for(Entry<String, Car> entr : cars.entrySet()){
            System.out.println(entr.getValue() + ", " + entr.getKey());
        }
        System.out.println("Выберите команду: " + 
                "Добавить новый автомобиль в список - 1;" + 
                " Удалить автомобиль по его номеру - 2;" + 
                " Удалить все автомобили в списке - 3.");
        
        a = scan.nextInt();
        switch(a){
            case 1:
                System.out.println("Введите номер автомобиля, который хотите добавить: ");
                String nNumber = scan.next();
                if(cars.containsKey(nNumber) == true){
                    System.out.println("Данный номер уже зарегестрирован ");
                    break;
                }
                System.out.println("Введите марку автомобиля: ");
                String marka = scan.next();
                System.out.println("Введите год производства машины ");
                int year = scan.nextInt();
                if(year > 2023){
                    year = 2023;
                }else if(year < 1886){
                    year = 1886;
                }
                cars.put(nNumber, new Car (marka,year));
                System.out.println("Автомобиль добавлен в список! ");
                System.out.println("Список автомобилей: ");
                for(Entry<String, Car> entr : cars.entrySet()){
                    System.out.println(entr.getValue() + ", " + entr.getKey());
                }
                break;
            case 2:
                System.out.println("Введите номер автомобиля, который хотите удалить: ");
                String number = scan.next();
                cars.remove(number);
                System.out.println("Автомобиль удален! ");
                System.out.println("Список автомобилей: ");
                for(Entry<String, Car> entr : cars.entrySet()){
                    System.out.println(entr.getValue() + ", " + entr.getKey());
                }
                break;
            case 3:
                cars.clear();
                System.out.println("Автомобили удалены! ");
                System.out.println("Список автомобилей: ");
                for(Entry<String, Car> entr : cars.entrySet()){
                    System.out.println(entr.getValue() + ", " + entr.getKey());
                }
                break;
        }
    }
}
