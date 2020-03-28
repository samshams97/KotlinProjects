package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinprojects.R
import modelCalsses.hobby

class AdapterCalss(private val hobbieList: ArrayList<hobby>) :
    RecyclerView.Adapter<AdapterCalss.TestViewHolder>() {
    //classs adapter(val listClass : ArrayList<>()):Rec

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle = itemView.findViewById(R.id.txvTitle) as TextView
        val imgShare = itemView.findViewById(R.id.imgShare) as ImageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val infater = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return TestViewHolder(infater)
    }

    override fun getItemCount(): Int {
        return hobbieList.size
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val user: hobby = hobbieList[position]
        holder.textTitle.text = user.title
        holder.imgShare.setImageResource(user.image)
    }
}

