package com.example.a34a

fun main(){
    fun show(a:Int ,b:Int):Unit{
        println("You entered $a and $b")
    }

    fun add(a:Int ,b:Int):Int{
        var sum=0
        sum=a+b
        return sum
    }

    fun findMinimumNumber(a:Int,b:Int):Int{
        var minimum=0
        if(a>b){
            minimum=b
        }else{
            minimum=a
        }
        return minimum
    }
    println("Enter first number:")
    var a:Int =readln()!!.toInt()
    println("Enter second number:")
    var b:Int =readln()!!.toInt()
    show(a,b)
    var sum=add(a,b)
    println("Sum of two number is $sum")
        var minimum=findMinimumNumber(a,b)
    println("Add teh smallest between $a and $b us $minimum")

}