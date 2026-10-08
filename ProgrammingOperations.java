package com.example.gitdemo.Calculate;

public interface ProgrammingOperations {
    int and(int a, int b);
    int or(int a, int b);
    int xor(int a, int b);

    //Sadece ProgrammingCalculator'ın kullanacağı hesaplama türlerini ayrı bir interface olarak oluşturdum.
    //Çünkü tüm hesaplama türlerinin aynı interface'de olması, bir class'ın kullanmayacağı özellikleri de implement etmesine sebep olur.
    //Bu SOLID kurallarına aykırıdır.
}
