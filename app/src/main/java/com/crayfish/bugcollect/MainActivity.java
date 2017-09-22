package com.crayfish.bugcollect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.crayfish.bugcollect.utils.CrashHandler;

public class MainActivity extends AppCompatActivity {

    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView button = (TextView)super.findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.print(s.equals("hhhh"));
            }
        });
        if(CrashHandler.getInstance().isExistFile()) {
            CrashHandler.getInstance().sendPreviousReportsToServer(this);
        }
    }
}
