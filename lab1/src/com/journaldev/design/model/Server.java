package com.journaldev.design.model; //Эта строка определяет пакет, к которому принадлежит класс Server. Он также находится в том же пакете, что и класс Computer.//
public class Server extends Computer { //Как и в случае с классом PC, класс Server наследует методы и свойства, определенные в классе Computer, и должен реализовать абстрактные методы getRAM(), getHDD() и getCPU()//
    private String ram; //Здесь определены приватные поля ram, hdd и cpu, которые будут использоваться для хранения информации о RAM, HDD и CPU сервера класса Server.//
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){ //Этот конструктор класса Server принимает три параметра: ram, hdd и cpu, и использует их для инициализации соответствующих полей в объекте класса Server.//
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() { //Этот метод переопределяет абстрактный метод getRAM() из класса Computer и возвращает информацию о RAM сервера класса Server//
        return this.ram;
    }
    @Override
    public String getHDD() { //Этот метод переопределяет абстрактный метод getHDD() из класса Computer и возвращает информацию о HDD сервера класса Server.//
        return this.hdd;
    }
    @Override
    public String getCPU() { //Этот метод переопределяет абстрактный метод getCPU() из класса Computer и возвращает информацию о CPU сервера класса Server.//
        return this.cpu;
    }
}