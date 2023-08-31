package com.example.mvvmmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val image:ImageView=findViewById(R.id.characterImage)
        val name:TextView=findViewById(R.id.showName)
        val species:TextView=findViewById(R.id.species)
        val gender:TextView=findViewById(R.id.gender)
        val status:TextView=findViewById(R.id.status)
        val clickedItem=intent?.getParcelableExtra<Result>("clickedItem")
name.text="Name:${clickedItem?.name}"
        species.text="Species:${clickedItem?.species}"
        gender.text="Gender:${clickedItem?.gender}"
        status.text="Status:${clickedItem?.status}"
        if (clickedItem != null) {
            image.setImage(clickedItem.image)
        }





    }
}