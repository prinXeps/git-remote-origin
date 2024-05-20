package com.example.myapplication;  // 패키지 이름이 올바른지 확인

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.myapplication.R;  // R 클래스 임포트

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void one(View view) {
        Toast.makeText(this, "You're butter guy", Toast.LENGTH_LONG).show();
    }
    public void two(View view) {
        Toast.makeText(this, "You're romantic guy", Toast.LENGTH_LONG).show();

    }
    public void third(View view) {
        Toast.makeText(this, "You're realistic guy", Toast.LENGTH_LONG).show();

    }

}