import java.util.*

fun main(args:Array<String>){

    var persons = person(2000)
    persons.string = "SN1234"
    persons.gender = "male"
    println(persons.gender)
    println(persons.age1)
    println(persons.string )
    print(persons.display())
}
class person(var age:Int){
    var age1:Int = 0
    get() = Calendar.getInstance().get(Calendar.YEAR)-age
    var gender = ""
    set(value) {
        if(value == "male"){
            field = "female"
        }
    }

    var string = ""
    set(value){
        if(!value.startsWith("SN")){
            throw IllegalAccessException("illegal use of exception")
        }
        field = value
    }
    fun display():String{
        return "$gender $age1"
    }
}