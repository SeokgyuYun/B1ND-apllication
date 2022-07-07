package kr.hs.dgsw.seokgyu.assignment

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter (private val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var datas = mutableListOf<Data>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        private val text: TextView = itemView.findViewById(R.id.tv)
        private val img: ImageView = itemView.findViewById(R.id.iv)
        private val name: TextView = itemView.findViewById(R.id.name)
        private val view: View = v

        fun bind(item: Data) {
            text.text = item.text
            name.text = item.name
            Glide.with(itemView).load(item.img).into(img)

            view.setOnClickListener {
                val intent = Intent(context, MainActivity2::class.java)
                intent.putExtra("title", item.text)
                intent.putExtra("img", item.img)
                intent.putExtra("name", item.name)
                intent.putExtra("explain", item.explain)
                context.startActivity(intent)
            }
        }
    }
}