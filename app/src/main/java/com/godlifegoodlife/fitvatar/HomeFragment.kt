package com.godlifegoodlife.fitvatar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.godlifegoodlife.fitvatar.databinding.FragmentBodysizeBinding
import com.godlifegoodlife.fitvatar.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bodysize.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_bodysizeFragment)
        }
        binding.fitvatar.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_fitvatarFragment)

        }
        binding.fitvatarmaker.setOnClickListener(){
            var intent = Intent(context, CameraActivity::class.java)
            startActivity(intent)
        }
        binding.shoppingmall.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_shoppingmallFragment)
        }


    }


}