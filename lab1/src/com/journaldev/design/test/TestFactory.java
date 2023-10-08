package com.journaldev.design.test; //This string defines the package to which the TestFactory class belongs.//
import com.journaldev.design.abstractfactory.PCFactory; //These lines import classes and factories from different packages that will be used in the TestFactory class. The ComputerFactory factory from the previous code will be used to create instances of the PC and Server classes.//
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;
public class TestFactory { //This line declares the TestFactory class.//
    public static void main(String[] args) { //this main method is the entry point to the program.//
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        //This line creates a pc object using the ComputerFactory. The getComputer method is called with the parameters "pc", "2 GB", "500 GB", and "2.4 GHz" to create an instance of the PC class with the specified characteristics.//
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        //Similarly, this line creates a server object using the ComputerFactory, but this time it creates an instance of the Server class with different characteristics.//
        System.out.println("Factory PC Config::"+pc); //Эти строки выводят информацию о созданных компьютерах на консоль, используя метод toString(), который определен в классе Computer.//
        System.out.println("Factory Server Config::"+server);
    }
}