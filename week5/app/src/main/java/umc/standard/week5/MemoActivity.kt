package umc.standard.week5


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import umc.standard.week5.databinding.ActivityMainBinding
import umc.standard.week5.databinding.ActivityMemoBinding

class MemoActivity() : AppCompatActivity(){
    private lateinit var viewBinding: ActivityMemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMemoBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


    }
}