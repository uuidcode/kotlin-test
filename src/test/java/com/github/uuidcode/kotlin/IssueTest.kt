package com.github.uuidcode.kotlin

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.Rfc3339DateJsonAdapter
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.*

class IssueTest {
    @Test
    fun test() {
        val issueJson = """
            {
              "url": "https://api.github.com/repos/square/okio/issues/156",
              "id": 91393390,
              "number": 156,
              "title": "ByteString CharSequence idea",
              "state": "open",
              "created_at": "2015-06-27T00:49:40.000Z"
            }
        """

        val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .add(Date::class.java, Rfc3339DateJsonAdapter().nullSafe())
                .build()
        val issueAdapter = moshi.adapter(Issue::class.java)
        val issue = issueAdapter.fromJson(issueJson)

        assertThat(issue?.title).isEqualTo("ByteString CharSequence idea")
        assertThat(issue?.state).isEqualTo("open")
    }
}