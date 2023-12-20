package com.example.mod10recycler

enum class Type{
    FRAIS, SURGELE, QUINCAILLERIE, EPICERIE, DPH
}

data class Product(
    val name : String,
    val price : Float,
    val type : Type,
    val rating : Float
)
