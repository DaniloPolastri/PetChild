package com.example.petchild3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petchild3.Database.DB_Controller

class PetFinder_Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_finder__result)

        var breeds = DB_Controller.getBreeds()
    }
}
