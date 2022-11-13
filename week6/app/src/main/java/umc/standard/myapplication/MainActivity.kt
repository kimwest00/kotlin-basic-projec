package umc.standard.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import umc.standard.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameLayout.id, HomeFragment())
            .commit()
        binding.bottomNavi.run {
            setOnItemSelectedListener{item->
                when(item.itemId){
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

                }
                true

            }
            selectedItemId = R.id.homeFragment

        }
    }


}