// This is a package declaration. It specifies the package for the code.
package com.journaldev.design.abstractfactory;

// Import the "Computer" and "Server" classes from their respective packages.
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.Server;

// This is a class named "ServerFactory" that implements the "ComputerAbstractFactory" interface.
public class ServerFactory implements ComputerAbstractFactory {

    // These are private member variables to store server configuration.
    private String ram; // RAM configuration
    private String hdd; // Hard disk drive configuration
    private String cpu; // CPU configuration

    // This is a constructor for the "ServerFactory" class.
    // It takes three parameters to set the server configuration (RAM, HDD, and CPU).
    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram; // Initialize the RAM
        this.hdd = hdd; // Initialize the HDD
        this.cpu = cpu; // Initialize the CPU
    }

    // The class can have additional methods and code to create server instances based on the provided configuration.



    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}