package com.geektech.testhw7month5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.testhw7month5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            addBtn.setOnClickListener {
                resultTv.text = Math().add(firstEd.text.toString(), secondEd.text.toString())
            }
            addBtn.setOnClickListener {
                resultTv.text = Math().divide(firstEd.text.toString(), secondEd.text.toString())
            }
        }
    }
}