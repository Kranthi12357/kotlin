fun main(args:Array<String>){

    var list4 = listOf<Int>(1,2,3,4,6,37,377,3141,63,35)
    var sm = list4.filter{s->s>10}
    for(sm1 in sm){
        print(sm1)
    }

    var sm2 = list4.map{s->s*s}

    for(s3 in sm2){
        print(s3)
    }
    var sm4 = list4.filter{it > 10}.map{it*it}
    for(s4 in sm4){
        print(s4)
    }
    var sm5 = listOf<p>(p("kranthi",1),p("kittu",2),p("honor", 5))
    var s5 = sm5.filter{it.str.startsWith("h")}.map{s->s.str}

    for ( s6 in s5){
        print(s6)
    }

}

class p(var str:String,var me:Int){

}