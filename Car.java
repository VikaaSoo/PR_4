/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.homework4;

/**
 *
 * @author druda
 */
public class Car {
    private String Marka;
    private int Year;

    public Car(String Marka, int Year) {
        this.Marka = Marka;
        this.Year = Year;
    }

    @Override
    public String toString(){
        String str = this.Marka + " " + this.Year;
        return str;
    }
    
    public String getMarka() {
        return Marka;
    }

    public int getYear() {
        return Year;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    public void setYear(int year) {
        if(year > 2023){
            this.Year = 2023;
        }else{
            this.Year = year;
        }
        
    }
    
    
}
