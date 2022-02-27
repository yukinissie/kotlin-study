
class Category(name: String) {
    private var name: String

    init {
        this.name = name
    }

    fun getName(): String {
        return this.name
    }
}

class Todo(title: String, body: String, category: Category) {
    private var title: String
    private var body: String
    private var category: Category

    init {
        this.title = title
        this.body = body
        this.category = category
    }

    fun printTodo() {
        print(this.title + this.body + this.category.getName())
    }
}

fun main() {
    val category = Category("ブログ")
    val todo = Todo("Kotlinの勉強", "DDDも一緒に学ぶ", category)
    todo.printTodo()
}
