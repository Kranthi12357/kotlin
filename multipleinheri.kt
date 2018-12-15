open class animal{
    var color = "black"
    fun eat(){
        println("animal is eating $color")
    }
}
class dog:animal(){
    var breed = ""
    fun bark(){
        println("dog is barking  $breed   $color" )
    }
}
class cat:animal(){
    var age = 0
    fun meow(){
        println("cat is meow $age $color")
    }
}
fun main(args:Array<String>){
    var dogs = dog()
    dogs.breed = "dolmatian"
    dogs.color = "red"
    dogs.bark()
    dogs.eat()
    println(dogs.color)

    var cats = cat()
    cats.age = 10
    cats.color = "white"
    cats.meow()
    cats.eat()

}