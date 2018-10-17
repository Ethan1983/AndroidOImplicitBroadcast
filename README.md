# AndroidOImplicitBroadcast
Handle Implicit Intents in Android O

Demonstrate Partial support for handling implicit intents in Android Oreo.
Application has an empty boot completed receiver and is used as a hook to execute logic in Application class to
register implicit intent receivers dynamically.

Note that this is partial as the logic doesn't persist after a process kill by Android.

   
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        IntentFilter().apply {
            addAction( Intent.ACTION_PACKAGE_REPLACED )
            addAction( ConnectivityManager.CONNECTIVITY_ACTION )
        }.also {
            registerReceiver( ImplicitIntentReceiver(), it )
        }

    }

}
