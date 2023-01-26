package com.godlifegoodlife.fitvatar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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
        //완료버튼
        binding.bodysizeFinish.setOnClickListener(){

        }

        binding.detailInfo.visibility = View.INVISIBLE

        var ischecked = 1
        binding.detailInfoToggle.setOnClickListener(){
            //ImageView.ROTATION

            if(ischecked == 1){
                binding.detailInfo.visibility = View.VISIBLE
                ischecked = 2

            }else{
                binding.detailInfo.visibility = View.INVISIBLE
                ischecked = 1
            }

        }

    }

}