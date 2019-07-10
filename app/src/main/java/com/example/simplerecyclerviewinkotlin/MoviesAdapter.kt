package com.example.simplerecyclerviewinkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_item.view.*

class MoviesAdapter(val movies: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = movies[position]
        holder.view.textViewTitle.text = movie.title
        holder.view.textViewLanguage.text = movie.language
        holder.view.textViewType.text = movie.type
        holder.view.textViewRating.text = movie.rating
        holder.view.textViewLikePercent.text = movie.likePercent.toString() + "%"
        holder.view.textViewVotesCount.text = movie.voteCount.toString() + " votes"
        holder.view.textViewIsNew.visibility = if (movie.isNew == 1) View.VISIBLE else View.INVISIBLE

        Glide.with(holder.view.context)
            .load(movie.image)
            .into(holder.view.imageView)

    }

    class MoviesViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}