// This is a package declaration. It specifies the package for the code.
package com.journaldev.design.abstractfactory;

// Import a class named "Computer" from the "com.journaldev.design.model" package.
import com.journaldev.design.model.Computer;

// This is an interface declaration named "ComputerAbstractFactory."
public interface ComputerAbstractFactory {

    // This is a method declaration within the interface.
    // It specifies that any class implementing this interface must provide an implementation for this method.
    // This method is used to create a "Computer" object.
    public Computer createComputer();
}