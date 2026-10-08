package com.example.gitdemo.Calculate;

public interface ScientificOperations {
    double sqrt(double number);
    double log(double number);
    double sin(double number);
    double cos(double number);
    //Sadece Scientific Calculator'ın implement edeceği hesaplama türlerini kapsayan bir interface oluşturdum.
    //Tum hesaplama turlerinin aynı interface'de yer alması SOLID prensiplerine (özellikle ISP) aykırı, bu sebeple ayırdım.
}
