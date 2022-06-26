package varvalconst

// * can be define at the top-level
const val gender = "Female"

// ! not possible for const
// const val sibling
// sibling = 3

// * usage with object
object Age {
    const val old: Int = 25
}

class SampleForConst {

    // ! should be used with val
    // const surName = "SEVIK" // compile error

    // ! if we use const inside of class, we should use them with companion object
    // const val address = "Turkey" // compile error

    companion object {
        const val country = "Turkey" // correct usage

        // ! only primitive types:: Expecting member declaration
        // const val city = getCity()

        private fun getCity(): String {
            return "Antalya"
        }
    }

    // * get the constant from the object
    val myAge = Age.old

    // * get the constant from the companion object
    var myCountry = country

    // * get the constant from the top-level
    val myGender = gender
}


