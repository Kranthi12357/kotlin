open class principal{

    var name = "kranthi"
    var age = 30
}
class hod:principal(){
    var name1 = "something"
    var age1 = 40
    fun funct(){
        print("$name $age $age1 $name1")
    }
}
fun main(args:Array<String>){
   var  hods = hod()
    hods.funct()
}