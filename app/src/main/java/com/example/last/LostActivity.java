package com.example.last;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LostActivity extends AppCompatActivity {

    EditText edit1;
    EditText edit2;
    Button reg;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_lostitem);

        edit1 = (EditText) findViewById(R.id.edt_category);
        edit2 = (EditText) findViewById(R.id.edt_ItemName);
        reg = (Button) findViewById(R.id.btn_Signup);

        final FirebaseDatabase db = FirebaseDatabase.getInstance();
        final DatabaseReference table_lostlist = db.getReference("lostitem");


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table_lostlist.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        User user = new User(edit1.getText().toString());
                        Intent intent = new Intent(LostActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }


        });
    }
}