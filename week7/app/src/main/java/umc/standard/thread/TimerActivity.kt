package umc.standard.thread

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import umc.standard.thread.databinding.ActivityMainBinding
import umc.standard.thread.databinding.ActivityTimerBinding
import kotlin.concurrent.thread

class TimerActivity:AppCompatActivity() {
    private lateinit var binding: ActivityTimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extra = intent.extras
        var time = extra?.get("time")
        Log.d("time limit",time.toString())
        binding.tvTimerNum.text = time.toString()
//        thread(start = true){
//            for(i in 30 until 0){
//                Thread.sleep(1000)
//                runOnUiThread{
//                    time_text.text = time.toString()
//                }
//                println("timer working at :")
//                println(i)
//            }
////                text.text= "finish!"
//        }
    }

    }
