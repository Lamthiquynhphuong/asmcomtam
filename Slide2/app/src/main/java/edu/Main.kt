package edu

// null safety: 1 cơ chế cho phép định nghĩa biến null hoặc không
// NPE: là lỗi biên dich
// cố gắng truy cập, thao tác vào 1 biến
// đói tượng mà chưa được cáp phát giá trị

fun main(args: Array<String>) {
    println("Hello")
    var name = "PHUONG LAM" // bien co gia tri
//name=null; loi
    var name2: String? = "ABCDE" // bien co the null
    name2 = null // k loi
    println(name2?.length)

    // Elvis operator: ?:
    val length=name2?.length ?:0
    println("Length :$length")

    name2="ABCQNNN"
    // !!: in ra su dung bien neu bien chac chan la bien khong null
    println(name2!!.length) //null

    //let :safe call: tu khoa let ,cho phep goi 1 cach an toan
    // ham let chi thuc thi khi name!= null
    // if name != null thi thuc thi ham trong let
    name?.let {
        //it:name
        println(it)
        println(it.length)
    } ?:{ // ket hop toan tu elvis de xu ly truong hop name = null
        println("name == null ")
    }

    // thao tac voi chuoi-String
    // muon in gia tri 1 bien trong chuoi
    val i=100
    // cu phap  $
    println("gia tri i=$i")
    println("${i +1} la gia tri cua i +1")


    // lamda k co tham so
    val hello ={
        println("Hello")
        println("ohayo gssssssa")
    }
    // goi nhu 1 phuong thuc
    hello()

    val sayHi:(text: String)->String={
        ("Hi $it")
    }
    println(sayHi("Hi Huy 3333"))


}
// phuong thuc
 fun run( a:Int ,b:Int){
     println(a+b)
    println("run")
 }
// phuong thuc co gia tri tra ve sau khi ket thuc
// Int la kieu tra ve ~~ trung voi gia tri sau chu return
fun cal(a:Int, b:Int):Int{
    return a + b
}

