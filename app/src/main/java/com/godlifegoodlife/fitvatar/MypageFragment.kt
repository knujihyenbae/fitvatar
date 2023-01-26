package com.godlifegoodlife.fitvatar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.godlifegoodlife.fitvatar.databinding.FragmentHomeBinding
import com.godlifegoodlife.fitvatar.databinding.FragmentMypageBinding

class MypageFragment : Fragment() {

    private lateinit var binding: FragmentMypageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mypageconstraint1.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }
        binding.mypageconstraint2.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }
        binding.mypageconstraint3.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }
        binding.mypageconstraint4.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }
        binding.mypageconstraint5.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }
        binding.mypageconstraint6.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }
        binding.mypageconstraint7.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_mypageFragment_to_myinfoFragment)
        }

    }

}