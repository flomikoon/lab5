package com.example.lab33.task5
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lab33.R
import com.example.lab33.databinding.Activity5Binding

class Fragment5 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = Activity5Binding.inflate(layoutInflater)

        binding.Close.setOnClickListener {
            view?.findNavController()?.navigate(R.id.five_to_third)
        }

        return binding.root
    }
}