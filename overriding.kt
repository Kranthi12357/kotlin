//overriding actually in c++ of abstract base class same goes here

open class shape{

    open var len = 0
    open var breadth = 0
    open fun area(){
        println("the area of the shape ")
    }
}
class rectangle:shape{
    constructor(len:Int ,breadth:Int):super(){
        this.len = len
        this.breadth = breadth
    }
    override fun area(){
        println( "the area of rect "+ len * breadth)
    }
}
class triangle:shape{
    constructor(len:Int, breadth:Int ):super(){
        this.len = len
        this.breadth = breadth

    }
    override  fun area(){
        print( "the area of tri"+ len*breadth*0.5 )
    }
}

fun main(args:Array<String>){

    var rects = rectangle(5,10)
    rects.area()
    var tris = triangle(5,6)
    tris.area()
}