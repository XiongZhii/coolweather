package com.example.xiongzhi.coolweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var testName:String = "demo"
    val name = lazy { "haha" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();
    }

    private fun init() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }
}
