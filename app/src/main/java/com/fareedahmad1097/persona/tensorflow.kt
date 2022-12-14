package com.fareedahmad1097.persona

import com.google.android.gms.tflite.client.TfLiteInitializationOptions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.lite.task.gms.vision.TfLiteVision
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class tensorflow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_tensorflow)

//        val options = TfLiteInitializationOptions.builder()
//            .setEnableGpuDelegateSupport(true)
//            .build()

        TfLiteVision.initialize(context, options).addOnSuccessListener {
            objectDetectorListener.onInitialized()
        }.addOnFailureListener {
            // Called if the GPU Delegate is not supported on the device
            TfLiteVision.initialize(context).addOnSuccessListener {
                objectDetectorListener.onInitialized()
            }.addOnFailureListener{
                objectDetectorListener.onError("TfLiteVision failed to initialize: "
                        + it.message)
            }
        }
    }
}

