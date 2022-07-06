package ru.romazanov.java.task2.fragments.third

import androidx.lifecycle.ViewModel
import ru.romazanov.java.task2.RepositoryFactory
import ru.romazanov.java.task2.examples.model.Matrix


class SecondTaskAnswerThreeViewModel : ViewModel() {

    private val data = RepositoryFactory().create()

    private val matrix: Matrix = data.matrix

    fun getArray(str: String): ArrayList<Int> {
        return matrix.getArray(str)
    }

    fun addToMatrix(list: ArrayList<Int>) {
        matrix.addToMatrix(list)
    }

    fun getSum(): Int {
        return matrix.sum
    }

    fun clearArray() {
        matrix.clearArray()
    }

}