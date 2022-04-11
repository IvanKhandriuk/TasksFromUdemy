package CollectionsAndLoops

fun averageAgeOfEmployeesInDepartment(department: Department):Int {
 var sumOfAge=0

    for(employee in department.employees)
        sumOfAge+=employee.age
    return sumOfAge/department.employees.size
}

fun main() {
    val employee1 = Employee("Alex", 23)
    val employee2 = Employee("Olga", 35)
    val employee3 = Employee("John", 28)
    val employee4 = Employee("Chris", 40)

    val employees = listOf(employee1, employee2, employee3, employee4)
    val department = Department("IT", employees)

    val averageAge=averageAgeOfEmployeesInDepartment(department)
    print(averageAge)
}