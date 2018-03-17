package com.example.marbl.kotlinuranai

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 占いの値設定用
    var name: String = ""
    val fortunelist = arrayOf("大吉", "吉", "凶", "大凶")
    // ラッキーカラーの値設定用
    var name2: String = ""
    var luckyColorList = arrayOf("レッド", "ブルー", "ネイビー", "グレー", "ブラック");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message2.setTypeface(Typeface.createFromAsset(getAssets(), "みかちゃん-P.ttf"))
        var button = findViewById<Button>(R.id.uranau)

        uranau.setOnClickListener {
            getFortune()
        }

    }

    fun getFortune() {
        val index = Random().nextInt(fortunelist.size)
        val index2 = Random().nextInt(luckyColorList.size)
        name = fortunelist[index]
        name2 = luckyColorList[index2]

        uranai.setText(name)
        when{
            name == "大吉" -> luckycolor.setText("めげるな！")
            name == "吉" -> luckycolor.setText("めげるな！!!!!!!")
            name == "凶" -> luckycolor.setText("ahoaho！!!!!!!")
            name == "大凶" -> luckycolor.setText("sssssss！!!!!!!")
            else -> luckycolor.setText("めげるな！!!!!!")
        }
    }
}
