package com.godlifegoodlife.fitvatar

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.godlifegoodlife.fitvatar.databinding.FragmentBodysizeBinding
import com.godlifegoodlife.fitvatar.databinding.FragmentLodingBinding
import kotlinx.android.synthetic.main.activity_main.*


class LodingFragment : Fragment() {
    private lateinit var binding: FragmentLodingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLodingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            Navigation.findNavController(view).navigate(R.id.action_lodingFragment_to_homeFragment)
                              }, 3000)



    }


}