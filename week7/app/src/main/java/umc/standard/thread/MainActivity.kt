package umc.standard.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import umc.standard.thread.databinding.ActivityMainBinding
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Thread(){

            for(i in 30 until 0){
                Thread.sleep(1000)
                handler.post{
                    binding.tvTimerLimit.setText(i)
                }
            }

            binding.tvTimerLimit.setText("finish!")

        }.start()
    }
}