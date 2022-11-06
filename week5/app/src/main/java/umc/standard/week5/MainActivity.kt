package umc.standard.week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import umc.standard.week5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding : ActivityMainBinding
    var dataList = ArrayList<Memo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        dataList.apply {
            add(0,Memo("기본데이터입니다"))
        }
        val memoAdapter = MemoAdapter(dataList)
        viewBinding.rvMemo.adapter = memoAdapter
        viewBinding.rvMemo.layoutManager = LinearLayoutManager(this)
        viewBinding.btMemoAdd.setOnClickListener{
            val intent = Intent(this,MemoActivity::class.java)
            startActivity(intent)
        }


    }
}