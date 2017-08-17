package com.github.uuidcode.kotlin

import com.squareup.moshi.Json
import java.util.*

data class Issue(
        val url: String,
        val id: Long,
        val number: Long,
        val title: String,
        val state: String,
        val comments: Long = 0L,
        @Json(name = "created_at") val createdAt: Date,
        @Json(name = "closed_at") val closedAt: Date?,
        val body: String = "")