package com.example.kotline_feature

data class SanPham( val maSP:String,val tenSP:String, val gia:Double)



fun main (){

    println("Nhom 12: ")

    val danhSachSP = mutableListOf<SanPham>()


    println("Nhap thong tin 3 san pham: ")

    for (i in 1..3){
        print("Nhập mã sản phẩm : ")
        val maSP = readln()

        print("Nhập tên sản phẩm: ")
        val tenSP = readln()

        print("Nhập giá sản phẩm: ")
        val giaSP = readln().toDouble()
        danhSachSP.add(SanPham(maSP,tenSP,giaSP))
    }


    println("In danh sach san pham: ")
//    danhSachSP.forEach { t -> println(t.toString())}
    danhSachSP.forEach { sp -> println("Ma san pham: ${sp.maSP}, ten san pham: ${sp.tenSP}, gia: ${sp.gia} ")}

    println("Loc san pham co gia > 10000: ")
    val listFilter = danhSachSP.filter { it.gia > 10000 }
//    println(listFilter)
    listFilter.forEach { sp -> println("Ma san pham: ${sp.maSP}, ten san pham: ${sp.tenSP}, gia: ${sp.gia} ")}

}