package Tasks.IfElse

fun main() {
    var a: Int = readLine()!!.toInt()
    var b: Int = readLine()!!.toInt()

    when {
        a > b -> print("bigger number is: $a")
        a < b -> print("bigger number is: $b")
        else -> print("numbers are equals")
    }

}