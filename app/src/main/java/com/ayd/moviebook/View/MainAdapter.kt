package com.ayd.moviebook.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayd.moviebook.Model.Movie
import com.ayd.moviebook.databinding.LayoutRvItemBinding
import com.bumptech.glide.Glide

class MainAdapter : RecyclerView.Adapter<MainViewHolder>() {

    var movies = mutableListOf<Movie>()

    fun setMovieList(movies: List<Movie>) {
        this.movies = movies.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = LayoutRvItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.movieTitle.text = movie.title
        Glide.with(holder.itemView.context).load(movie.poster)//.placeholder(R.drawable.placeholder)
            .into(holder.binding.moviePoster)
        holder.binding.movieimdb.text = movie.rating

    }

    override fun getItemCount(): Int {
        return movies.size
    }

}

class MainViewHolder(val binding: LayoutRvItemBinding): RecyclerView.ViewHolder(binding.root)  {

}
