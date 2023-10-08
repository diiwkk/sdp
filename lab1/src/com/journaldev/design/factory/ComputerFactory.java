// This is a package declaration. It specifies the package for the code.
package com.journaldev.design.factory;

// Import the "Computer," "PC," and "Server" classes from their respective packages.
// These classes are used in the "ComputerFactory" class to create instances.
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

// This is a class named "ComputerFactory."
public class ComputerFactory {

    // This is a public and static method named "getComputer."
    // It's used to create instances of "PC" or "Server" based on the provided parameters.
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        // Check if the "type" parameter is "PC."
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu); // Create and return an instance of the "PC" class with the provided parameters.

            // Check if the "type" parameter is "Server."
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu); // Create and return an instance of the "Server" class with the provided parameters.

        // If the "type" parameter doesn't match "PC" or "Server," return null.
        return null;
    }
}