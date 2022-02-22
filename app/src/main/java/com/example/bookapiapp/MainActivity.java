package com.example.bookapiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mBookInput;
    TextView mTitleText, mAuthorText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBookInput = findViewById(R.id.userInput);

    }

    public void searchBooks(View view) {
        String queryString = mBookInput.getText().toString();
        mTitleText=findViewById(R.id.result1);
        mAuthorText=findViewById(R.id.result2);
        new FetchBookTask(mTitleText, mAuthorText).execute(queryString);


    }
}