package umc.standard.myapplication

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: HomeFragment): FragmentStateAdapter(fragmentActivity) {
    // 페이지 갯수 설정
    override fun getItemCount() = 3

    // 불러올 Fragment 정의
    override fun createFragment(position: Int): Fragment{
        return when (position){
            0 -> CameraFragment()
            1 -> PlantFragment()
            2 -> HomeFragment()
            else -> HomeFragment()
        }

    }
}
