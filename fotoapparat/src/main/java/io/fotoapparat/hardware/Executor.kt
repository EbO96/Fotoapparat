package io.fotoapparat.hardware

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors


private val cameraExecutor = Executors.newSingleThreadExecutor()
private val loggingExecutor = Executors.newSingleThreadExecutor()
private val mainThreadHandler = Handler(Looper.getMainLooper())
/**
 * [java.util.concurrent.Executor] operating the [io.fotoapparat.result.PendingResult].
 */
internal val pendingResultExecutor = Executors.newSingleThreadExecutor()
/**
 * [java.util.concurrent.Executor] operating the [io.fotoapparat.preview.PreviewStream].
 */
internal val frameProcessingExecutor = Executors.newSingleThreadExecutor()

/**
 * Executes a camera operation.
 */
internal fun execute(function: () -> Unit) = cameraExecutor.execute(function)

/**
 * Executes a camera operation.
 */
internal fun execute(function: Runnable) = cameraExecutor.execute(function)

/**
 * Executes an operation in the main thread.
 */
internal fun executeLoggingThread(function: () -> Unit) = loggingExecutor.execute { function() }

/**
 * Executes an operation in the main thread.
 */
internal fun executeMainThread(function: () -> Unit) = mainThreadHandler.post { function() }
