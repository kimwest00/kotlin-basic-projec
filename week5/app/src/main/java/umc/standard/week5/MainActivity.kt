package umc.standard.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.standard.week5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var businessCardArrayList = ArrayList<BusinessCard>()

    private lateinit var customAdapter: CustomAdapter
    private lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        for(x in 0..30){
            businessCardArrayList.add(BusinessCard(name = "록", content ="하이"))
            businessCardArrayList.add(BusinessCard(name = "록", content ="하이"))
            businessCardArrayList.add(BusinessCard(name = "록", content ="하이"))
            businessCardArrayList.add(BusinessCard(name = "록", content ="하이"))
        }
        customAdapter = CustomAdapter(this,businessCardArrayList)
        viewBinding.lvMain.adapter = customAdapter
    }
}