package com.example.hw5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw5.databinding.ItemModelBinding

class ModelAdapter(
    val list: ArrayList<Model>,
    val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<ModelAdapter.ModelViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        return ModelViewHolder(ItemModelBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bind()
    }

    inner class ModelViewHolder(private val binding: ItemModelBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val model:Model = list[adapterPosition]
            binding.tvNum.text = model.num.toString();
            binding.tvName.text = model.name;
            binding.tvAuthor.text = model.author;
            binding.tvTime.text = model.time;

            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }
}