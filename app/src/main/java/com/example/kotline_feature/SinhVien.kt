package com.example.kotline_feature

import kotlin.math.sinh


class SinhVien(val maSV:String, val hoTen:String, val diemToan:Double, val diemLy: Double, val diemHoa: Double){
    fun tinhDTB(): Double{
         return (diemToan + diemLy + diemHoa) /3
    }

    fun xepLoai():String{
        var diemTb = tinhDTB()

        return when {
            diemTb >= 8.0 -> "Giỏi"
            diemTb >= 6.5 -> "Khá"
            diemTb >= 5.0 -> "Trung bình"
            else -> "Yếu"
        }

    }

    fun hienThi(){
        println(" Ma sinh vien: ${maSV}, Ho ten: ${hoTen}")
        println(" Diem trung binh ${tinhDTB()}, xep loai: ${xepLoai()}")
    }



}
fun main(){
    println("Nhom 12:..")

    println("Nhap ma so sinh vien: ")
    val maSinhVien = readln()

    println("Nhập họ tên sinh viên: ")
    val hoTenSinhVien = readln()

    println("Nhap diem toan: ")
    val diemToan = readln().toDouble()
    println("Nhap diem ly: ")
    val diemLy = readln().toDouble()

    println("Nhap diem hoa: ")
    val diemHoa = readln().toDouble()

    val sinhVien = SinhVien(maSinhVien,hoTenSinhVien,diemToan,diemLy,diemHoa)
    sinhVien.hienThi()


}
