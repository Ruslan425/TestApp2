package ru.romazanov.java.task2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import ru.romazanov.testapp2.R
import ru.romazanov.testapp2.databinding.FragmentSecondTaskBinding

class SecondTaskFragment : Fragment(R.layout.fragment_second_task) {

    private lateinit var binding: FragmentSecondTaskBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondTaskBinding.bind(view)

        binding.id1Task2.setOnClickListener {
            findNavController().navigate(R.id.action_secondTaskFragment_to_secondTaskAnswerOne)
        }

        binding.id2Task2.setOnClickListener {
            findNavController().navigate(R.id.action_secondTaskFragment_to_secondTaskAnswerTwo)
        }

        binding.id3Task2.setOnClickListener {
            findNavController().navigate(R.id.action_secondTaskFragment_to_secondTaskAnswerThree)
        }

    }
}