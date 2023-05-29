package com.GuboD.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.GuboD.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        fibonacciNumbersUpTo200()

    }
    fun fibonacciNumbersUpTo200() {
        var a = 0
        var b = 1
        var c: Int

        var numbers_list= mutableListOf<Int>(a,b)
        while (true) {
            c = a + b
            if (c > 100)
                break

            numbers_list.add(c)

            a = b
            b = c
        }
        binding.rvfibonaccio.layoutM= LinearLayoutManager(this)
        var numbersAdapter=rvFibo(numbers_list)
        binding.rvfibonaccio.=numbersAdapter
    }


}
}




