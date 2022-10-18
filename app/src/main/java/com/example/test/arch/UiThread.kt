package com.example.test

import android.os.Handler
import android.os.Looper

    private val handler = Handler(Looper.getMainLooper())

    fun ui(action: () -> Unit) = handler.post(action)
