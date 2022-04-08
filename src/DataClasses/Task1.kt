package DataClasses

fun main(){
    val user1 = User("Alex", 23)
    val user2 = User("Olga", 35)

    val maxUserAge = getMaxUserAge(user1,user2)
    print("User ${maxUserAge.name} older. His age: ${maxUserAge.age}")
}

fun getMaxUserAge(user1: User, user2: User):User{
    val maxAgeUserName = if (user1.age>user2.age)
        user1
    else
        user2
    return maxAgeUserName
}

data class User(val name: String, val age:Int)