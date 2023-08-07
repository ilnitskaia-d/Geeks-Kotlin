package com.example.hw5

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw5.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private var list: ArrayList<Model> = arrayListOf(
        Model(1,"Name", "Author", "0:00"),
        Model(2,"Name", "Author", "0:00"),
        Model(3,"Name", "Author", "0:00"),
        Model(4,"Name", "Author", "0:00"),
        Model(5,"Name", "Author", "0:00"),
        Model(6,"Name", "Author", "0:00"),
        Model(7,"Name", "Author", "0:00"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter  = ModelAdapter(list, this::onClick)
        binding.rv.adapter = adapter
    }

    private fun onClick(position: Int){
        val intent = Intent(requireContext(), SecondActivity::class.java)
        startActivity(intent)
    }

}