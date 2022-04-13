package Lambdas

fun main(){
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12),
        User("Alex", 17),
        User("Clark", 22)
    )
    val filterUsers = elementsCount(users) {it.age>30}
    println(filterUsers)
}

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int{
    var counter=0
    for(user in users) {
        if (condition(user))
          counter++
    }
    return counter
}