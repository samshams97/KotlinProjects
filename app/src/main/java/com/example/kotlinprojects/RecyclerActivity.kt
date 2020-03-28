package com.example.kotlinprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recycler = findViewById(R.id.recycler) as RecyclerView
        recycler.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        val user = ArrayList<hobby>()
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        user.add(hobby("the first",R.drawable.ic_launcher_background))
        val adapter = AdapterCalss(user)
        recycler.adapter = adapter

    }
}
