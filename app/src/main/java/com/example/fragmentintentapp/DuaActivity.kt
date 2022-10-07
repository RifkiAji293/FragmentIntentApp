package com.example.fragmentintentapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DuaActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        //Inisialisasi Button
        val btnClicksatu: Button =findViewById(R.id.buton21)
        btnClicksatu.setOnClickListener(this)

        //Inisialisasi Button
        val btnClickdua: Button =findViewById(R.id.buton22)
        btnClickdua.setOnClickListener(this)

        //Inisialisasi Button
        val btnClicktiga: Button =findViewById(R.id.buton23)
        btnClicktiga.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buton21 -> {
                val url="https://www.tokopedia.com/crucialauthorized/memory-sodimm-crucial-ddr4-2666-3200-ram-sodimm-laptop-sodimm-notebook-8gb-ddr4-3200?extParam=ivf%3Dfalse"
                val web= Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }

            R.id.buton22 -> {
                val url="https://www.tokopedia.com/kingstonofficial/kingston-fury-impact-seri-andal-sodimm-16gb-ddr4-3200mhz-cl20?extParam=ivf%3Dfalse%26src%3Dsearch"
                val web1= Intent(Intent.ACTION_VIEW)
                web1.setData(Uri.parse(url))
                startActivity(web1)
            }

            R.id.buton23 -> {
                val url="https://www.tokopedia.com/corsair-official/dominator-platinum-rgb-16gb-2-x-8gb-3200mhz-c16-cmt16gx4m2c3200c16-hitam?extParam=ivf%3Dfalse&src=topads"
                val web2= Intent(Intent.ACTION_VIEW)
                web2.setData(Uri.parse(url))
                startActivity(web2)
            }
        }
    }
}