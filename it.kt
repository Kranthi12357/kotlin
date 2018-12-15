fun main(args:Array<String>){

    reverse("hello",{it.reversed()})
}
fun reverse(str:String,k:(String)->String){
   print( k(str))
}
