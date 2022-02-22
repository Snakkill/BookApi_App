package com.example.bookapiapp;

import android.os.AsyncTask;
import android.widget.TextView;

public class FetchBookTask extends AsyncTask<String,Void,String> {

private TextView mTitleText;
private TextView mAuthorText;



    public FetchBookTask(TextView mTitleText, TextView mAuthorText) {
        this.mTitleText=mTitleText;
        this.mAuthorText=mAuthorText;
    }

    @Override //change parameters to bookname
    protected String doInBackground(String... bookname) {
        return NetworkUtils.getBookInfo(bookname[0]) ;
    }
    //change parameters to jsonString
    @Override
    protected void onPostExecute(String jsonString) {
        super.onPostExecute(jsonString);
    }
}

