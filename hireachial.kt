open class tel(var state:String){
    fun chief(){
        println("the state is $state")
    }
}
open  class man{
    var sar = ""
    var mpt = ""
    constructor(sar:String ,mpt:String) {
        this.sar = sar
        this.mpt = mpt
    }

    fun win(){
        print("the $sar and $mpt had won ")
    }


}
class const(var state1:String,var sar1:String ,var sar2:String  ,var mla:String ,var zptc : String ):tel(state1){

    fun winner(){
       super.chief()
        println("the winner is $mla and $zptc")
    }

}
fun main(args:Array<String>){
    var consts = const("kranthi ","bunny","dell","hueawi","honor")
    consts.winner()
    consts.chief()
}