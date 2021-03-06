package activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinprojects.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSave.setOnClickListener {
            val message : String = edtInput.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Key",message)
            startActivity(intent)

        }
        btnImpicit.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,"this is my text")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"share to sam shams scom"))

        }
        recyclerDemo.setOnClickListener {
            val intentRecycler = Intent(this,
                RecyclerActivity::class.java)
            startActivity(intentRecycler)
        }

        }

    }

