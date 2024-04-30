package com.example.idacukdwkrislam_cafe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class Pemesanan : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pemesanan, container, false)
        val home = view.findViewById<ImageView>(R.id.IconHome)
        val keranjang = view.findViewById<ImageView>(R.id.keranjangIcon)
        val menu = view.findViewById<ImageView>(R.id.menuIcon)
        val profile = view.findViewById<ImageView>(R.id.profilaa)
        home.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragPemesananToFragHome)
        }
        keranjang.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragPemesananToFragKeranjang)
        }
        menu.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragPemesananToFragMenu)
        }
        profile.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragPemesananToFragProfile)
        }

        return view
    }
}