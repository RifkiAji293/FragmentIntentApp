package com.example.fragmentintentapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SatuActivity : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satu)

        //Inisialisasi ButtonSatu
        val btnClicksatu: Button =findViewById(R.id.buton1)
        btnClicksatu.setOnClickListener(this)

        //Inisialisasi ButtonDua
        val btnClickdua: Button =findViewById(R.id.buton2)
        btnClickdua.setOnClickListener(this)

        //Inisialisasi ButtonTiga
        val btnClicktiga: Button =findViewById(R.id.buton3)
        btnClicktiga.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        //Program untuk memerintahkan ButtonSatu pada activity_main  untuk membuka halaman DuaActivity
        when(v?.id){
            R.id.buton1 -> {
                val url="https://www.tokopedia.com/nanokomputer/intel-core-i5-11400f-processor-intel-gen-11-lga-1200-6-core?extParam=ivf%3Dfalse%26src%3Dsearch"
                val web=Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }

            R.id.buton2 -> {
                val url="https://www.tokopedia.com/jayamultikom/intel-core-i7-11700f-8-core-16-threads-up-to-4-9-ghz-gen-11-new?extParam=ivf%3Dfalse&src=topads"
                val web1=Intent(Intent.ACTION_VIEW)
                web1.setData(Uri.parse(url))
                startActivity(web1)
            }

            R.id.buton3 -> {
                val url="https://www.tokopedia.com/nanokomputer/amd-ryzen-5-5600g-processor-amd-am4-zen-3-cezanne-6-cores-12-threads?extParam=ivf%3Dfalse%26src%3Dsearch"
                val web2=Intent(Intent.ACTION_VIEW)
                web2.setData(Uri.parse(url))
                startActivity(web2)
            }
        }

    }
}