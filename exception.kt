fun main(args:Array<String>){

   var reslut = try{
       var r= check('6')
       r
    }
    catch(e:Exception){
        print(e.message)
    }
    print(reslut)
    
}

class phone(msg:String):Throwable(msg){

}
fun check(obj:Any):Any {
    when (obj) {
        !is Int -> throw phone("chill ")

        else -> return obj
    }
}