package com.sevik.hicran.kotlinsamples.classes

class SimpleClass {
    private var name = "Hicran"

    // * public unnecassary:: Redundant visibility modifier
    public fun getAge(): Int {
        return 25
    }
}

// ! Classes in Kotlin are final by default. No inheritance:: This type is final, so it cannot be inherited from
// * Can be used open keyword for SimpleClass for inheritance.
//class OtherClass :SimpleClass() {}

class OtherClass {
    // * create an instance from SimpleClass
    var simple = SimpleClass()
    private val age = simple.getAge()
}

// * class with primary constructor
class User(var userName: String, val age: Int) {}
// class User constructor(var userName:String, val age:Int) {}

// * definition of default value in primary constructor
class Animal(animalNumber: Int = 1) {
    var animalName = ""
    var animalNum = animalNumber + 3

    // * init sample
    // * do smt while the class initializing
    init {
        if (animalNumber > 5)
            println(animalNumber + 3)
    }

    // secondary constructor definition
    constructor(animalName: String, animalNumber: Int) : this() {
        this.animalName = animalName
        println(this.animalName)
    }
}


