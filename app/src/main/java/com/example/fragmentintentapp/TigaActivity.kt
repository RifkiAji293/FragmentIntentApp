package com.example.fragmentintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TigaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiga)

        //Inisialisasi Button
        val btnClicksatu: Button =findViewById(R.id.buton31)
        btnClicksatu.setOnClickListener(this)

        //Inisialisasi Button
        val btnClickdua: Button =findViewById(R.id.buton32)
        btnClickdua.setOnClickListener(this)

        //Inisialisasi Button
        val btnClicktiga: Button =findViewById(R.id.buton33)
        btnClicktiga.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.buton31 -> {
                val url="https://www.tokopedia.com/samsung-storage/samsung-ssd-870-qvo-1tb-2tb-4tb-8tb-2-5-sata3-qlc-internal-ssd-1tb?extParam=ivf%3Dfalse%26src%3Dsearch&refined=true"
                val web= Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }

            R.id.buton32 -> {
                val url="https://www.tokopedia.com/cockomputer/wd-ssd-black-sn770-500gb?extParam=ivf%3Dfalse%26src%3Dsearch&refined=true"
                val web1= Intent(Intent.ACTION_VIEW)
                web1.setData(Uri.parse(url))
                startActivity(web1)
            }

            R.id.buton33 -> {
                val url="https://www.tokopedia.com/seagate/seagate-firecuda-530-ssd-500gb-m-2-2280-nvme-gen-4?extParam=ivf%3Dfalse%26src%3Dsearch"
                val web2= Intent(Intent.ACTION_VIEW)
                web2.setData(Uri.parse(url))
                startActivity(web2)
            }
        }


    }
}