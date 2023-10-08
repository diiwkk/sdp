package com.journaldev.design.model; //Эта строка определяет пакет, к которому принадлежит класс PC//
public class PC extends Computer {
    // Это означает, что класс PC наследует методы и свойства, определенные в классе Computer, и должен реализовать абстрактные методы getRAM(), getHDD() и getCPU()
    private String ram;
    private String hdd;
    private String cpu;
    // Здесь определены приватные поля ram, hdd и cpu, которые будут использоваться для хранения информации о RAM, HDD и CPU компьютера класса PC
    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
//Этот конструктор класса PC принимает три параметра: ram, hdd и cpu, и использует их для инициализации соответствующих полей в объекте класса PC//
    }
    @Override
    public String getRAM() {
        return this.ram;
//Этот метод переопределяет абстрактный метод getRAM() из класса Computer и возвращает информацию о RAM компьютера класса PC//
    }
    @Override
    public String getHDD() {
        return this.hdd;
//Этот метод переопределяет абстрактный метод getHDD() из класса Computer и возвращает информацию о HDD компьютера класса PC//
    }
    @Override
    public String getCPU() {
        return this.cpu;
//This method overrides the getCPU() abstract method from the Computer class and returns information about the CPU of a computer of class PC//
    }
}