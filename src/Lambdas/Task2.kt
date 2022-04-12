package Lambdas

fun main(){
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12),
        User("Alex", 17),
        User("Clark", 22)
    )

    val filteredUsers=filteredUsersByCondition(users) { it.name[0] == 'K' }

    println(filteredUsers)

}
fun filteredUsersByCondition(users: List<User>,condition:(User)->Boolean):List<User>{
    val filteredUsers=mutableListOf<User>()
    for (user in users)
        if (condition(user))
            filteredUsers.add(user)
    return filteredUsers
}