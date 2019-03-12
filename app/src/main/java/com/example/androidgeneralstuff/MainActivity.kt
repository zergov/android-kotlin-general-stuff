package com.example.androidgeneralstuff

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: ActivityListItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutManager = LinearLayoutManager(this)
        activities_menu.layoutManager = linearLayoutManager

        val activities = listOf(
            ActivityMenu("Progress bar", "Showcase some usage of progress bars"),
            ActivityMenu("Switch", "Showcase some usage of switches"),
            ActivityMenu("Settings menu", "Example of how I would do a basic settings menu."),
            ActivityMenu("Kotlin collections", "Here, I am just having fun with basic kotlin collections functions."),
            ActivityMenu("Networking", "Fetching informations from the webz"),
            ActivityMenu("Camera", "Do you even selfie bruh?"),
            ActivityMenu("GPS", "WHERE ARE WE?!?!?")
        )
        adapter = ActivityListItemAdapter(activities)
        activities_menu.adapter = adapter
    }

    data class ActivityMenu(val title: String, val description: String)
}
