package com.example.lab33.task5
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lab33.R
import com.example.lab33.databinding.Activity1Binding

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val binding = Activity1Binding.inflate(layoutInflater)

        binding.Go12.setOnClickListener {
            view?.findNavController()?.navigate(R.id.first_to_second)
        }
        return binding.root
    }
}