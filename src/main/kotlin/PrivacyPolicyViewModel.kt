
class PrivacyPolicyViewModel: IOnUpdateListener {

    fun agreeToTermsPrivacy() {
        OnairFirebaseService.updateEULA(this@PrivacyPolicyViewModel)
    }

    override fun onSuccess() {
    }

    override fun onFailed(error: String) {
    }
}