package com.mac.dev.androidstudygroup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mac.dev.androidstudygroup.R
import com.mac.dev.androidstudygroup.model.Pokemon
import kotlinx.android.synthetic.main.pokemon_row.view.*
import java.lang.IllegalArgumentException

class PokemonAdapter(
    val context: Context,
    val pokemonList: List<Pokemon>,
    val itemClickListener: OnPokemonClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>(){

    interface OnPokemonClickListener{
        fun onItemclick(item: Pokemon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return PokemonViewHolder(LayoutInflater.from(context).inflate(R.layout.pokemon_row, parent, false))
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is PokemonViewHolder -> holder.bind(pokemonList[position], position)
            else -> throw IllegalArgumentException("No se reconoce el holder")
        }
    }

    inner class PokemonViewHolder(itemView: View): BaseViewHolder<Pokemon>(itemView){
        override fun bind(item: Pokemon, position: Int) {

            itemView.setOnClickListener{ itemClickListener.onItemclick(item) }

            Glide.with(context).load(item.img).into(itemView.pokemon_img)
            itemView.pokemon_name.text = item.name
        }

    }

}