package io.fotoapparat.test

import io.fotoapparat.capability.Capabilities
import io.fotoapparat.configuration.DefinedConfiguration
import io.fotoapparat.parameter.Flash
import io.fotoapparat.parameter.FocusMode
import io.fotoapparat.parameter.FpsRange
import io.fotoapparat.parameter.Resolution
import io.fotoapparat.parameter.camera.CameraParameters
import io.fotoapparat.preview.Frame
import io.fotoapparat.selector.single

/**
 * Test object for [Resolution].
 */
val testResolution = Resolution(10, 10)

/**
 * Test object for [FpsRange].
 */
val testFpsRange = FpsRange(20000, 20000)

/**
 * Test object for camera sensitivity values.
 */
val testIso = 100

/**
 * Test object for [DefinedConfiguration].
 */
internal val testConfiguration = DefinedConfiguration(
        flashMode = single(Flash.AutoRedEye),
        focusMode = single(FocusMode.Fixed),
        frameProcessor = {},
        previewFpsRange = single(testFpsRange),
        sensorSensitivity = single(testIso),
        pictureResolution = single(testResolution),
        previewResolution = single(testResolution)
)

/**
 * Test object for [Capabilities].
 */
val testCapabilities = Capabilities(
        canZoom = false,
        flashModes = setOf(Flash.AutoRedEye),
        focusModes = setOf(FocusMode.Fixed),
        canSmoothZoom = false,
        previewFpsRanges = setOf(testFpsRange),
        pictureResolutions = setOf(testResolution),
        previewResolutions = setOf(testResolution),
        sensorSensitivities = setOf(testIso)
)

/**
 * Test object for [CameraParameters].
 */
val testCameraParameters = CameraParameters(
        flashMode = Flash.AutoRedEye,
        focusMode = FocusMode.Fixed,
        previewFpsRange = testFpsRange,
        sensorSensitivity = testIso,
        pictureResolution = testResolution,
        previewResolution = testResolution
)

/**
 * Test frame processor.
 */
val testFrameProcessor: (Frame) -> Unit = { }