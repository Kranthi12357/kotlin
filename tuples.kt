fun main(args:Array<String>){
    var resl = func("had")
    println(resl.first)
    println(resl.second)
    var resul = vivo("bad")
    println("${resul.first} and ${resul.second},${resul.third}")
    var kranthi = listOf(Pair("second","first"),"paris" to "france","gha" to "kk")
    for((country,region) in kranthi){
        println("$country $region")
    }
var(id,userna,kkk) = vivo("hyderad")
    print(kkk)
}
fun func(name:String):Pair<String , Int> {
    return Pair("hyderabad",5000)
}
fun vivo(name:String):Triple<String,String,Int>{
    return Triple("Hyderabad ","golconda",6000)
}


























