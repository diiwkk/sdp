package com.journaldev.design.model;//This string defines the package to which the Computer class belongs. //
public abstract class Computer { //This line declares an abstract class named Computer. //

    public abstract String getRAM(); //The abstract methods that must be implemented in Computer subclasses are defined here. These methods return information about the computer, such as the amount of memory (RAM), the size of the hard disk drive (HDD), and the processor (CPU).//
    public abstract String getHDD();
    public abstract String getCPU();
    @Override
    public String toString(){ //Этот метод toString() переопределен из класса Object и используется для возвращения строкового представления объекта Computer. В данном случае, он объединяет информацию о RAM, HDD и CPU в одну строку и возвращает ее.//
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}

