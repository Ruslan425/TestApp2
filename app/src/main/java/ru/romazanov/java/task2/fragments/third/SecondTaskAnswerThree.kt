package ru.romazanov.java.task2.fragments.third


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.romazanov.java.task2.examples.model.exception.MyArrayDataException
import ru.romazanov.java.task2.examples.model.exception.MyArraySizeException
import ru.romazanov.testapp2.R
import ru.romazanov.testapp2.databinding.FragmentSecondTaskAnswerThreeBinding


class SecondTaskAnswerThree : Fragment(R.layout.fragment_second_task_answer_three) {


    private lateinit var binding: FragmentSecondTaskAnswerThreeBinding
    private val viewModel: SecondTaskAnswerThreeViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondTaskAnswerThreeBinding.bind(view)

        binding.getSum.setOnClickListener {

            try {
                viewModel.addToMatrix(
                    viewModel.getArray(binding.lineOne.text.toString())
                )

                viewModel.addToMatrix(
                    viewModel.getArray(binding.lineTwo.text.toString())
                )

                viewModel.addToMatrix(
                    viewModel.getArray(binding.lineThree.text.toString())
                )
                viewModel.addToMatrix(
                    viewModel.getArray(binding.lineFour.text.toString())
                )

                binding.answer.text = viewModel.getSum().toString()

            } catch (e: MyArrayDataException) {
                Toast.makeText(requireContext(), e.message, Toast.LENGTH_SHORT).show()
            } catch (e: MyArraySizeException) {
                Toast.makeText(requireContext(), e.message, Toast.LENGTH_SHORT).show()
            }

            viewModel.clearArray()

        }
    }

}