package com.study.fundamentals.AdvancedTopics

import java.io.IOException
import java.lang.NullPointerException

fun main() {
    Repository.startFetch()
    getResult(Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(Repository.getCurrentState())
    Repository.error()
    getResult(Repository.getCurrentState())
    Repository.customFailure()
    getResult(Repository.getCurrentState())
    Repository.anotherCustomFailure()
    getResult(Repository.getCurrentState())

}

fun getResult(result: Result) {
    return when(result) {
        is Error -> {
            println(result.exception.toString())
        }
        is Success -> {
            println(result.dataFetched?: "Ensure you start fetch function")
        }
        is Loading -> {
            println("Loading...")
        }
        is NotLoading -> {
            println("Idle")
        }
        is Failure.AnotherCustomFailure -> println(result.anotherCustomFailure.message)
        is Failure.CustomFailure -> println(result.customException.message)
    }
}

object Repository {
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null

    fun startFetch() {
        loadState = Loading
        dataFetched = "data"
    }

    fun finishedFetch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }

    fun error() {
        loadState = Error(exception = Exception("something went wrong"))
    }

    fun getCurrentState(): Result {
        return loadState
    }

    fun customFailure() {
        loadState = Failure.CustomFailure(customException = IOException("message from io exception"))
    }

    fun anotherCustomFailure() {
        loadState = Failure.AnotherCustomFailure(anotherCustomFailure = NullPointerException("null pointer exception"))
    }
}

sealed class Result

data class Success(val dataFetched: String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()

sealed class Failure: Result() {
    data class CustomFailure(val customException: IOException): Failure()
    data class AnotherCustomFailure(val anotherCustomFailure: NullPointerException): Failure()
}

//enum class Result {
//    SUCCESS,
//    ERROR,
//    IDLE,
//    LOADING
//}