fun main(args:Array<String>){
    operator1(1,3,{x->println(x)})
    op(2,{x->x*x})
    op(2){it*it}
    op1{it*it}
    sum(4,4,{x,y->println(x+y)})
}
fun sum(x:Int,y:Int,s:(Int,Int)->Unit){
    s(x,y)
}
fun operator1(x:Int,y:Int,s:(Int)->Unit){
    var sum = x+y
    s(sum)
}
fun op(x:Int,c:(Int)->Int):Unit{
    println(c(x))
}
fun op1(d:(Int)->Int){
    println(d(6))
}