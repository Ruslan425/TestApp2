package ru.romazanov.java.task2.fragments.seccond

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import ru.romazanov.java.task2.DataRepositoryFactory


class SecondTaskAnswerTwoViewModel : ViewModel() {

    private val data = DataRepositoryFactory().dataRepository

    private val _dogList = MutableStateFlow(data.dogList)
    val dogList = _dogList

    private val _catList = MutableStateFlow(data.catList)
    val catList = _catList

    fun addDog() {
        data.dogList.add(data.dog)
    }

    fun addCat() {
        data.catList.add(data.cat)
    }

    fun addFood(food: Int) {
        data.plate.setFood(food)
    }

    fun getFood(): Int {
        return data.plate.food
    }

    fun eatAllCat(): Int {
        catList.value.forEach {
            if(!it.satiety)
            if (data.plate.getFood(10))
                it.satiety = true }
        var num = 0
        catList.value.forEach { if (it.satiety) ++num }
        return num
    }
    fun eatAllDog(): Int {
        dogList.value.forEach {
            if(!it.satiety)
            if (data.plate.getFood(20))
                it.satiety = true }
        var num = 0
        dogList.value.forEach { if (it.satiety) ++num }
        return num
    }

}