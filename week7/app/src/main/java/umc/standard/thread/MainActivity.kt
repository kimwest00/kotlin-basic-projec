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
    var tmp_time = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Thread(){
            if (tmp_time == 0){
                binding.tvTimerLimit.setText("finish!")
                Thread.interrupted()
            }
            Thread.sleep(1000)
            handler.post{
                binding.tvTimerLimit.setText(tmp_time)
            }
            tmp_time--

        }.start()
    }
}