package com.example.hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.hw6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    var list : ArrayList<CardModel> = arrayListOf(
        CardModel("Alive", "Rick Sanchez"),
        CardModel("Alive", "Morty Smith"),
        CardModel("Dead", "Albert Einstein"),
        CardModel("Alive", "Jerry Smith")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter  = CardAdapter(list, this::onClick)
        binding.rv.adapter = adapter
    }

    private fun onClick(position: Int) {
        findNavController().navigate(R.id.secondFragment, bundleOf("pos" to position))
    }
}