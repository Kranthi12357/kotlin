fun main(args:Array<String>){
    var name:String? = "kranthi"
    println("the name is ${name?.length}")
    println("the name len id ${name!!.length}")
    var len = name?.length?:-1
    println("the len is $len")
    name?.let{
        println("the length of the code is ${name.length}")
    }
}