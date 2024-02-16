class Router {

    fun navigateTo(screen: NavigationScreen, params: Any?) {


    }
}

fun test() {
    val mainRouter = MainRouter(screen = "ScreenA")
}

// Odyssey 3.11
// KViewModel-Odyssey 0.15 -> Odyssey 3.0

// Odyssey 3.0
//data class MainRouter(val screen: String)

// Odyssey 3.11
data class MainRouter(val screen: String, val params: Any? = null)