package umc.standard.thread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import umc.standard.thread.databinding.ActivityMainBinding
import java.util.Timer
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var text = binding.etTimerLimit.text
        binding.btTimerStart.setOnClickListener {
            val intent = Intent(this,TimerActivity::class.java)
            intent.putExtra("time",text)
            Log.d("before arrive",text.toString())
            startActivity(intent)
        }
    }
}