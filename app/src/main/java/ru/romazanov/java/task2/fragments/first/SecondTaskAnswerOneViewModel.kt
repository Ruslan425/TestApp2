package ru.romazanov.java.task2.fragments.first

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import ru.romazanov.java.task2.DataRepository
import ru.romazanov.java.task2.DataRepositoryFactory


class SecondTaskAnswerOneViewModel : ViewModel() {

    private val data = DataRepositoryFactory().dataRepository

    private val _uiListState = MutableStateFlow(data.employeeArrayList)
    val uiListState = _uiListState

    fun add(name: String, age: String, job: String, email: String, phone: String, pay: String) {
       data.addToList(data.getEmploy(name, age, job, email, phone, pay))
    }


}