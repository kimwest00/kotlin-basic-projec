package umc.standard.thread

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import umc.standard.thread.databinding.ActivityTimerBinding
import kotlin.concurrent.thread

class TimerActivity:AppCompatActivity() {
    private lateinit var binding: ActivityTimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extra = intent.extras
        var time = extra?.get("time").toString().toInt()
        Log.d("time limit",time.toString())
        binding.tvTimerNum.text = time.toString()
        thread(start = true){
            while(time > 0){
                Thread.sleep(1000)
                time -= 1
                runOnUiThread{
                    binding.tvTimerNum.text = time.toString()
                }
            }
            runOnUiThread{
                binding.tvTimerNum.text = "Time is over!"
            }
        }
    }

    }






