package com.example.hw8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.hw8.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let{
            navArgs = SecondFragmentArgs.fromBundle(it)
        }
        binding.apply {
            navArgs.apply {
                Glide.with(imgView).load(cardModel.image).into(imgView)
                nameTv.text = cardModel.name
                statTv.text = cardModel.status
            }
        }
//        var card = arguments?.getSerializable("card") as CardModel
//        binding.apply {
//            card.apply {
//                Glide.with(imgView).load(image).into(imgView)
//                statTv.text = status
//                nameTv.text = name
//            }
//        }
    }
}