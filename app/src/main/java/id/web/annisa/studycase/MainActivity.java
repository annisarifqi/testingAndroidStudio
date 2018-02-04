package id.web.annisa.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.name;
import static android.R.attr.value;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    private EditText mMenu, mPorsi;
    private Button mEatbus, mAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = (EditText) findViewById(R.id.editText_menu);
        mPorsi = (EditText) findViewById(R.id.editText_porsi);
        mEatbus = (Button) findViewById(R.id.button_eatbus);
        mAbnormal = (Button) findViewById(R.id.button_abnormal);

        mEatbus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, SecondActivity.class);
                next.putExtra("tempat", "Eatbus");
                next.putExtra("menu", mMenu.getText().toString());
                next.putExtra("porsi", mPorsi.getText().toString());
                next.putExtra("harga", "50000");
                startActivity(next);
            }
        });

        mAbnormal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent next = new Intent(MainActivity.this, SecondActivity.class);
                next.putExtra("tempat", "Abnormal");
                next.putExtra("menu", mMenu.getText().toString());
                next.putExtra("porsi", mPorsi.getText().toString());
                next.putExtra("harga", "30000");
                startActivity(next);
            }
        });


    }

}
