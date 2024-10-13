package edu

fun main(args: Array<String>) {
    // nut tam giac mau xanh dung de chay chuong trinh
    // cac lenh viet o trong ham main nay
    var name: String = "Phuong Lam"
    var age: Int = 9
    // khong can chi dinh kieu du lieu
    println(name + " - " + age)
    println("$name -$age")
    println(age)
    // cau lenh dieu kien
    // if else else if switch
    var ketqua = if (age > 10) {
        "lon hon 10"
    }

//    else if(age == 100){
//        println("bang 100")
//    }
    else {
        println("nho hon 10")
    }

    println(ketqua)

    // switch-when

    var score = 10
    when (score) {
        1 -> println("score=1")
        2 -> println("score=2")
        else -> println("!= 1 or 2")
    }
    println("-----------------")
    // vong lap for :chay tu 5 den 7
    // vong lap for in
    for (i in 5..7) {
        println("i =$i")
    }
    println("-----------------")
// downTo :giam tu 7 ->5

    for (i in 7 downTo 1) {
        println("i=$i")
    }
    println("-----------------")

    //step :tang hoac giam 2 don vi
    for (i in 10..19 step 2) {
        println("i=$i")
    }
    println("-----------------")

    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // array so nguyen

    for (item in arr) {
        println("item=$item")
    }
    println("-----------------")
    var names = listOf("vvv", "GGG", "HHH")
    for (name in names) {
        println("name=$name")
    }
    println("-----------------")


    // mang hon hop:nhieu kieu du lieu trong 1 array
    val mix: Array<Any> = arrayOf(1, "aa", true, 3.55)
    for (item in mix) {
        println("item=$item")
    }
    var i = 1
    while (i <= 5) {
        println("i=$i")
//        if (i == 2) continue;// bo qua cau lenh phia duoi va chay vong lap tiep
        if (i == 3) break ;// stop and exit loop
        i++
    }

}
