package umc.standard.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import umc.standard.week5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding : ActivityMainBinding
    var dataList= ArrayList<BusinessCard>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        for(x in 0..30){
            dataList.add(BusinessCard(name = "록", content ="하이"))
            dataList.add(BusinessCard(name = "록", content ="하이"))
            dataList.add(BusinessCard(name = "록", content ="하이"))
            dataList.add(BusinessCard(name = "록", content ="하이"))
        }
        Log.d("dataList 출력","start")
        print(dataList)
        val dataRVAdapter = DataRVAdapter(dataList)
        viewBinding.rvBusinessCard.adapter = dataRVAdapter
        viewBinding.rvBusinessCard.layoutManager = LinearLayoutManager(this)



    }
}