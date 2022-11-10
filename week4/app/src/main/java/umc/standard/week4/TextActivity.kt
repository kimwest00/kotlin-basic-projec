package umc.standard.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.standard.week4.databinding.ActivityMainBinding
import umc.standard.week4.databinding.ActivityTextBinding

class TextActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }
}