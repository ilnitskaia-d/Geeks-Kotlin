package com.example.hw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.hw7.databinding.FragmentGravityFallsDetailsBinding

class GravityFallsDetailsFragment : Fragment() {
    private lateinit var binding: FragmentGravityFallsDetailsBinding
    private lateinit var navArgs: GravityFallsDetailsFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGravityFallsDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let{
            navArgs = GravityFallsDetailsFragmentArgs.fromBundle(it)
        }
        Glide.with(binding.imgGravityFalls).load(navArgs.gravityFallsModel.image).into(binding.imgGravityFalls)
        binding.tvNameGravityFalls.text = navArgs.gravityFallsModel.name
        binding.tvDescGravityFalls.text = navArgs.gravityFallsModel.desc
//        arguments?.let{
//            val gravityFallsModel = it.getSerializable("KEY_FOR_GRAVITY_FALLS_MODEL") as GravityFallsModel
//            Glide.with(binding.imgGravityFalls).load(gravityFallsModel.image).into(binding.imgGravityFalls)
//            binding.tvNameGravityFalls.text = gravityFallsModel.name
//            binding.tvDescGravityFalls.text = gravityFallsModel.desc
//        }
    }

}