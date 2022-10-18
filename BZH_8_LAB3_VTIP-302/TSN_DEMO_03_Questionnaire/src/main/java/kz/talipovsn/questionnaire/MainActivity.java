package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gratitude);
    }
    public void onNext(View view) {
        // Создание второго окна
        Intent intent = new Intent(MainActivity.this, StartActivity.class);
        startActivity(intent);
    }
    public void onExit(View v) {
        finishAffinity();
    }
}