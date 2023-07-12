package com.example.Nozel.ui.Cari

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Nozel.adapter.adapterriwayat


import com.example.Nozel.app.ApiConfig.ApiConfig
import com.example.Nozel.model.RiwayatModel
import com.example.Nozel.model.ResponseModel
import com.example.nozel.R
import retrofit2.Call
import retrofit2.Response

class CariFragment: Fragment() {

    //
    lateinit var rvRiwayat: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_cari, container, false)

        init(view)
        getRiwayat()
        return view
    }

    private var listRiwayat: ArrayList<RiwayatModel> = ArrayList()

    fun getRiwayat(){
        ApiConfig.instanceRetrofit.getRiwayat().enqueue(object :
            retrofit2.Callback<ResponseModel> {

            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
                val res = response.body()!!
                listRiwayat = res.riwayat
                displayRiwayat()
            }
            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                Toast.makeText(requireActivity(), "Error :"+t.message, Toast.LENGTH_LONG).show()
            }
        })
    }

    fun displayRiwayat() {
        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rvRiwayat.adapter = adapterriwayat(requireActivity(), listRiwayat)
        rvRiwayat.layoutManager = layoutManager
    }

    fun init(view: View) {
        //rvBarang = view.findViewById(R.id.recyler_view)
        rvRiwayat=view.findViewById(R.id.recyler_view)
    }

}