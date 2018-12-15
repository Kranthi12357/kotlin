fun main(args:Array<String>){

    var pers = per("123","kranthi")
    var pers1 = per("123","kranthi")
    print(pers)
    if(pers==pers1 )
        print("they are equal")
    else
        print("they are not equal")
    var per3 = pers1.copy(name="bhagath")
    print(per3)
}
data class per(var id: String, var name:String )
