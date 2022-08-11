
abstract class BaseViewModel: IOnUpdateListener {

    override fun onSuccess() {
        onRefreshPassesCompletedSuccess()
    }

    override fun onFailed(error: String) {
        onUpdateFirebaseUserDataSuccess()
    }

    abstract fun onRefreshPassesCompletedSuccess()
    abstract fun onRefreshPassesCompletedFailure(error: String)
    abstract fun onUpdateFirebaseUserDataSuccess()
    abstract fun onUpdateFirebaseUserDataFailure(error: String)
}