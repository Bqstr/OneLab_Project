plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    id ("kotlin-kapt")
}

android {
    namespace = "com.example.onelab_homework"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.onelab_homework"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    kapt{

        arguments {
            arg("room.schemaLocation", "$projectDir/schemas") //creating schema of db in
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding  =true
        compose =true

    }

    buildFeatures {
    }
    composeOptions {
        kotlinCompilerExtensionVersion ="1.5.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("androidx.compose.foundation:foundation-android:1.6.4")
    implementation("androidx.compose.material3:material3-android:1.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



//Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")


    //Navigation Component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")




    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.5.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")


//Room
    implementation("androidx.room:room-runtime:2.6.1")//Room librialry
    implementation("androidx.room:room-ktx:2.6.1")//cotutine ,flow support
    kapt ("androidx.room:room-compiler:2.6.1")




    //flow
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")



//Room
    implementation("androidx.room:room-runtime:2.6.1")//Room librialry
    implementation("androidx.room:room-ktx:2.6.1")//cotutine ,flow support
    kapt ("androidx.room:room-compiler:2.6.1")


//compose
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material:material")
    implementation("androidx.compose.runtime:runtime")
    implementation("androidx.activity:activity-compose:1.7.2")
    //implementation ('androidx.compose:compose-bom:2022.10.00")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")

        //koil
    implementation("io.coil-kt:coil-compose:2.6.0")


    //work Manager
    implementation("android.arch.work:work-runtime-ktx:1.7.1")

    implementation("androidx.work:work-runtime-ktx:2.9.0")



    //Dagger-Hilt




}