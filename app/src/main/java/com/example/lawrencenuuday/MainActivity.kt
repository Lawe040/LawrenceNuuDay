package com.example.lawrencenuuday

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lawrencenuuday.ViewModel.TheNumberViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*Hi first i Started of playing with LiveData then i moved on to ViewModel
      separated the logic from the view */

    // lateinit var theNumber : MutableLiveData<Int>

    lateinit var viewModel : TheNumberViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(TheNumberViewModel::class.java)

        viewModel.getTheNumbers().observe(this, Observer<List<Int>> { listOfNumbersChanged ->
            main_textView.text = listOfNumbersChanged.toString()
        })

      /*  theNumber = MutableLiveData()
        theNumber.value = 0

        theNumber.observe(this, Observer<Int> { changedNumber ->
            main_textView.text = changedNumber.toString()
        }) */
    }

     fun clickButtonFunction(view : View) {
         main_textView.text = "You pressed the button :)"
    }
}
