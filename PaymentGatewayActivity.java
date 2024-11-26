package com.example.donationapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentGatewayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Simulate payment processing (you would integrate actual payment SDK here)
        new Handler().postDelayed(() -> {
            boolean paymentSuccess = Math.random() > 0.5; // Simulated outcome

            Intent intent;
            if (paymentSuccess) {

                intent = new Intent(this, com.example.donationapp.SuccessActivity.class);
            } else {
                intent = new Intent(this, FailureActivity.class);
            }
            startActivity(intent);
            finish();
        }, 2000); // Simulate a 2-second delay
    }
}
