package umc.standard.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import umc.standard.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var viewpagerAdapter : ViewPagerAdapter
    private lateinit var viewPager : ViewPager2
    private lateinit var viewBindng : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindng = FragmentHomeBinding.inflate(layoutInflater)
        return viewBindng.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewpagerAdapter = ViewPagerAdapter(this)
        viewPager = viewBindng.vpNews
        viewPager.adapter = viewpagerAdapter
        var tabLayout = viewBindng.tabLayout
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }
}