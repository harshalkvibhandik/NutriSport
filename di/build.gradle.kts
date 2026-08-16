import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "di"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)

            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose.viewmodel)

            // implementation(libs.kotzilla.sdk)
            implementation(libs.kotzilla.sdk)

            implementation(project(":feature:auth"))
            implementation(project(":feature:details"))
            implementation(project(":feature:home"))
            implementation(project(":feature:profile"))
            implementation(project(":feature:admin_panel"))
            implementation(project(":feature:admin_panel:manage_product"))
            implementation(project(":feature:home:products_overview"))
            implementation(project(":feature:home:cart"))
            implementation(project(":feature:home:cart:checkout"))
            implementation(project(":feature:home:categories:category_search"))
            implementation(project(":feature:payment_completed"))
            implementation(project(":data"))
            implementation(project(":shared"))
        }
    }
}

android {
    namespace = "com.nutrisport.di"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    lint {
        targetSdk = 37
    }
    testOptions {
        targetSdk = 37
    }
}