package com.otus.securehomework.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.asLiveData
import com.otus.securehomework.R
import com.otus.securehomework.data.source.local.SecuredPrefs
import com.otus.securehomework.presentation.auth.AuthActivity
import com.otus.securehomework.presentation.home.HomeActivity
import com.otus.securehomework.presentation.startNewActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity  : AppCompatActivity() {

    @Inject
    lateinit var userPreferences: SecuredPrefs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        userPreferences.accessToken.asLiveData().observe(this, {
            val activity = if (it.isNullOrEmpty()) {
                AuthActivity::class.java
            } else {
                HomeActivity::class.java
            }
            startNewActivity(activity)
        })
    }
}