package com.example.kotline_feature

import kotlin.math.sinh

open class Nguoi(val ten: String, val tuoi:Int){
    open fun hienthi(){
        println("Ten: $ten, tuoi $tuoi")
    }
}


class SinhVien( ten:String,  tuoi:Int, val maSV :String , val diem: Double): Nguoi(ten,tuoi){
    override fun hienthi(){
//        println("Ten: $ten, tuoi $tuoi, ma sinh vien: ${maSV}, diem: ${diem}")

        super.hienthi()
        println("ma sinh vien: ${maSV}, diem: ${diem}")
    }
}

fun main(){

    println("Nhom 12: ")

    val sinhVienDemo = SinhVien("Nguyen a",20,"232111",9.5)
    sinhVienDemo.hienthi()
}
