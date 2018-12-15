fun main(args:Array<String>)
{
    var myLong:Long = 10
    var  myLong1 = 10L
    var myFloat = 10F
    var  hex = 0x0F
    var bin  = 0xb01

    //conversion
     var int = 100
    var long = int.toLong()

    // string
    var char = 'A'//single quotes indicates char  type
    var string = " "// it indicates double quotes
    var multipleline = """
        hello how are you
        i am fine
    """.trimIndent()

    //interpolation
    var name = "kittu"
    var age = 18
    println("hi how are you $name and length is ${name.length} and age is $age")
    //use flowerbraces for operations and methods
}
/*
In kotlin everything is object like Int , Float , Boolean  ,String .
*no implict conversion in kotlin.
* 10L indicates it is type of long
* 10F indicates it is type of float , so need of  myLong:Long
 */