package com.godlifegoodlife.fitvatar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.godlifegoodlife.fitvatar.databinding.FragmentBodysizeBinding
import com.godlifegoodlife.fitvatar.databinding.FragmentHomeBinding


class BodysizeFragment : Fragment() {
    private lateinit var binding: FragmentBodysizeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBodysizeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            //Navigation.findNavController(view).navigate(R.id.action_bodysizeFragment_to_homeFragment)

    }

}