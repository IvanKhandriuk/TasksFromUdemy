package Tasks.IfElse

fun main(){
var somenumber :Int = readLine()!!.toInt()

    when{
        somenumber==1-> print("one")
        somenumber==2-> print("two")
        somenumber==3-> print("three")
        somenumber==4-> print("four")
        somenumber==5-> print("five")
        else-> print("incorrect number")
}
}