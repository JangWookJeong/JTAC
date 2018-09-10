package project.codename.jtac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        string();
        
        s();
        
        delete();
    }/////onCreate

    private void delete() {
        Toast.makeText(this, "인생을 지우다ㅓ.씨발럼들아", Toast.LENGTH_SHORT).show();
    }

    private void s() {
        Toast.makeText(this, "호호", Toast.LENGTH_SHORT).show();
    }

    private void string() {

        Toast.makeText(this, "욱정이짱 ㅎ", Toast.LENGTH_SHORT).show();

    }

}/////MainActivity
