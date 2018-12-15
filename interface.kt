fun main(args:Array<String>){

    var c = C()
    c.get()
    c.show()
    c.color()

}
interface A{

    fun show()
    fun get(){
        println(" iam get fun of A")
    }
    var color:String //properites are abstract and open by default
}
open class B{
     open fun show(){
        println("hi hello how are you i am B")
    }
    open  fun get(){
        print("get of B")
    }
}
class C:B(),A{
    override  var color:String = readLine()!!
    override  fun show(){
        super.show()
        println("yes they are overrided ")
    }
    fun color(){
        println("$color ")
    }
    override fun get(){
        super<B>.get()
        println("hello  ")
    }
}
