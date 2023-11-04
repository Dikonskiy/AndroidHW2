package com.example.androidhw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val foods = mutableListOf(
            Characters(name = "Ayato", description = "Kamisato Ayato is both the head of the Kamisato Clan and the Yashiro Commissioner. The dedicated government official is the older sibling of Kamisato Ayaka and mentor to Thoma. Ayato works tirelessly behind the scenes to protect his family and the people of Inazuma.", image = R.drawable.ayato),
            Characters(name = "Hu Tao", description = "Hu Tao is the 77th Director of the Wangsheng Funeral Parlor in Genshin Impact and stands out even when dressed in near-black with subtle decorations. She, alongside Consultant Zhongli and the Ferrylady, is responsible for carrying out a centuries-old custom in Liyue.", image = R.drawable.hutao),
            Characters(name = "Zhongli", description = "Zhongli is the mysterious consultant of Wanghsheng Funeral Parlor. Nobody really knows where he came from, but he is very intelligent and knows rituals down to their tiniest details. Despite being viewed as an intelligent and very capable man, he has his own fair share of eccentricity.", image = R.drawable.zhongli),
            Characters(name = "Raiden", description = "The Raiden Shogun uses the tall female model. She has pale skin, purple eyes with light blue pupils, and long, dark violet hair that becomes lighter at the ends, which glow when she uses her Elemental Skill or her Elemental Burst. She also has a beauty mark below her right eye.", image = R.drawable.raiden),
            Characters(name = "Venti", description = "Summary. Venti is a playable Anemo character in Genshin Impact. He is a free-spirited, wine-loving bard in Mondstadt and the current mortal vessel of Barbatos. Also known as the God of Freedom, is the current Anemo Archon of The Seven who presides over Mondstadt.", image = R.drawable.venti),
            Characters(name = "Nahida", description = "Nahida is the current Dendro Archon, also known as Lesser Lord Kusanali, and was introduced as a playable character in Genshin Impact version 3.2. As a playable character, she is a catalyst user that can use the power of Dendro.", image = R.drawable.nahida),
            Characters(name = "Yoimiya", description = "Yoimiya is the current owner of Naganohara Fireworks; with her colorful fireworks and outgoing personality, Yoimiya is loved by everyone on Narukami Island. She was coined as the \"Queen of the Summer Festival,\" as they believe summer is not the same without her.", image = R.drawable.yoiymia),
            Characters(name = "Shenhe", description = "Shenhe was originally from a branch family of exorcists, but due to a series of coincidences, she became the disciple of an adeptus. She is a student solely of Cloud Retainer in name, but her impressive constitution and intelligence quickly won several other adepti over.", image = R.drawable.shenhe),
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(applicationContext, foods)
    }
}