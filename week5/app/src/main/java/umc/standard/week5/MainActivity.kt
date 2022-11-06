package umc.standard.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import umc.standard.week5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding : ActivityMainBinding
    var dataList = ArrayList<BusinessCard>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        dataList.apply {
            add(BusinessCard("김민서","안녕하세요"))
            add(BusinessCard("김만서","hello"))
            add(BusinessCard("김민수","hola"))
            add(BusinessCard("김만수","곤니치와"))
            add(BusinessCard("김민서","안녕하세요"))
            add(BusinessCard("김만서","hello"))
            add(BusinessCard("김민수","hola"))
            add(BusinessCard("김만수","곤니치와"))
            add(BusinessCard("김민서","안녕하세요"))
            add(BusinessCard("김만서","hello"))
            add(BusinessCard("김민수","hola"))
            add(BusinessCard("김만수","곤니치와"))
            add(BusinessCard("김만서","hello"))
            add(BusinessCard("김민수","hola"))
            add(BusinessCard("김만수","곤니치와"))
            add(BusinessCard("김민서","안녕하세요"))
            add(BusinessCard("김만서","hello"))
            add(BusinessCard("김민수","hola"))
            add(BusinessCard("김만수","곤니치와"))
         }
        Log.d("dataList 출력","start")
        print(dataList)
        val dataRVAdapter = DataRVAdapter(dataList)
        viewBinding.rvBusinessCard.adapter = dataRVAdapter
        viewBinding.rvBusinessCard.layoutManager = LinearLayoutManager(this)
//        rcv.setItemViewCacheSize(adapter.currentList.size)


    }
}