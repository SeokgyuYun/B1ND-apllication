package kr.hs.dgsw.seokgyu.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.item.*

class MainActivity : AppCompatActivity() {
    lateinit var Adapter: Adapter
    val datas = mutableListOf<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Recycler()
    }
    private fun Recycler() {
        Adapter = Adapter(this)
        rv.adapter = Adapter
        datas.apply {
            add(Data(img = "https://blog.kakaocdn.net/dn/pKOJP/btqDlNwKehz/7rpAzw6OoFWkScDDeYkfFK/img.png", text = "송우기 너무 예뻐요", name = "윤석규", explain = "역시 송우기가 최고지"))
            add(Data(img = "https://dimg.donga.com/wps/NEWS/IMAGE/2022/06/22/114047969.2.jpg", text = "아이유 너무 예뻐요", name = "윤석규", explain = "역시 아이유가 최고지"))
            for (i in 1..100) {
                add(Data(img = "https://ifh.cc/g/mDlrp0.jpg", text = "민재형 사랑해요$i", name = "최민재$i", explain = "민재형 사랑해요"))
            }

            Adapter.datas = datas
            Adapter.notifyDataSetChanged()

        }
    }
}
