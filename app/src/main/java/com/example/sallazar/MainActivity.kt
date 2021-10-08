package com.example.sallazar

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/** Bu aktivite, kullanıcının bir zar atmasına ve sonucu ekranda görüntülemesine olanak tanır.*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Tıklandı", Toast.LENGTH_SHORT).show()
            sallaZari()
        }
    }

    /** Zar atılır ve sonucu ekrana günceller.*/
    private fun sallaZari() {
        /** 6 yüzlü zar oluşturulur ve sallanır*/
        val zar1 = Zar(6).salla()
        val zar2 = Zar(6).salla()

        /** gelen sonuç ekranda güncellenir*/
        val gelenSonuc1: TextView = findViewById(R.id.textView2)
        val gelenSonuc2: TextView = findViewById(R.id.textView3)

        gelenSonuc1.text = zar1.toString()
        gelenSonuc2.text = zar2.toString()

    }
}

/** Zar sınıfında [1-yüzsayısı] aralığında rassal sayı üretilir.*/
class Zar(private val yuzSayisi: Int) {
    fun salla(): Int {
        return (1..yuzSayisi).random()
    }
}