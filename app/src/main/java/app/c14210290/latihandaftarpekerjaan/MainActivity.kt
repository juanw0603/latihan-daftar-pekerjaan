package app.c14210290.latihandaftarpekerjaan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val nambahPekerjaan = findViewById<ImageView>(R.id.nambahPekerjaan)

        nambahPekerjaan.setOnClickListener{
            val intent_Nambahpekerjaaan = Intent(this@MainActivity,nambahAtauEdit_Data::class.java)
            startActivity(intent_Nambahpekerjaaan)
        }

    }
}