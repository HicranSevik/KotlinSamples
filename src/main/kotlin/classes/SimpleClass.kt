package classes

class SimpleClass {
    private var name = "Hicran"

    // * public unnecessary:: Redundant visibility modifier
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

