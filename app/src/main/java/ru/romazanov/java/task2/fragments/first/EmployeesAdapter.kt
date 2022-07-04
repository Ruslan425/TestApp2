package ru.romazanov.java.task2.fragments.first

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.romazanov.java.task2.examples.model.Employee
import ru.romazanov.testapp2.databinding.ItemElementBinding

class EmployeesAdapter : RecyclerView.Adapter<EmployeesAdapter.EmployeesViewHolder>() {

    var employees: List<Employee> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }


    class EmployeesViewHolder(
        val binding: ItemElementBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemElementBinding.inflate(inflater, parent, false)
        return EmployeesViewHolder(binding)

    }

    override fun onBindViewHolder(holder: EmployeesViewHolder, position: Int) {
       val employee = employees[position]
        with(holder.binding) {
            name.text = employee.name
            email.text = employee.email
        }
    }

    override fun getItemCount(): Int {
        return employees.size
    }
}