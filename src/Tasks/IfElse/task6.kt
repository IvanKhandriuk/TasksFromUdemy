package Tasks.IfElse

fun main() {
    println("enter age: ")
    val age: Int = readLine()!!.toInt()
    println("enter experience: ")
    val experience: Int = readLine()!!.toInt()
    println("enter brend of auto: ")
    val auto: String = readLine()!!.toString()
    if (auto != "Audi" || auto != "BMW") println("error")
    when {
        age > 20 && experience > 2 -> print("open")
        age > 26 && experience > 6 -> print("open+")
        else -> print("close")
    }

    val age1: Int = 28
    val experience1: Int = 9
    val brand: String = "BMW"

    //вариант 1
    /*val carAvailable = when {
        age >= 26 && experience >= 6 -> "Доступен"
        age >= 21 && experience >= 2 && brand != "Audi" && brand != "BMW" -> "Доступен"
        else -> "Не доступен"
    }

    //вариант 2
    val carAvailable = if ((age1 >= 26 && experience1 >= 6)||(brand != "Audi" && brand != "BMW"))
        "Доступен"
    else
        "Не доступен"

    println(carAvailable)
*/
}