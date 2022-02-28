package domain.model

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