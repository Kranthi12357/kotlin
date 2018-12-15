fun main(args:Array<String>){


    people.bottle = 10
    print(people.details())
    print(people.bottle)
}
open class college(name:String,no:Int ){
    var student = name
    var id =  no
    open fun details() {
        print( "$student - $id")
    }
}
object people:college("kranthi",123){
    var bottle = -1
    override fun details(){
        super.details()
        print("hello ")
    }
}