fun main(args:Array<String>){

    var obj = derived1(18,"male")
    obj.read()
    obj.display()
    obj.readage()
    obj.readgen()
}
open class base{
    var student = ""
    fun read(){
        student = readLine()!!
    }
    open fun display(){
        print("the name of the student is $student")
    }
}
open class derived(var age:Int):base(){

    fun readage(){
        println("the age of the person is $age $student")
    }
     override fun display(){
        println("the name of derived class so also so")
    }
}
class derived1:derived {

    var gender = ""

    constructor(age: Int, gen: String) : super(age) {
        gender = gen
    }

    fun readgen() {
        super.display()
        println("the gender of the person is $gender")
    }
}