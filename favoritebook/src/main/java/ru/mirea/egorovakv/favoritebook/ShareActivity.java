package ru.mirea.egorovakv.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView bookView = findViewById(R.id.bookTextView);
            String book = extras.getString(MainActivity.KEY);
            bookView.setText(String.format("Мой любимая книга: %s", book));
        }
    }

    public void onSendButtonClicked(View view) {
        EditText editText = findViewById(R.id.useBookEditText);
        String text = "Название Вашей\n" +
                "любимой книги: "+ editText.getText().toString();

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}