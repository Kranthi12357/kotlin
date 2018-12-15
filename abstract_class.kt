fun main(args:Array<String>){

   var  apples = apple()
    apples.eat()
    apples.height()
}
 abstract class banana{
    abstract  var color:String
     abstract fun height()
     open fun eat(){
         print("start eating")
     }
 }
class apple:banana(){
    override fun height(){
        print("the height of the banana is 5inch")
    }
    override var color = "yellow "
    override fun eat(){
        print("eating finished $color")
    }
}