package ru.romazanov.java.task2.fragments.third

import android.content.Context
import androidx.lifecycle.ViewModel
import ru.romazanov.java.task2.DataRepositoryFactory
import ru.romazanov.java.task2.examples.model.Matrix
import java.util.ArrayList

class SecondTaskAnswerThreeViewModel : ViewModel() {

    private val data = DataRepositoryFactory().dataRepository

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