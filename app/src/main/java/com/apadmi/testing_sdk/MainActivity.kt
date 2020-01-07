package com.apadmi.testing_sdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apadmi.actual_sdk.StartingActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartingActivity().logPoo()
    }
}
