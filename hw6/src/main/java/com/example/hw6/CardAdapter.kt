package com.example.hw6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.hw6.databinding.ItemCardBinding

class CardAdapter(
    val list: ArrayList<CardModel>,
    val onClick: (card: CardModel) -> Unit
): Adapter<CardAdapter.CardViewHolder>() {
    inner class CardViewHolder(private val binding: ItemCardBinding) :ViewHolder(
        binding.root
    ){
        fun bind()
        {
            val card: CardModel = list[adapterPosition]
            binding.apply {
                card.apply {
                    statTv.text = status
                    nameTv.text = name

                    itemView.setOnClickListener{
                        onClick(list[adapterPosition])
                    }
                    Glide.with(imgView).load(image).into(imgView)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder{
        return CardViewHolder(ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind()
    }
}