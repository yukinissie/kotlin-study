package domain.model

class Category(name: String) {
    private var name: String

    init {
        this.name = name
    }

    fun getName(): String {
        return this.name
    }
}
