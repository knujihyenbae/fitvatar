package com.godlifegoodlife.fitvatar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.godlifegoodlife.fitvatar.databinding.FragmentBodysizeBinding
import com.godlifegoodlife.fitvatar.databinding.FragmentFitvatarBinding


class FitvatarFragment : Fragment() {
    private lateinit var binding: FragmentFitvatarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFitvatarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.size1.setOnClickListener(){

        }
        binding.size2.setOnClickListener(){
            binding.fitvatar.background
        }
        binding.size3.setOnClickListener(){

        }
    }


}