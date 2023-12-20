package com.example.mod10recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recycler.databinding.TemplateCourseLineBinding

class ProductAdapter(val productList: List<Product>) : Adapter<ProductAdapter.ProductVH>() {
    class ProductVH(val binding: TemplateCourseLineBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        val binding = TemplateCourseLineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ProductVH(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        holder.binding.product = productList[position]
    }

}