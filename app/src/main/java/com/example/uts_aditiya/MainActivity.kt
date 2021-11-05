package com.example.uts_aditiya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(
            DataModel(
                R.drawable.c, "c", "c", "bahasa pemrograman tingkat tinggi dan general-purpose yang digunakan dalam sehari-hari"
            )
        )

        data?.add(
            DataModel(
                R.drawable.html, "html", "html", "bahasa yang digunakan untuk membuat halaman web. Bagi yang berkecimpung di dunia perangkat gadget dan ilmu komputer, pasti sudah tidak asing lagi dengan berbagai kode di dalamnya."
            )
        )

        data?.add(
            DataModel(
                R.drawable.php, "php", "php", "Bagian dari Bahasa Pemrograman, Berikut Penjelasan Selengkapnya. ... PHP adalah singkatan rekursif untuk \"PHP: Hypertext Preprocessor\", yaitu bahasa pemrograman yang digunakan secara luas untuk penanganan pembuatan dan pengembangan sebuah situs web dan bisa digunakan bersamaan dengan HTML."
            )
        )

        data?.add(
            DataModel(
                R.drawable.pytho, "python", "python", "salah satu bahasa pemrograman yang dapat melakukan eksekusi sejumlah instruksi multi guna secara langsung (interpretatif) dengan metode orientasi objek."
            )
        )

        data?.add(
            DataModel(
                R.drawable.pytho, "python", "python", "salah satu bahasa pemrograman yang dapat melakukan eksekusi sejumlah instruksi multi guna secara langsung (interpretatif) dengan metode orientasi objek."
            )
        )

        data?.add(
            DataModel(
                R.drawable.java, "java", "java", "pemrograman tingkat tinggi yang berorientasi objek dan program java tersusun dari bagian yang disebut kelas."
            )
        )



        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener {
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

}