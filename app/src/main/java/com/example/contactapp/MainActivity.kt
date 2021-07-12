package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var contactList= listOf<Contact>(
            Contact("Muteteyimana Marie","+250781849006","mariemuteteyimana@gmail.com"),
            Contact("Kabatesi Geraldine","+250781769566","kabatesigeraldine@gmail.com"),
            Contact("Uwase Jeannine","+2507876435657","jeannineuwase@gmail.com"),
            Contact("Intwaza Belyse","+250785678765","intwazabelyse@gmail.com")


        )
        rvContact=findViewById(R.id.rvContact)
        var contactAdapter=ContactRvAdapter(contactList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter

    }
}