fun main(args:Array<String>){

    voidtype()
    var resultint   = inttype(5)
    print(resultint)
    var resutstr = stringtype("kranthi")
    print(resutstr)
    var resexp = exp(49,5)
    print(resexp)
}
fun voidtype(){
    print("hello ")
}
fun inttype(a:Int):Int{
    return a
}
fun stringtype(b:String):String{
    return b
}
fun exp(c:Int , d:Int ) = if(c>d) c else d