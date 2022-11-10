package umc.standard.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import umc.standard.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameLayout.id, HomeFragment())
            .commit()
        binding.bottomNavi.setOnNavigationItemSelectedListener(
            onNavigationItemSelectedListener
        )
    }

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.cameraFragment -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.cameraFragment, CameraFragment())
                        .commit()
                }
                R.id.homeFragment -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.homeFragment, HomeFragment())
                        .commitAllowingStateLoss()
                }
                R.id.plantFragment -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.plantFragment, PlantFragment())
                        .commitAllowingStateLoss()
                }
                //위의 setOnItemSelectedListener의 return값 설정

            }
            true
        }
}