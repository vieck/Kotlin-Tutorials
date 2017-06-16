/**
 * Created by mvieck on 6/16/2017.
 */
class Person(var Name: String) {
    fun display() {
        println("Display: $Name");
    }

    fun displayWithLamda(func: (s:String) -> Unit) {
        func(Name);
    }
}