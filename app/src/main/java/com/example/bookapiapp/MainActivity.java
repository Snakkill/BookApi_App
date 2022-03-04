package com.example.bookapiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bookapiapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText mBookInput;
    TextView mTitleText, mAuthorText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        mBookInput = findViewById(R.id.userInput);
        binding.setMessage("hello world this is dynamic ");
    }

    public void searchBooks(View view) {
        String queryString = mBookInput.getText().toString();
        mTitleText=findViewById(R.id.result1);
        mAuthorText=findViewById(R.id.result2);
        new FetchBookTask(mTitleText, mAuthorText).execute(queryString);


    }
}