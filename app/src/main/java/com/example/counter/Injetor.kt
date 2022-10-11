package com.example.counter

class Injetor {
    companion object{
        fun getPresenter(): Precenter {
            return Precenter()
        }
        fun getModel(): CounterModel{
            return CounterModel()
        }
    }
}