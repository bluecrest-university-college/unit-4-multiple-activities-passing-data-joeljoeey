package com.example.joelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    EditText myeditemail;
    TextView label;
    Button check_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(10,20,10,20);

        myeditemail = new EditText(this);
        myeditemail.setHint("Enter your email");

        label = new TextView(this);
        label.setGravity(Gravity.CENTER);

        check_email = new Button(this);
        check_email.setText("Check Email");
        check_email.setAllCaps(true);

        check_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checker = myeditemail.getText().toString();

                if (checker.contains("@")){
                    label.setText("VALID");
                }else{
                    label.setText("INVALID");
                }
            }
        });

        linearLayout.addView(myeditemail);
        linearLayout.addView(label);
        linearLayout.addView(check_email);

        setContentView(linearLayout);
    }
}
