fun main(args:Array<String>){

    var result = 0
    sum1(3,5,{x,y-> result =x+y})
    print(result)
}
fun sum1(x:Int,y:Int,e:(Int,Int)->Unit){
    e(x,y)
}