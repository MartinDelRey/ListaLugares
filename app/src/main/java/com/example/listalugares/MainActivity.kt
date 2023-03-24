package com.example.listalugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var Lugarress: TextView
    val Lugares = arrayOf("Tequila", "Magdalena", "Arenal", "Guadalajara", "Guzman",
                          "Sayula", "Vallarta", "Amatitan", "Zacoalco", "Chetumal",
                          "San Jose", "Hostotipaquillo", "Tala")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         Lugarress = findViewById(R.id.txtLugars)
        val ListView: ListView = findViewById(R.id.listview_Lugares)

        val adaptador = ArrayAdapter(this, R.layout.list_item, Lugares)

        ListView.adapter = adaptador

        ListView.onItemClickListener = object:AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val item = ListView.getItemAtPosition(p2) as String
                Log.e("Valor Lista", item)
                Toast.makeText(applicationContext, "El valor es $item", Toast.LENGTH_LONG).show()
                Lugarress.text = item

            }
        }


    }
}


