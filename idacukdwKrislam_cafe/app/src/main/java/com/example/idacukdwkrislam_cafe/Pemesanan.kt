package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class Pemesanan : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pemesanan, container, false)
        val linearLayout = view.findViewById<LinearLayout>(R.id.pemesananItem)
        linearLayout.setOnClickListener {
            val intent = Intent(requireActivity(), DetailPemesanan::class.java)
            startActivity(intent)
        }

        return view

    }
}