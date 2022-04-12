package Lambdas

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>{

    val result = mutableListOf<String>()

    for (user in users) {
        val string = conversion(user)
        result.add(string)
    }

    return result
}

fun main() {
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12)
    )

    val result = convertToStrings(users){user: User ->  "Name: ${user.name}. Age: ${user.age}"}

    println(result)
}