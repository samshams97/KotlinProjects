package activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import adapters.AdapterCalss
import com.example.kotlinprojects.R
import modelCalsses.hobby

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        setUpRecycler()


    }

    private fun setUpRecycler() {
        val recyclerview = findViewById(R.id.recycler) as RecyclerView
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val user = ArrayList<hobby>()
        user.add(
            hobby(
                "sam",
                R.drawable.iconfotbal
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        user.add(
            hobby(
                "sam",
                R.mipmap.ic_launcher
            )
        )
        val adapter = AdapterCalss(user)
        recyclerview.adapter = adapter


    }
}
