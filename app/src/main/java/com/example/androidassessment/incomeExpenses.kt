package com.example.androidassessment

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

data class Wallets (
    var tvSalary: String,
    var tvCash3: String,
    var tvDate: String,
)

class WalletRecyclerViewAdapter(val wallet: List<Wallets>): RecyclerView.AdapterViewHolder>(){
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): WalletViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_items, parent, false)
        return WalletViewHolder(itemView)
    }
    override fun getItemCount(): Int{
        return wallet.size
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int){
        val wallet = wallet[position]
        holder.tvSalary.text = wallet.tvSalary
        holder.tvCash3.text = wallet. tvCash3
        holder.tvDate.text = wallet.tvDate
    }
}

class WalletViewHolder( itemView: View): RecyclerView.ViewHolder(itemView){
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvCash3 = itemView.findViewById<TextView>(R.id.tvCash3)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}


