package com.example.idacukdwkrislam_cafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class Keranjang : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_keranjang, container, false)
        val home = view.findViewById<ImageView>(R.id.homeIcon)
        val menu = view.findViewById<ImageView>(R.id.menuIcon)
        val pemesanan = view.findViewById<ImageView>(R.id.pemesananIcon)
        val profile = view.findViewById<ImageView>(R.id.profilaa)
        home.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragKeranjangToFragHome)
        }
        menu.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragKeranjangToFragMenu)
        }
        pemesanan.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragKeranjangToFragPemesanan)
        }
        profile.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragKeranjangToFragProfile)
        }

        return view
    }
}