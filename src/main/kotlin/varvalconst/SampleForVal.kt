package varvalconst

val myGender = "Female"

// ! because of SampleForConst.kt, use another value name::
// ! Conflicting declarations: public val gender: String, public const val gender: String
//val gender = "Female"

class SampleForVal {
    // * definition of val with an primitive types
    val myName:String = "Hicran"

    // * definition of val with an function
    val mySurname = getSurname()

    // * definition of val with an class
    val address = Address()
    val myStreet = address.street

    // ! can not be re-assign:: Expecting member declaration
    // mySurname = "Gunes"

    // ! val can  not initialize later unlike var:: Property must be initialized or be abstract
    // val age: String
    // age = 25


    fun getSurname() :String{
        return "SEVIK"
    }
}

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}