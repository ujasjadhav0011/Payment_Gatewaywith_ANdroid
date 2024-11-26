package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.etName);
        EditText etDonationAmount = findViewById(R.id.etDonationAmount);
        Button btnDonate = findViewById(R.id.btnDonate);

        btnDonate.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String amount = etDonationAmount.getText().toString().trim();

            if (name.isEmpty() || amount.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Simulate payment process
                Intent intent = new Intent(this, com.example.donationapp.PaymentGatewayActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("amount", amount);
                startActivity(intent);
            }
        });
    }
}
