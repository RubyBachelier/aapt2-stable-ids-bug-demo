plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.aapt2stableidsbugdemo"
    compileSdk = 36

    defaultConfig {
        minSdk = 32
    }

    androidResources.additionalParameters += "--stable-ids"
    androidResources.additionalParameters += "${projectDir}/public-ids.txt"
}