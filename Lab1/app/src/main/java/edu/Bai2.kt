package edu

fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}

//Dòng 7 lấy giá trị đầu vào từ người dùng và lưu vào biến s.
//Dòng 8 kiểm tra xem giá trị s có hợp lệ (không phải null) hay không. Nếu hợp lệ, giá trị đó sẽ được chuyển thành số thực và gán cho biến a