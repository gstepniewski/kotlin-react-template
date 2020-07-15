import react.dom.render
import kotlin.browser.document

private val pageMapping = listOf(
        "index" to Index::class
)

fun main() {
    pageMapping.map { document.getElementById("root-${it.first}") to it.second }
               .filter { it.first != null }
               .forEach { render(it.first) { child(it.second) { } } }
}