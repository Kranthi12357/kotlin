fun main(args:Array<String>){

    var sets = setOf<Int>(1,2,3,4,5,6,7,8)

    for(setss in sets)
    {
        print(setss)
    }
    var mutableset = mutableSetOf<Int>(1,24,4,4,4,7,89,44)
    mutableset.add(30)
    for(i in mutableset){
        print(i)
    }

}