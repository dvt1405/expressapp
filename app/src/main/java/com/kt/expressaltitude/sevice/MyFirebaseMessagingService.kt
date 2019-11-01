package com.kt.expressaltitude.sevice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    companion object{
        const val TAG =""
    }
    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
        Log.d(TAG, "From: " + p0.getFrom())

//        if (p0.getData().size > 0) {
//
//            if (/* Check if data needs to be processed by long running job */ true) {
//                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
//                scheduleJob();
//            } else {
//                // Handle message within 10 seconds
//                handleNow();
//            }
//
//        }

        // Check if message contains a notification payload.
        if (p0.notification != null) {
            Log.d(TAG, "Message Notification Body: " + p0.notification!!.body);
        }

    }

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        sendRegistrationToServer(p0)
    }

    private fun sendRegistrationToServer(p0: String) {

    }

    private fun handleNow() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun scheduleJob() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
