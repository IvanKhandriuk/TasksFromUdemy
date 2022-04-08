package Tasks.IfElse

fun main(){
    val age :Int = readLine()!!.toInt()
    val experience:Int= readLine()!!.toInt()

    when{
        age>20&&experience>2->print("open")
        age>26&&experience>6->print("open+")
        else ->print("close")
    }
}