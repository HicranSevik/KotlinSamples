package classes

import com.sevik.hicran.kotlinsamples.classes.Animal
import com.sevik.hicran.kotlinsamples.classes.User

fun main() {
    var student = User("Ipek", 24)
    student.userName = "Ela"
    // ! age in constructor is val, so can't be re-assigned:: Val cannot be re-assigned
    // student.age = 10

    // ! can not be changed:: Unresolved reference: animalName
    var animal = Animal(3)
    // animal.animalName = "Dog"

    // * usage of secondary constructor
    var animalInfo = Animal("Chicken", 5)

}