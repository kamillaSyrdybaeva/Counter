package com.example.counter

import android.content.Context

class Precenter {
    val model = Injetor.getModel()
    lateinit var view : CounterView
    fun increment(){
        model.increment()
        view.updateCount(model.getCount().toString())
    }
    fun decrement(){
        model.decrement()
        view.updateCount(model.getCount().toString())
    }
    fun toast(context: Context){
        model.toast(context)
        view.updateCount(model.getCount().toString())
    }
    fun changeColor() : Boolean{
        model.changeColor()
        return model.boolean
    }

    fun attachView(view: MainActivity){
        this.view = view
    }
}