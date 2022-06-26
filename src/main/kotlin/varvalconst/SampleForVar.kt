package varvalconst

var age = 25;

class SampleForVar {
    // * the variable can be assigned value later with lateinit in the class
    lateinit var name: String

    fun initializeValue() {
        name = "Hicran"
    }

    fun reAssignVariable() {
        name = "Yagmur"
    }

    // * the variable can be assigned value later without lateinit in the function
    fun assignValueLaterInFunction() {
        var age: Int
        age = 25
    }

    companion object {
        var gender = "Female"
    }
}

object City {
    var city = "Istanbul"
}