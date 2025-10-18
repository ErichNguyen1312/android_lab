package com.example.kotline_feature

fun main(){
    println("Nhóm 12 - Nguyễn Đăng Vinh \n")
//    bai32()
//    bai33()
//    bai34()
    bai35()
}

//bai
fun bai32(){

    println("Nhap danh sach: ")
    var danhSach = mutableListOf<Int >()

    while(true) {
        var value = readln()
        if(value == ""){
            break
        }else {
            danhSach.add(value.toInt())
        }
    }
    println("Danh sach da nhap: ")
    danhSach.forEach { i -> println("Value : "+ i) }

    var group = danhSach.groupBy {
        if (it % 2 ==0 ) "Chan" else "Le"

    }
    println("Group by Chan: ${group["Chan"]}")
    println("group by Le: ${group["Le"]}")
}

fun bai33(){
    println("Nhap danh sach chuoi: ")
    var danhSachChuoi = mutableListOf<String >()

    while(true) {
        var value = readln()
        if(value == ""){
            break
        }else {
            danhSachChuoi.add(value)
        }
    }
    println("Danh sach da nhap: ")
    danhSachChuoi.forEach { i -> println("Value : "+ i) }


    //sorted by
    println("Sap xep chuoi theo do dai: ")
    var danhSachSapXep = danhSachChuoi.sortedBy { it.length }

    danhSachSapXep.forEach {
        i -> println(i)
    }

}

fun bai34(){
    println("Nhap danh sach chuoi: ")
    var danhSachChuoi = mutableListOf<String >()

    while(true) {
        var value = readln()
        if(value == ""){
            break
        }else {
            danhSachChuoi.add(value)
        }
    }
    println("Danh sach da nhap: ")
    danhSachChuoi.forEach { i -> println("Value : "+ i) }


    var chuoiDaiNhat = danhSachChuoi.maxBy { it.length }
    println("Chuoi tim duoc: " + chuoiDaiNhat)
}

fun bai35(){
    println("Nhap danh sach: ")
    var danhSach = mutableListOf<Int >()

    while(true) {
        var value = readln()
        if(value == ""){
            break
        }else {
            danhSach.add(value.toInt())
        }
    }
    println("Danh sach da nhap: ")
    danhSach.forEach { i -> println("Value : "+ i) }

    //tim chi so cua phan tu dau tien thoa man:  chia het cho 2
    var result = danhSach.indexOfFirst { it %2 ==0 }
    println("Chỉ số của phần tử đầu tiên chia hết cho 2 là :  $result mang giá trị:  ${danhSach.get(result)}" )
}

fun bai37(){

}

fun bai39(){}
