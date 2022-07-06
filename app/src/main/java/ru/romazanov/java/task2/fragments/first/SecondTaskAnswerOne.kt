package ru.romazanov.java.task2.fragments.first

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ru.romazanov.testapp2.R
import ru.romazanov.testapp2.databinding.FragmentSecondTaskAnswerOneBinding


class SecondTaskAnswerOne : Fragment(R.layout.fragment_second_task_answer_one) {

    private lateinit var binding: FragmentSecondTaskAnswerOneBinding
    private lateinit var adapter: EmployeesAdapter


    private val viewModel: SecondTaskAnswerOneViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondTaskAnswerOneBinding.bind(view)

        adapter = EmployeesAdapter()

        val layoutManager = LinearLayoutManager(view.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter

        binding.addNewEmployee.setOnClickListener {
            viewModel.add(
                name = binding.nameEdit.text.toString(),
                age = binding.ageEdit.text.toString(),
                job = binding.jobTitleEdit.text.toString(),
                email = binding.emaiEdit.text.toString(),
                phone = binding.phoneEdit.text.toString(),
                pay = binding.payEdit.text.toString()
            )
            adapter.employees = viewModel.uiListState.value
        }
    }
}