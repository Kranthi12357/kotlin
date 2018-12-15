fun main(args:Array<String>){

    var input:Int  = 10

    var str = input as? String
    println(str?.length)
    
    var str1 = input  as? Float
    print("print ${str1}")

    var s = input.toString()
    println(s)

}
