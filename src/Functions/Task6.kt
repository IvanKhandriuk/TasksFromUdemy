package Functions

fun main() {
    val user1 = User("John", 23, 3)
    val user2 = User("Olga", 35, 7)
    val carAvailable = carAvailable(user2.age, user2.Experience, "Audi")

    if (carAvailable==true) {
        print("Avilable")
    }
    else print("NotAviable")

}

data class Driver(val name: String, val age:Int,val Experience:Int)

fun carAvailable(age: Int, experience: Int, brand: String ):Boolean {

    val carAvailable= when {
        age>=21&&experience>=2->true
        age >= 26 && experience >= 6 && brand == "Audi" && brand == "BMW" -> true
        else -> false
    }
    return carAvailable
}