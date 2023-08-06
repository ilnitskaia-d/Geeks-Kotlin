package com.example.hw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.hw7.databinding.FragmentGravityFallsBinding

class GravityFallsFragment : Fragment() {
    private lateinit var binding: FragmentGravityFallsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGravityFallsBinding.inflate(layoutInflater)
        return binding.root
    }
    private val gravityFallsModel = GravityFallsModel("https://static.wikia.nocookie.net/disney/images/e/e3/Profile_-_Dipper_Pines.png/revision/latest?cb=20190318192148","Dipper", "")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(binding.imgGravityFalls).load(gravityFallsModel.image).into(binding.imgGravityFalls)
        initListener()
    }

    private fun initListener() {
        binding.cardViewGravityFalls.setOnClickListener{

            findNavController().navigate(GravityFallsFragmentDirections.actionGravityFallsFragmentToGravityFallsDetailsFragment(gravityFallsModel))

        }
    }
}

