package com.example.operator_overloading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var thuNhap = ThuNhap(200.000)
        var thuNhap1 = ThuNhap(300.000)
        var result = thuNhap + thuNhap1
        Log.d("bbb","$result")
    }
}
class ThuNhap (var tienHangNgay:Double){
    operator fun plus(thuNhap: ThuNhap) = 123
}
