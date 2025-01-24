# Kotlin ConcurrentModificationException
This repository demonstrates a common error in Kotlin involving the `ConcurrentModificationException`.  The `bug.kt` file shows the incorrect approach of removing elements from a list while iterating using a traditional for loop. This leads to the `ConcurrentModificationException`. The `bugSolution.kt` file provides the correct way to remove elements during iteration, avoiding the exception.

## How to Reproduce
1. Clone this repository.
2. Run `bug.kt`. Observe the `ConcurrentModificationException`.
3. Run `bugSolution.kt`. Observe the correct behavior.