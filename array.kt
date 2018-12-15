fun main(args:Array<String>) {

    var list = Array<Int>(5) { 4 }
    list[1] = 5
    list[4] = 10
    for (i in list) {
        print(i)

    }


    var list1 = listOf(1, 2, 3, 4, 5,6,7,8)
        for(i in list1){
            print(i)
        }
    var  list3 = ArrayList<Int>()
    list3.add(10)
    var list2 = arrayListOf<Int>(1,3,4)
    list2.add(10)
    list2.add(5)
    list2.remove(3)
    list2.add(1,6)
    list2[1] = 9
    list2.add(1,8)
    for(i in list2){
        print(i)
    }
}


