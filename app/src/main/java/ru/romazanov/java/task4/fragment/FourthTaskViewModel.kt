package ru.romazanov.java.task4.fragment

import androidx.lifecycle.ViewModel
import ru.romazanov.java.RepositoryFactory

class FourthTaskViewModel : ViewModel(){


    private val data = RepositoryFactory().create()

    private val multithreading = data.multithreading


    fun singleThread(): ArrayList<String> {
         return multithreading.singleThread()
    }


    fun start(): ArrayList<String> {
        return multithreading.multithreading
    }





}