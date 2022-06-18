package rah.agahi.ketab;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import rah.agahi.ketab.util.Base;

public class LoginActivity extends Base implements View.OnClickListener {
EditText editText;
Button button;
    String edtName;

Boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUpViews();
    }

    private void setUpViews() {
        editText = findViewById(R.id.edtlogin);
        button = findViewById(R.id.btnEnter);
        saveEdtName();

        button.setOnClickListener(this);
       editText.setOnClickListener(this);
    }

    private void saveEdtName() {
        edtName = editText.getText().toString().trim();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId){
            case R.id.edtlogin:
                edtValidation();
                break;

            case R.id.btnEnter:
                enterToApp();
                break;
        }
    }

    private void enterToApp() {
        edtValidation();

    }

    @SuppressLint("CommitPrefEdits")
    private void saveName() {
        isLogin = !isLogin;
        saveEdtName();
        SharedPreferences sharedPreferences = getSharedPreferences("LOGIN",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("edtName",edtName);
        editor.putBoolean("isLogin",isLogin);
        editor.apply();
    }

    private void edtValidation() {
        saveEdtName();
        if (edtName.isEmpty()){
            Toast.makeText(LoginActivity.this, "لطفا کادر رو خالی نذارید.", Toast.LENGTH_SHORT).show();
        }else {
            saveName();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}