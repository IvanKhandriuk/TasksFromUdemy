package Tasks.IfElse

fun main()
{
    val email: String= readLine().toString();
    if (email.contains('@')&&email.contains('.'))
        print("true")
    else print("false")
}