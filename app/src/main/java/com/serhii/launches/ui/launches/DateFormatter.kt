package com.serhii.launches.ui.launches

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class DateFormatter @Inject constructor() {

    private val formatter = SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH)

    fun formatDate(unix: Long): String {
        return formatter.format(Date(unix * 1000))
    }
}
