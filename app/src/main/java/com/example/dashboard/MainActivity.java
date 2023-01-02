package com.example.dashboard;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ListView
        ListView listView = (ListView) findViewById(R.id.list_view);

        // Create a list of students
        final List<Student> students = new ArrayList<>();

// Get the arrays from the arrays.xml file
        TypedArray namesArray = getResources().obtainTypedArray(R.array.student_names);
        TypedArray imagesArray = getResources().obtainTypedArray(R.array.student_images);
        TypedArray rollNumbersArray = getResources().obtainTypedArray(R.array.student_roll_numbers);
        TypedArray agesArray = getResources().obtainTypedArray(R.array.student_ages);
        TypedArray mobileNumbersArray = getResources().obtainTypedArray(R.array.student_mobile_numbers);
        TypedArray emailAddressesArray = getResources().obtainTypedArray(R.array.student_email_addresses);
        TypedArray classNamesArray = getResources().obtainTypedArray(R.array.student_class_names);
        TypedArray citiesArray = getResources().obtainTypedArray(R.array.student_cities);

// Loop through the arrays and create a Student object for each item in the arrays
        for (int i = 0; i < namesArray.length(); i++) {
            String name = namesArray.getString(i);
            int image = imagesArray.getResourceId(i, -1);
            String rollNumber = rollNumbersArray.getString(i);
            int age = Integer.parseInt(agesArray.getString(i));
            String mobileNumber = mobileNumbersArray.getString(i);
            String emailAddress = emailAddressesArray.getString(i);
            String className = classNamesArray.getString(i);
            String city = citiesArray.getString(i);

            students.add(new Student(name, image, rollNumber, age, mobileNumber, emailAddress, className, city));
        }

// Recycle the typed arrays
        namesArray.recycle();
        imagesArray.recycle();
        rollNumbersArray.recycle();
        agesArray.recycle();
        mobileNumbersArray.recycle();
        emailAddressesArray.recycle();
        classNamesArray.recycle();
        citiesArray.recycle();
        StudentAdapter adapter = new StudentAdapter(this, students);

        // Set the adapter for the ListView
        listView.setAdapter(adapter);

        // Set an item click listener for the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected student
                Student selectedStudent = students.get(position);

                // Create an intent to open the StudentDetailsActivity
                Intent intent = new Intent(MainActivity.this, StudentDetails.class);

                // Pass the student data to the StudentDetailsActivity
                intent.putExtra("name", selectedStudent.getName());
                intent.putExtra("image", selectedStudent.getImage());
                intent.putExtra("rollNumber", selectedStudent.getRollNumber());
                intent.putExtra("age", selectedStudent.getAge());
                intent.putExtra("mobileNumber", selectedStudent.getMobileNumber());
                intent.putExtra("emailAddress", selectedStudent.getEmailAddress());
                intent.putExtra("className", selectedStudent.getClassName());
                intent.putExtra("city", selectedStudent.getCity());

                // Start the StudentDetailsActivity
                startActivity(intent);
            }
        });
    }
}



