package com.example.parkingslottracker_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginForm extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private TextView errorMessage;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Ensure XML is named activity_login.xml

        // Initialize views
        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        errorMessage = findViewById(R.id.error_message);
        loginButton = findViewById(R.id.login_button);

        // Set click listener for the login button
        loginButton.setOnClickListener(v -> handleLogin());
    }

    // Handle login logic
    private void handleLogin() {
        String username = usernameInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();

        // Example: Hardcoded username and password for validation
        if (username.equals("student1") && password.equals("password123")) {
            // Successful login
            errorMessage.setVisibility(View.GONE); // Hide error message
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();

            // Redirect to DashboardActivity
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
            finish();
        } else {
            // Failed login
            errorMessage.setVisibility(View.VISIBLE); // Show error message
        }
    }
}
