class student(var branch:String ){
    var name = ""
    var id  = 0
    var surname = " "
    constructor(nam:String ,ide:Int ,sur:String):this("IT"){
        name = nam.toUpperCase();
        id  = ide;
        surname = sur

    }
}
fun main(args:Array<String>){
    var students = student("kranthi",17125,"jella")

    println(students.name)
    println(students.id)
    println(students.surname)
    println(students.branch)
}
