package com.example.fragmentintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi ButtonSatu
        val btnClicksatu: Button =findViewById(R.id.btnsatu)
        btnClicksatu.setOnClickListener(this)

        //Inisialisasi ButtonDua
        val btnClickdua: Button =findViewById(R.id.btndua)
        btnClickdua.setOnClickListener(this)

        //Inisialisasi ButtonTiga
        val btnClicktiga: Button =findViewById(R.id.btntiga)
        btnClicktiga.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        //Program untuk memerintahkan ButtonSatu pada activity_main  untuk membuka halaman DuaActivity
        when(v?.id){
            R.id.btnsatu -> {
                val halsatu = Intent(this, SatuActivity::class.java)
                startActivity(halsatu)
            }

            R.id.btndua -> {
                val haldua = Intent(this, DuaActivity::class.java)
                startActivity(haldua)
            }

            R.id.btntiga -> {
                val haltiga = Intent(this, TigaActivity::class.java)
                startActivity(haltiga)
            }
        }


    }

    }
