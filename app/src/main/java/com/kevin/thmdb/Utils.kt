package com.kevin.thmdb

import android.text.Html
import android.text.Spanned

object Utils {

    fun String.fromHtml(): Spanned {
        return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    }
}