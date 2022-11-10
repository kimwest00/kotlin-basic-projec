package umc.standard.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.standard.myapplication.databinding.FragmentCameraBinding
import umc.standard.myapplication.databinding.FragmentHomeBinding

class CameraFragment : Fragment() {

    private lateinit var viewBindng : FragmentCameraBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindng = FragmentCameraBinding.inflate(layoutInflater)
        return viewBindng.root
    }
}