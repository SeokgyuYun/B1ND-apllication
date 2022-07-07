package kr.hs.dgsw.seokgyu.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.name
import kotlinx.android.synthetic.main.activity_main2.view.*
import kotlinx.android.synthetic.main.item.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Glide.with(this).load(intent.getStringExtra("img")).into(img)
        _title.text = intent.getStringExtra("title")
        name.text = intent.getStringExtra("name")
        explain.text = intent.getStringExtra("explain")

        img_btn.setOnClickListener {
            finish()
        }
    }
}