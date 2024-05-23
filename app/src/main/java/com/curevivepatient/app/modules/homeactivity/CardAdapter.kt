import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.curevivepatient.app.R

class CardAdapter(private val items: List<String>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        // Bind your data here
        holder.cardTitle.text = items[position]
    }

    override fun getItemCount(): Int = 4

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle: TextView = itemView.findViewById(R.id.card_title)
        val cardTime: TextView = itemView.findViewById(R.id.card_time)
        val cardStatus: TextView = itemView.findViewById(R.id.card_status)
    }
}
