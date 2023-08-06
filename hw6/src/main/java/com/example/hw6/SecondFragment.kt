package com.example.hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw6.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var i = arguments?.getInt("pos")
        binding.apply {

            when(i)
            {
                0 -> {
                    imgView.setImageResource(R.drawable.img_rick)
                    statTv.text = "Alive"
                    nameTv.text = "Rick Sanchez"
                }
                1 -> {
                    imgView.setImageResource(R.drawable.img_morty)
                    statTv.text = "Alive"
                    nameTv.text = "Morty Smith"
                }
                2 -> {
                    imgView.setImageResource(R.drawable.img_albert)
                    statTv.text = "Dead"
                    nameTv.text = "Albert Einstein"
                }
                3 -> {
                    imgView.setImageResource(R.drawable.img_jeremy)
                    statTv.text = "Alive"
                    nameTv.text = "Jerry Smith"
                }
            }
        }
    }
}