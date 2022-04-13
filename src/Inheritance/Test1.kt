package Inheritance

 fun main(){
     val programmer1= Programmer("John",3000)
     programmer1.addProject("project1")
     programmer1.addProject("project2")

     val programmer2= Programmer("Nik",5000)
     programmer1.addProject("project3")

     val manager1=Manager("Olga",4000)

     val employees= listOf<Employee>(programmer1,programmer2,manager1)

     for (employee in employees)
         employee.printAllProjects()
 }
open class Employee(
    val name: String,
    val salary: Int
){
    private val projects: MutableList<String> = mutableListOf<String>()

            fun addProject(projectName:String){
                projects.add(projectName)
                print("Worker $name: start work with project $projectName")
            }

    fun printAllProjects(){
        println("Worker project's $name: ${projects.joinToString()}")
    }
}
class  Programmer(name: String, salary: Int):Employee(name, salary){
    fun readArticle(articleName:String){
        println("Programmer $name: read article $articleName")
    }
}

class Manager(name: String, salary: Int): Employee(name, salary){
    fun callToClient(clientName: String){
        println("Manager $name: call client $clientName")
    }
}