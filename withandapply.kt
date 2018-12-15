fun main(args:Array<String>){
    var hyds = hyd()
    with(hyds){
        man = "kranthi"
        pop  = 10
    }
    hyds.apply(){
        man = "hellohyd"
        pop = 20
    }.cal()
    print(hyds.man)
    print(hyds.pop)
}
class hyd {
    var man = ""
    var pop =-1
    fun cal(){
        print(" kranthi qwerty")
    }
}
