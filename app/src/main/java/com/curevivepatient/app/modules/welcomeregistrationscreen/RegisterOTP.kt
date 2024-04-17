package com.curevivepatient.app.modules.welcomeregistrationscreen

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton
import com.curevivepatient.app.R
import com.curevivepatient.app.modules.loginotp.ui.OtpViewOtpviewBroadcastReceiver
import com.curevivepatient.app.modules.registationform1.ui.RegistrationFormOneActivity
import com.google.android.gms.auth.api.phone.SmsRetriever
import java.util.regex.Matcher
import java.util.regex.Pattern

class RegisterOTP : AppCompatActivity() {
    private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null

    val getActivityResult: ActivityResultLauncher<Intent> =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult(),
            ActivityResultCallback {
                val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
                getOtpFromMessage(message!!)
            })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_otp)

        val submitButton:AppCompatButton=findViewById(R.id.btnSubmit)
        submitButton.setOnClickListener {
            val i=Intent(this,RegistrationFormOneActivity::class.java)
            startActivity(i)
        }
    }

    override fun onStop(): Unit {
        super.onStop()
        unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
        super.onStart()
        registerBroadcastReceiver()
    }


    private fun startSmartUserConsent(): Unit {
        val client = SmsRetriever.getClient(this)
        client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
        otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
        otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
            object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
                override fun onSuccess(intent: Intent?) {
                    getActivityResult.launch(intent)
                }
                override fun onFailure() {

                }
            }
        val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
        registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
        val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
        val matcher: Matcher = otpPattern.matcher(message)
        if (matcher.find()) {
           // binding.otpViewOtpview.setText(matcher.group(0))
        }
    }
}