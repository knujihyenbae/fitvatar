package com.godlifegoodlife.fitvatar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.godlifegoodlife.fitvatar.databinding.FragmentHomeBinding
import com.godlifegoodlife.fitvatar.databinding.FragmentShoppingmallBinding

class ShoppingmallFragment : Fragment() {
    private lateinit var binding: FragmentShoppingmallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShoppingmallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.shoppingmall1.setOnClickListener(){
            Toast.makeText(context, "ZIGZAG로 이동합니다.", Toast.LENGTH_SHORT).show()
        }
        binding.shoppingmall2.setOnClickListener(){
            Toast.makeText(context, "ABLY로 이동합니다.", Toast.LENGTH_SHORT).show()
        }
        binding.shoppingmall3.setOnClickListener(){
            Toast.makeText(context, "MUSINSA로 이동합니다.", Toast.LENGTH_SHORT).show()
        }
        binding.shoppingmall4.setOnClickListener(){
            Toast.makeText(context, "BRANDI로 이동합니다.", Toast.LENGTH_SHORT).show()
        }
        binding.shoppingmall5.setOnClickListener(){
            Toast.makeText(context, "ZIGZAG로 이동합니다.", Toast.LENGTH_SHORT).show()
        }

    }


}