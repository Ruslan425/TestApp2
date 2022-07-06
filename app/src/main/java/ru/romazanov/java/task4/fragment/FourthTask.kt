package ru.romazanov.java.task4.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import ru.romazanov.java.task4.Multithreading
import ru.romazanov.testapp2.R
import ru.romazanov.testapp2.databinding.FragmentFourthTaskBinding


class FourthTask : Fragment(R.layout.fragment_fourth_task) {

    private lateinit var binding: FragmentFourthTaskBinding
    private val viewModel: FourthTaskViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFourthTaskBinding.bind(view)


        binding.getAnswer.setOnClickListener {

            binding.answerTextView.text = ""

            binding.answerTextView.append(viewModel.start().joinToString("\n"))

            binding.answerTextView.append(viewModel.singleThread().joinToString("\n"))

        }


    }

}