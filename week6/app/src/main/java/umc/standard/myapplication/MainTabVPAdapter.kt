package umc.standard.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainTabVPAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }


}