sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String) : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.message}")
        is Result.Error -> println("Error: ${result.message}")
    }
}

fun main() {
    handleResult(Result.Success("Message sent successfully"))
    handleResult(Result.Error("Something went wrong"))
}