package com.example.idacukdwkrislam_cafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class Home : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val manuIcon = view.findViewById<ImageView>(R.id.menuIcon)
        val keranjang = view.findViewById<ImageView>(R.id.kerangjangIcon)
        val pemesanan = view.findViewById<ImageView>(R.id.pemasanaanIcon)
        val profile = view.findViewById<ImageView>(R.id.profilaa)
        manuIcon.setOnClickListener {
            view.findNavController()
                .navigate(R.id.AcfragHometoFragMenu)
        }
        keranjang.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragHomeToFragKeranjang)
        }
        pemesanan.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragHomeToFragPemesan)
        }
        profile.setOnClickListener {
            view.findNavController()
                .navigate(R.id.acFragHomeToFragProfile)
        }

        return view
        }

}