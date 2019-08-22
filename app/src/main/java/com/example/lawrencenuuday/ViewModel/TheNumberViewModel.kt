package com.example.lawrencenuuday.ViewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TheNumberViewModel : ViewModel() {

    private lateinit var theNumbers : MutableLiveData<List<Int>>

    fun getTheNumbers() : LiveData<List<Int>> {

        if (!::theNumbers.isInitialized) {

            theNumbers = MutableLiveData()
            loadNumbers()
        }
        return theNumbers
    }

    private fun loadNumbers() {

            var loadedNumbers = mutableListOf<Int>()
            loadedNumbers.add(1)
            loadedNumbers.add(2)
            loadedNumbers.add(3)

            theNumbers.value = loadedNumbers
        }
    }
