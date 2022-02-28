import domain.model.Category
import domain.model.Todo

fun main() {
    val category = Category("ブログ")
    val todo = Todo("Kotlinの勉強", "DDDも一緒に学ぶ", category)
    todo.printTodo()
}
