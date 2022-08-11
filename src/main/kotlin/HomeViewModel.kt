
class HomeViewModel: BaseViewModel() {

    override fun onRefreshPassesCompletedSuccess() {
        println("onRefreshPassesCompletedSuccess")
    }

    override fun onRefreshPassesCompletedFailure(error: String) {
        println("onRefreshPassesCompletedFailure")
    }

    override fun onUpdateFirebaseUserDataSuccess() {
        println("onUpdateFirebaseUserDataSuccess")
    }

    override fun onUpdateFirebaseUserDataFailure(error: String) {
        println("onUpdateFirebaseUserDataFailure")
    }


}