plugins {
    alias(libs.plugins.buildLogicModuleFeature)
}

android {
    namespace = "${libs.versions.app.applicationId.get()}.ui.feature.deepLink"
}

dependencies {
    implementation("androidx.browser:browser:1.8.0")
}
