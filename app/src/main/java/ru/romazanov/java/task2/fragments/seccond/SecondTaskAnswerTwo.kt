package ru.romazanov.java.task2.fragments.seccond


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.romazanov.testapp2.R
import ru.romazanov.testapp2.databinding.FragmentSecondTaskAnswerTwoBinding


class SecondTaskAnswerTwo : Fragment(R.layout.fragment_second_task_answer_two) {

    private lateinit var binding: FragmentSecondTaskAnswerTwoBinding

    private val viewModel: SecondTaskAnswerTwoViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondTaskAnswerTwoBinding.bind(view)

        binding.getCat.setOnClickListener {
            viewModel.addCat()
            binding.cat.text = viewModel.catList.value.size.toString()
        }

        binding.getDog.setOnClickListener {
            viewModel.addDog()
            binding.dog.text = viewModel.dogList.value.size.toString()
        }

        binding.addFood.setOnClickListener {
            if (binding.amountAddFood.text.isEmpty()) {
                Toast.makeText(requireContext(), "Тарелка пустая", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.addFood(binding.amountAddFood.text.toString().toInt())
                binding.eat.text = viewModel.getFood().toString()
            }
        }

        binding.allCats.setOnClickListener {
            Toast.makeText(requireContext(), "Сытых котов ${viewModel.eatAllCat()}", Toast.LENGTH_SHORT).show()
            binding.eat.text = viewModel.getFood().toString()
        }

        binding.allDogs.setOnClickListener {
            Toast.makeText(requireContext(), "Сытых собак ${viewModel.eatAllDog()}", Toast.LENGTH_LONG).show()
            binding.eat.text = viewModel.getFood().toString()
        }
    }
}