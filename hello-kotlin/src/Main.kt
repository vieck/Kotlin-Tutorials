/**
 * Created by mvieck on 6/16/2017.
 */
fun main(args: Array<String>) {
//    var michael = Person("Michael");
//    michael.displayWithLamda(::printName);

    val q = Question();
    q.display();
    println("The answer to the question \"${q.Question}\" is ${q.Answer}")
    val message =
    if(q.Answer == q.CorrectAnswer) {
       "You were correct"
    } else {
        "Try again?"
    }
    println(message);
}

fun printName(name: String) {
    println("My name is $name");
}

class Question {
    var Answer:String = "42";
    val CorrectAnswer = "42";
    val Question = "What is the answer to life, the universe, and everything?"
    fun display() {
        println("You said ${Answer}")
    }
}

