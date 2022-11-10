package umc.standard.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.standard.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var viewBindng : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindng = FragmentHomeBinding.inflate(layoutInflater)
        return viewBindng.root
    }
}