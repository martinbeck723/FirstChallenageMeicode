package com.example.firstchallenagemeicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
     //first get all the text
        TextView txtFirst= findViewById(R.id.txtFirst);
        TextView txtLast= findViewById(R.id.txtLast);
        TextView txtEmail= findViewById(R.id.txtEmail);

        EditText edtTxtLast=findViewById(R.id.edtTxtLast);
        EditText edtTxtFisrt=findViewById(R.id.edtTxtFirst);
        EditText edtTxtEmail=findViewById(R.id.edtTxtEmail);
    //then show it to user
        txtFirst.setText(edtTxtLast.getText().toString());
        txtLast.setText(edtTxtFisrt.getText().toString());
        txtEmail.setText(edtTxtEmail.getText().toString());
    }
}
