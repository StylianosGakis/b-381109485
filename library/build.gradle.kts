import com.android.build.api.variant.LibraryAndroidComponentsExtension

plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.compose)
}

android {
  namespace = "com.stylianosgakis.test"
  compileSdk = 35

  defaultConfig {
    minSdk = 24
    targetSdk = 35
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  kotlinOptions {
    jvmTarget = "11"
  }
  buildFeatures {
    compose = true
  }
}

extensions.configure<LibraryAndroidComponentsExtension> {
  beforeVariants { libraryVariantBuilder ->
    if (libraryVariantBuilder.buildType == "debug") {
      libraryVariantBuilder.enable = false
    }
  }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.runtime.ktx)
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.ui)
  implementation(libs.androidx.ui.graphics)
  implementation(libs.androidx.ui.tooling.preview)
  implementation(libs.androidx.material3)
  implementation(libs.androidx.ui.tooling)
  implementation(libs.androidx.ui.test.manifest)
}