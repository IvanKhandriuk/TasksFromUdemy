package CollectionsAndLoops

fun main() {
    val employee1=Employee("Alex", 23)
    val employee2=Employee("Olga", 35)
    val employee3=Employee("John", 28)
    val employee4=Employee("Chris", 40)

    val employees=listOf(employee1,employee2,employee3,employee4)

    val minAge=averageAgeOfEmployees(employees)
    print(minAge)
}
fun minAgeOfEmployees(employees: List<Employee>):Employee {
    var minAgeEmployee=employees[0]
    for(employee in employees)
        if(employee.age<minAgeEmployee.age)
            minAgeEmployee=employee

    return minAgeEmployee

}
