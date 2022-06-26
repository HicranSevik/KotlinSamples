package com.sevik.hicran.kotlinsamples.classes

class SimpleClass {
    private var name = "Hicran"

    // * Redundant visibility modifier
    public fun getAge():Int {
        return 25
    }
}

// ! Classes in Kotlin are final by default. No inheritance:: This type is final, so it cannot be inherited from
//class OtherClass :SimpleClass() {}

class OtherClass {
    // * create an instance from SimpleClass
    var simple = SimpleClass()
    private val age = simple.getAge()
}

// * class with primary constructor
class User(var userName:String, val age:Int) {}
// class User constructor(var userName:String, val age:Int) {}

fun main() {
    var student = User("Ipek", 24)
    student.userName = "Ela"
    // ! age in constructor is val, so can't be re-assigned:: Val cannot be re-assigned
    // student.age = 10
}

