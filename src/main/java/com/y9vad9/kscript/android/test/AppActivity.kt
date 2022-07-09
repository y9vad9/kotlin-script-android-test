package com.y9vad9.kscript.android.test

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.y9vad9.scriptkt.ScriptKt
import com.y9vad9.scriptkt.classpathFromClassOrThrow
import com.y9vad9.scriptkt.moduleKts
import com.y9vad9.scriptkt.runScriptOrThrow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

private val CODE = """
    println("Test")
""".trimIndent()

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking {
            val scriptModule = moduleKts(ScriptKt(code = CODE)) {}.runScriptOrThrow()
        }
    }
}