package classes

class Users {
    lateinit var userName: String
    lateinit var userSurname: String

    fun getFullName() {
        println("$userName $userSurname")
    }
}

// * Primary Constructor Definition
class Users2(userName: String, userSurname: String) {
    var userName = userName
    var userSurname = userSurname

    fun getFullName() {
        println("$userName $userSurname")
    }
}
// class Users2 constructor(userName: String,userSurname: String)

// * Arrange constructor values re-assignable, or not
class User3(var userName: String, val userSurname: String) {
    // * not required in order to use constructor variables/values directly.
    //var userName = userName
    //var userSurname = userSurname

    fun getFullName() {
        println("$userName $userSurname")
    }
}

// * Definition of default value in primary constructor
class User4(var userName: String= "Jonny", val userSurname: String = "Deep") {
    fun getFullName() {
        println("$userName $userSurname")
    }
}

// * init keyword usage
class User5(var userName: String, var userSurname: String, var gender:String) {

    init {
        if (gender == "Male") {
            println("Hello Mister $userSurname")
        } else if (gender == "Female") {
            println("Hello Miss $userSurname")
        } else {
            println("Hello Mrs $userSurname")
        }
    }

    fun getFullName() {
        println("$userName $userSurname")
    }
}

fun main() {

    // ? Why constructor may be necessary
    // * A constructor is a special method used to set the values of required variables of objects derived from the class.
    val user = Users()
    user.userName = "Emily"
    user.userSurname = "Smith"
    user.getFullName()

    val another = Users()
    another.userName = "Johny"
    another.userSurname = "Bravo"
    another.getFullName()

    // * Instead of define one by one, use constructor.
    val user2 = Users2("Anny", "Jones")
    user2.getFullName()
    // * We can re-assign constructor values by default
    user2.userName = "Neil"

    // * As far as we see at the following example we can arrange
    // * this kind of configuration by giving val/var.
    val user3 = User3("Nicola", "Tesla")
    user3.userName = "Thomas"
    //user3.userSurname = "Edison"
    // ! Val can not be assigned
    user3.getFullName()

    // * If we do not add values to the constructor, default values are used.
    val user4 = User4()
    user4.getFullName()

    // * The `init` block will execute immediately after the primary constructor.
    // * Initializer blocks effectively become part of the primary constructor.
    // * We can do some logic process with init.
    val user5= User5("Anna", "Karenina","Female")
    user5.getFullName()
}

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

