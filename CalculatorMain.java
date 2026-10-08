package com.example.gitdemo.Calculate;

public class CalculatorMain {

    public static void main(String[] args) {

        BasicCalculator basic = new BasicCalculator();
        ScientificCalculator scientific = new ScientificCalculator();
        ProgrammingCalculator programming = new ProgrammingCalculator();

        System.out.println("Ebrar Furat 230404019");
        System.out.println("=== BASIC CALCULATOR ===");
        System.out.println("10 + 5 = " + basic.add(10, 5));
        System.out.println("10 - 5 = " + basic.subtract(10, 5));

        System.out.println("\n=== SCIENTIFIC CALCULATOR ===");
        System.out.println("√25 = " + scientific.sqrt(25));
        System.out.println("log(100) = " + scientific.log(100));

        System.out.println("\n=== PROGRAMMING CALCULATOR ===");
        System.out.println("5 AND 3 = " + programming.and(5, 3));
        System.out.println("5 OR 3 = " + programming.or(5, 3));
        System.out.println("5 XOR 3 = " + programming.xor(5, 3));

        // 3 farklı hesap makinemiz var. En başta tüm hesap makineleri tüm işlemleri yapıyordu ve işlevsel olarak birbirlerinin aynısı gibiydi.
        // Hesap makinelerine, isimlerine ve yapmaları gereken işlevlere göre hesaplama özellikleri atadım.
        // BasicCalculator --> toplama, çıkarma, çarpma, bölme
        // ScientificCalculator --> toplama, çıkarma, çarpma, bölme, karekök, log (10 tabanında), sin, cos
        // ProgrammingCalculator --> toplama, çıkarma, çarpma, bölme, and, or, xor
        // Ardından bir diğer problem şuydu, tüm hesap makineleri kullanmayacak oldukları özellikleri de implement etmek zorunda kalıyorlardı.
        // Çünkü tek bir interface vardı, Calculator interface'i tüm hesaplama türlerini kapsıyordu.
        // Bu da SOLID prensiplerinden ISP (Interface Segregation Principle) ihlaline sebep oluyordu.
        // Bu yüzden 3 farklı interface oluşturdum, bu sayede ISP problemi çözülmüş oldu.
        // Calculator interface'i tüm hesap makinelerinde ortak olarak kullanılan toplama, çıkarma, çarpma, bölme işlemlerini kapsıyor.
        // Sadece ProgrammingCalculator da kullanılacak işlemler ProgrammingOperations Interface'inde yer alıyor.
        // Sadece ScientificCalculator de kullanılacak işlemler de ScientificOperations Interface'inde yer alıyor.
    }
}