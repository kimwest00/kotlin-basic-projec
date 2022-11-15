package umc.standard.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import umc.standard.thread.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var handler = Handler(Looper.getMainLooper())
        binding.btTimerStart.setOnClickListener {
            Thread(){
                for(i in 30 until 0){
                    Thread.sleep(1000)
                    handler.post{
                        binding.tvTimerLimit.setText(i)
                        println("timer working at :")
                        println(i)
                    }
                }
                binding.tvTimerLimit.setText("finish!")
            }.start()
        }
    }
}