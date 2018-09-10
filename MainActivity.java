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
    }/////onCreate

    private void s() {
        Toast.makeText(this, "호호", Toast.LENGTH_SHORT).show();
    }

    private void string() {

        Toast.makeText(this, "욱정이짱 ㅎ", Toast.LENGTH_SHORT).show();

    }

}/////MainActivity
