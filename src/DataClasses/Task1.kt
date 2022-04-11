package DataClasses

import CollectionsAndLoops.User

fun main(){
    val user1 = User("Alex", 23,0)
    val user2 = User("Olga", 35,0)

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