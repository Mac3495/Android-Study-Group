package com.mac.dev.androidstudygroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mac.dev.androidstudygroup.adapter.PokemonAdapter
import com.mac.dev.androidstudygroup.model.Pokemon
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PokemonAdapter.OnPokemonClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecycler()
    }

    private fun setupRecycler(){
        recycler_view.layoutManager = LinearLayoutManager(this)
        val pokemonList = listOf<Pokemon>(
            Pokemon("Charmander", "https://media.redadn.es/imagenes/pokemon-lets-go-pikachu-nintendo-switch_325422.jpg"),
            Pokemon("Bulbasaur", "https://sooluciona.com/wp-content/uploads/2018/09/bulbasaur.jpg"),
            Pokemon("Squiertle", "https://nextn-cdn-nextn.netdna-ssl.com/wp-content/uploads/2018/06/1807-03-Pok%C3%A9mon-GO-Squirtle-gafas-de-sol.jpg"),
            Pokemon("Charmander", "https://media.redadn.es/imagenes/pokemon-lets-go-pikachu-nintendo-switch_325422.jpg"),
            Pokemon("Bulbasaur", "https://sooluciona.com/wp-content/uploads/2018/09/bulbasaur.jpg"),
            Pokemon("Squiertle", "https://nextn-cdn-nextn.netdna-ssl.com/wp-content/uploads/2018/06/1807-03-Pok%C3%A9mon-GO-Squirtle-gafas-de-sol.jpg"),
            Pokemon("Charmander", "https://media.redadn.es/imagenes/pokemon-lets-go-pikachu-nintendo-switch_325422.jpg"),
            Pokemon("Bulbasaur", "https://sooluciona.com/wp-content/uploads/2018/09/bulbasaur.jpg"),
            Pokemon("Squiertle", "https://nextn-cdn-nextn.netdna-ssl.com/wp-content/uploads/2018/06/1807-03-Pok%C3%A9mon-GO-Squirtle-gafas-de-sol.jpg")
        )

        recycler_view.adapter = PokemonAdapter(this, pokemonList, this)

    }

    override fun onItemclick(item: Pokemon) {
        val intent = Intent(this, PokemonActivity::class.java)
        intent.putExtra("imgURL", item.img)
        startActivity(intent)
    }
}