fun main(args: Array<String>) {

    val homeViewModel = HomeViewModel()
    homeViewModel.onSuccess()
    homeViewModel.onFailed("")

    println("----")
    val privacyPolicyViewModel = PrivacyPolicyViewModel()
    privacyPolicyViewModel.agreeToTermsPrivacy()
}
