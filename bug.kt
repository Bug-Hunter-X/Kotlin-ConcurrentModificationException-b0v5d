```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    //This is wrong and will throw ConcurrentModificationException
    for (i in list){
        if (i == 3) list.remove(i)
    }
    println(list) //Throws ConcurrentModificationException

    //Correct way to remove element during iteration
    list.removeAll { it == 3 }
    println(list)//Output: [1,5]
}
```