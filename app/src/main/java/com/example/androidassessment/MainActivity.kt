package com.example.androidassessment

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEnWallet_items.layoutManager = LinearLayoutManager(this)

    }

    fun displayWallet(){
        val item1 = Wallets ("Salary", "40000", "29 April 2024")

        val item2 = Wallets ("Salary", "40000", "29 April 2024")

        val item3 = Wallets ("Salary", "40000", "29 April 2024")

        val item4 = Wallets ("Salary", "40000", "29 April 2024")

        val item5 = Wallets ("Salary", "40000", "29 April 2024")

        val item6 = Wallets ("Salary", "40000", "29 April 2024")

        val wallet = listOf(item1, item2, item3, item4, item5, item6)
        val walletAdapter = WalletRecyclerVieweAdapter(Wallet)
        binding.rvEnWallet.adapter = WalletAdapter
    }

}