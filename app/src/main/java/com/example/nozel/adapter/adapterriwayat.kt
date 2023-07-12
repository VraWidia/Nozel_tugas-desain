package com.example.nozel.adapter
import android.annotation. SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nozel.model.RiwayatModel


import com.example.nozel.R

//import com.squareup.picasso.Picasso
import kotlin.collections.ArrayList

class adapterriwayat (var activity: Activity, var data: ArrayList<RiwayatModel>): RecyclerView.Adapter<adapterriwayat.Holder>() {
    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val tvKategori = view.findViewById<TextView>(R.id.tvkategori)
        val tvJudul = view.findViewById<TextView>(R.id.tvjudul)
        val tvTanggal = view.findViewById<TextView>(R.id.tvtanggal)



    }

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context = parent.context
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.riwayat, parent,false)
        return Holder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val a = data[position]
        holder.tvKategori.text = a.kategori
        holder.tvJudul.text = a.judul
        holder.tvTanggal.text = a.tanggal





    }

    override fun getItemCount(): Int {
        return data.size
    }
}