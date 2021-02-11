package com.example.lab33.task5
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lab33.R
import com.example.lab33.databinding.Activity2Binding

class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = Activity2Binding.inflate(layoutInflater)

        binding.Go23.setOnClickListener {
            view?.findNavController()?.navigate(R.id.second_to_third)
        }

        binding.Go21.setOnClickListener {
            view?.findNavController()?.navigate(R.id.second_to_first)
        }

        return binding.root
    }
}