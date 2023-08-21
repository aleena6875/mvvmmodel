package com.example.mvvmmodel

data class ItemList(
    val results:List<Result>
)
data class Result(val image:String,val name:String)