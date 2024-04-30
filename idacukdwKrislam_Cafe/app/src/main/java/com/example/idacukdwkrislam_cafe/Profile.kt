package com.example.idacukdwkrislam_cafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class Profile : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val home = view.findViewById<ImageView>(R.id.homeIcon)
        val keranjang = view.findViewById<ImageView>(R.id.keranjangIcon)
        val pemesanan = view.findViewById<ImageView>(R.id.pemesananIcon)
        val menu = view.findViewById<ImageView>(R.id.menuIcon)
        home.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragProfileToFragHome)
        }
        keranjang.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragProfileToFragKeranjang)
        }
        pemesanan.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragProfileToFragPemesanan)
        }
        menu.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragProfileToFragMenu)
        }

        return view
    }
}