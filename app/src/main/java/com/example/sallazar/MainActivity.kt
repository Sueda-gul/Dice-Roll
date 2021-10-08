package com.example.sallazar

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/** Bu aktivite, kullanıcının bir zar atmasına ve sonucu ekranda görüntülemesine olanak tanır.*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { sallaZari() }
    }
    /** Zar atılır ve sonucu ekrana günceller.*/
    private fun sallaZari() {
        /** 6 yüzlü zar oluşturulur ve sallanır*/
        val zar1 = Zar(6).salla()
        val zar2 = Zar(6).salla()

        /** gelen sonuç ekranda güncellenir*/
        val gelenSonuc1: ImageView = findViewById(R.id.imageView)
        val gelenSonuc2: ImageView = findViewById(R.id.imageView4)

        when (zar1) {
            1 -> gelenSonuc1.setImageResource(R.drawable.dice_1)
            2 -> gelenSonuc1.setImageResource(R.drawable.dice_2)
            3 -> gelenSonuc1.setImageResource(R.drawable.dice_3)
            4 -> gelenSonuc1.setImageResource(R.drawable.dice_4)
            5 -> gelenSonuc1.setImageResource(R.drawable.dice_5)
            6 -> gelenSonuc1.setImageResource(R.drawable.dice_6)
        }
        when (zar2) {
            1 -> gelenSonuc2.setImageResource(R.drawable.dice_1)
            2 -> gelenSonuc2.setImageResource(R.drawable.dice_2)
            3 -> gelenSonuc2.setImageResource(R.drawable.dice_3)
            4 -> gelenSonuc2.setImageResource(R.drawable.dice_4)
            5 -> gelenSonuc2.setImageResource(R.drawable.dice_5)
            6 -> gelenSonuc2.setImageResource(R.drawable.dice_6)
        }

    }
}
/** Zar sınıfında [1-yüzsayısı] aralığında rassal sayı üretilir.*/
class Zar(private val yuzSayisi: Int) {
    fun salla(): Int {
        return (1..yuzSayisi).random()
    }
}