fun main(args:Array<String>) {

    myLoop@ for(a:Int in 1..4) {
        for(b:Int in 2..4) {
            if(a == 3 && b == 3)
                break@myLoop;
            else
                println("$a $b")
        }
    }
    myLoop1@for(a:Int in 1..4){
        for(b:Int in 1..4){
            if(a == 3 && b == 3)
                continue@myLoop1;
            else
                println("$a $b")
        }

    }
}