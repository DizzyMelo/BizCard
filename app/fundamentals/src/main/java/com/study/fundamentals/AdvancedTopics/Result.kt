package com.study.fundamentals.AdvancedTopics

fun main() {
    Repository.startFetch()
    getResult(Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(Repository.getCurrentState())
    Repository.error()
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
        else -> {
            println("N/A")
        }
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
}

abstract class Result

data class Success(val dataFetched: String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()


//enum class Result {
//    SUCCESS,
//    ERROR,
//    IDLE,
//    LOADING
//}