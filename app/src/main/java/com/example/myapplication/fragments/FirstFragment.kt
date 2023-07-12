package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.google.android.material.tabs.TabLayout

class FirstFragment : Fragment() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var tvTitle: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Ánh xạ các view trong layout
        btn1 = view.findViewById(R.id.btn1)
        btn2 = view.findViewById(R.id.btn2)
        tvTitle = view.findViewById(R.id.tvTitle)

        btn1.setOnClickListener {
            if (requireActivity() is MainActivity) {
                val mainActivity = requireActivity() as MainActivity
                mainActivity.showToast("Hello from FirstFragment")
            }
        }

        return view
    }

}