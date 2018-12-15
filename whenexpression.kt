fun main(args:Array<String>){
    var age = 100
    //in expression they return the last statement and they must be same return type
    //in if expression they must be else because it fails they should be a case ,done with the same when also


   /* when(age)
    {
        in 1..10 -> print("they are childrens")
        in 10..17->print("they are teens")
        in 18..30 ->print("they are young ")
        else ->print("they are old ")
    }*/
   var agein = when (age)
    {
        in 1..10-> "they are childrens"
       in 11..17->"they are teens"
       in 18..30->"they are young"
       else->{
           "they are old"
       }
    }
    print(agein)
}