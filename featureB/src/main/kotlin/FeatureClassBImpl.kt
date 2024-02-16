import navigation.FeatureANavigation

class FeatureClassBImpl(private val router: Router) {

     fun navigate() {
         router.navigateTo(FeatureANavigation.CarsList, params = "")
     }
}