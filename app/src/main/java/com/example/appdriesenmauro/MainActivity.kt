package com.example.appdriesenmauro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appdriesenmauro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var sampleActivityItems = arrayListOf(Activity("de test event", "12/01/2022"),
            Activity("de test event 2","12/03/2022"),
            Activity("de test event 3","10/02/2023")
        )

        var adapter = ActivityAdapter(sampleActivityItems)

        binding.rvwAcivity.adapter = adapter
        binding.rvwAcivity.layoutManager = LinearLayoutManager(this)
    }
}