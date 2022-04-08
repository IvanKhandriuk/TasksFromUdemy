package CollectionsAndLoops

fun main() {
    val employee1=Employee("Alex", 23)
    val employee2=Employee("Olga", 35)
    val employee3=Employee("John", 28)
    val employee4=Employee("Chris", 40)

    val employees=listOf(employee1,employee2,employee3,employee4)

    val averageAge=averageAgeOfEmployees(employees)
    print(averageAge)
}
fun averageAgeOfEmployees(employees: List<Employee>):Int {
    var sum=0
    for(employee in employees)
        sum+=employee.age

    return sum/employees.size


}
