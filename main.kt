// Base class
open class Animal(private val name: String, private val age: Int) {
    
    // Method to show animal's details
    open fun showDetails() {
        println("Animal Name: $name, Age: $age")
    }
}

// Derived class inheriting from Animal
class Dog(name: String, age: Int, private val breed: String) : Animal(name, age) {
    
    // Method overriding
    override fun showDetails() {
        super.showDetails()
        println("Breed: $breed")
    }
}

// Abstract class
abstract class Appliance {
    abstract fun turnOn()
    abstract fun turnOff()
}

// Interface
interface SmartAppliance {
    fun connectToWifi()
}

// Class implementing interface and inheriting abstract class
class SmartLight : Appliance(), SmartAppliance {
    override fun turnOn() {
        println("Smart Light is On")
    }

    override fun turnOff() {
        println("Smart Light is Off")
    }

    override fun connectToWifi() {
        println("Smart Light connected to WiFi")
    }
}

fun main() {
    // Polymorphism
    val myDog: Animal = Dog("Buddy", 3, "Golden Retriever")
    myDog.showDetails()

    // Abstract and Interface Implementation
    val myLight = SmartLight()
    myLight.turnOn()
    myLight.connectToWifi()
    myLight.turnOff()
}
