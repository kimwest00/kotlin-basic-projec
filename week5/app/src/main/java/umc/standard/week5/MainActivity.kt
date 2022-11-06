package umc.standard.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import umc.standard.week5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding : ActivityMainBinding
    var dataList = ArrayList<Memo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        Log.d("dataList 출력","start")
        print(dataList)
        val memoAdapter = MemoAdapter(dataList)
        viewBinding.rvBusinessCard.adapter = memoAdapter
        viewBinding.rvBusinessCard.layoutManager = LinearLayoutManager(this)
//        rcv.setItemViewCacheSize(adapter.currentList.size)


    }
}