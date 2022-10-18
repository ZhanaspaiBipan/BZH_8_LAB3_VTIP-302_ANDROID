package kz.talipovsn.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        // Переменная доступа к компоненту окна с инициализацией
        EditText editText = findViewById(R.id.editText);

        // Запрет на редактирование в компоненте "editText"
        editText.setKeyListener(null);

        // Очистка данных в компоненте "editText"
        editText.setText("");

        // Добавление данных в компонент "editText"
        editText.append(String.format("%s %s \n", getString(R.string.Введите_группу), getIntent().getStringExtra("Group")));
        editText.append(String.format("%s %s \n", getString(R.string.Укажите_технику), getIntent().getStringExtra("Tech")));
        editText.append(String.format("%s %s \n", getString(R.string.Выберите_ОС), getIntent().getStringExtra("OS")));
    }

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onNext(View v) {
        Intent intent = new Intent (ResultActivity.this, StartActivity.class);

        // Запуск второго окна
        startActivity(intent);
    }

    // МЕТОД ДЛЯ КНОПКИ ВЫХОДА
    public void onExit(View v) {
        finishAffinity();
    }

}


