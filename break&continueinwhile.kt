fun main(args:Array<String>){
    var a:Int = 0
    while(a<4)
    {
        var b:Int =0
       myLoop2@while(b<4)
        {   b++
                if(a == 2 && b == 2){
                    continue@myLoop2;
                }
                else
                {
                    println("$a $b")
                }
        }
        a++
    }
}