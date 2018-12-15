fun main(args:Array<String>){

    var map = mapOf<Int,String>(4 to "Kranthi",5 to "honor",6 to "hueawi")

    for(maps in  map.keys){
        println("  $maps = ${map[maps]}")
    }
    var hash = HashMap<Int,String>()
    hash.put(1,"kittu")
    hash.put(2,"jella")
    for( hashs in hash.keys){
        print(" $hashs  ${hash[hashs]}")

    }
}
