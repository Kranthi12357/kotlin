class computer(var mouse:String ,var keyboard:String ){
    init {
        mouse = mouse.toUpperCase()
        println(mouse)
    }
}

fun main(args:Array<String>){
    var computers = computer("dell","hp")
    println(computers.mouse)
    println(computers.keyboard)
}