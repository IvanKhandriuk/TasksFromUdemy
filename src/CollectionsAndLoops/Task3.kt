package CollectionsAndLoops

import DataClasses.User

fun main(){
    val user1=User("Alex", 23,3)
    val user2=User("Olga", 30,1)
    val user3=User("Max", 35,7)

    val users=listOf(user1,user2,user3)


    //val minAge=averageAgeOfEmployees(employees)
    //print(minAge)
}
fun availableCar(user: List<User>):Car {
    val car1=Car("BMW","M5",30.200)
    val car2=Car("Audi","RS8",40.600)
    val car3=Car("Fiat","2000",15.300)

    val cars= listOf(car1,car2,car3)

    val availableCars:Car

    return

}

}
/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/