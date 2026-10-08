package com.example.gitdemo.Calculate;

public interface Calculator {

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    //Tüm calculator'ların ortak kullanacağı hesaplama türlerini tek bir interface olarak oluşturdum.
    //Bu hesaplama türlerini 3 hesap makinesinde de kullanılıyor, bu yüzden bu interface'i 3'ü de implement edecek.
}