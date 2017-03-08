package kr.soen.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView myText = new TextView(this);
        myText.setText("Hello World !!! 권민경 ~~");

        setContentView(myText);
    }
}
