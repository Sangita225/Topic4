package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    Button btnopen;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String viewcapital=bundle.getString("capital");
            textView=findViewById(R.id.txtview);
            textView.setText(viewcapital);
        }

        else{
            Toast.makeText(this,"No capital",Toast.LENGTH_SHORT).show();
        }
        btnopen=findViewById(R.id.btnopen);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntentActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });




    }
}
