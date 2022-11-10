package umc.standard.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.standard.myapplication.databinding.FragmentPlantBinding

class PlantFragment : Fragment() {

    private lateinit var viewBindng : FragmentPlantBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindng = FragmentPlantBinding.inflate(layoutInflater)
        return viewBindng.root
    }
}