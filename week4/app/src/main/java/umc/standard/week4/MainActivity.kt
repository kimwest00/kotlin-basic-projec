package umc.standard.week4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.standard.week4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityMainBinding
    private var memo_text : String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btMemo.setOnClickListener{
            var intent = Intent(this,TextActivity::class.java)
            intent.putExtra("text", viewBinding.etMemo.text.toString())
            startActivity(intent)
        }
    }


    override fun onStop() {
        super.onStop()
        memo_text = viewBinding.etMemo.text.toString();

    }

    override fun onRestart() {
        super.onRestart()
    }
}