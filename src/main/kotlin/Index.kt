import kotlinx.css.Color
import kotlinx.css.color
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1
import styled.css
import styled.styledDiv

class Index : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        h1 { +"Hello" }
        styledDiv {
            css {
                color = Color.red
            }
            +"Insert your app here"
        }
    }

}
