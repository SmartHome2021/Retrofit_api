import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fulljson.models.Film
import com.example.fulljson.R

import com.example.fulljson.models.FilmsResponse
import java.util.logging.XMLFormatter

class MyMovieAdapter(private val context: Context, private val movieList: List<Film>): RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {



    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val poster: ImageView = itemView.findViewById(R.id.filmPoster)
        val title: TextView = itemView.findViewById(R.id.filmTitle)
        val fullTitle: TextView = itemView.findViewById(R.id.filmFullTitle)
        val rank: TextView = itemView.findViewById(R.id.filmRank)
        val year: TextView = itemView.findViewById(R.id.filmYear)
        val rating: TextView = itemView.findViewById(R.id.filmRating)
        val count: TextView = itemView.findViewById(R.id.filmCount)
        val crew: TextView = itemView.findViewById(R.id.filmCrew)

        fun bind(listItem: Film){
            Glide .with(poster.context) .load(listItem.image) .into(poster)
            title.text = listItem.title
            fullTitle.text = listItem.fullTitle
            rank.text = listItem.rank.toString()
            year.text = ("Год выпуска: " + listItem.year.toString())
            rating.text = listItem.imDbRating.toString()
            count.text = listItem.imDbRatingCount.toString()
            crew.text = listItem.crew

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)
    }
    }
