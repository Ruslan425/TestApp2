package ru.romazanov.testapp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import ru.romazanov.testapp2.databinding.FragmentStartBinding


class StartFragment : Fragment(R.layout.fragment_start) {

    private lateinit var binding: FragmentStartBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStartBinding.bind(view)

        binding.toTask1.setOnClickListener {
             Toast.makeText(requireContext(), "Пока не готово", Toast.LENGTH_SHORT).show()
        }

        binding.toTask2.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_secondTaskFragment)
        }
    }

}