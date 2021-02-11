package com.example.lab33.task5
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lab33.R
import com.example.lab33.databinding.Activity3Binding

class Fragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = Activity3Binding.inflate(layoutInflater)

        binding.Go31.setOnClickListener {
            view?.findNavController()?.navigate(R.id.third_to_first)
        }

        binding.Go32.setOnClickListener {
            view?.findNavController()?.navigate(R.id.third_to_second)
        }

        binding.Go34.setOnClickListener {
            view?.findNavController()?.navigate(R.id.third_to_four)
        }

        return binding.root
    }
}