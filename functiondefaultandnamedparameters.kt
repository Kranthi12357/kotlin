fun main(args:Array<String>){

    addit(10,c=20)
    varg("1","2")
    varg("1","2","3","4")
    varg("1","2","3","4","5")
}
fun addit(a:Int ,b:Int=79,c:Int) {
    print(a+b+c)
}
fun varg(vararg string:String)
{
    kranthi(*string)
}
fun kranthi(vararg string2:String){

    for(string3 in string2 )
    {
        print(string3)
    }
}