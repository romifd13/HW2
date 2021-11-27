package com.kotlin.hw2

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}