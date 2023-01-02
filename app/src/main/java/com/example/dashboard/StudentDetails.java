package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentDetails extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.student_details);

            // Get the intent that started this activity
            Intent intent = getIntent();

            // Get the student data from the intent
            String name = intent.getStringExtra("name");
            int image = intent.getIntExtra("image", 0);
            String rollNumber = intent.getStringExtra("rollNumber");
            int age = intent.getIntExtra("age", 0);
            String mobileNumber = intent.getStringExtra("mobileNumber");
            String emailAddress = intent.getStringExtra("emailAddress");
            String className = intent.getStringExtra("className");
            String city = intent.getStringExtra("city");

            // Get the ImageView and TextViews
            ImageView imageView = (ImageView) findViewById(R.id.image_view);
            TextView nameTextView = (TextView) findViewById(R.id.name_text_view);
            TextView rollNumberTextView = (TextView) findViewById(R.id.roll_number_text_view);
            TextView ageTextView = (TextView) findViewById(R.id.age_text_view);
            TextView mobileNumberTextView = (TextView) findViewById(R.id.mobile_number_text_view);
            TextView emailAddressTextView = (TextView) findViewById(R.id.email_address_text_view);
            TextView classNameTextView = (TextView) findViewById(R.id.class_name_text_view);
            TextView cityTextView = (TextView) findViewById(R.id.city_text_view);

            // Set the student data on the ImageView and TextViews
            imageView.setImageResource(image);
            nameTextView.setText(name);
            rollNumberTextView.setText(rollNumber);
            ageTextView.setText(String.valueOf(age));
            mobileNumberTextView.setText(mobileNumber);
            emailAddressTextView.setText(emailAddress);
            classNameTextView.setText(className);
            cityTextView.setText(city);
        }
    }
