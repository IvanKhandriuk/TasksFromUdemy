package Functions

fun main(){
    val user1=User("John", 23,3)
    val user2=User("Olga", 35,7)
    carSharing(user2.age,user2.Experience,user2.name)

}
data class User(val name: String, val age:Int,val Experience:Int)

fun carSharing(age1: Int, experience1: Int, brand: String ){
    val carAvailable = if ((age1 >= 26 && experience1 >= 6)||(brand != "Audi" && brand != "BMW"))
        "Доступен"
    else
        "Не доступен"

    println(carAvailable)
}
