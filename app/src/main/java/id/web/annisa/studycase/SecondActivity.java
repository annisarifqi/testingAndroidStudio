package id.web.annisa.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class SecondActivity extends AppCompatActivity {
    TextView mtempat;
    TextView mmenu;
    TextView mporsi;
    TextView mharga;
    private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mtempat = (TextView) findViewById(R.id.text_heading);
        mmenu = (TextView) findViewById(R.id.text_menu);
        mporsi = (TextView) findViewById(R.id.text_porsi);
        mharga = (TextView) findViewById(R.id.text_harga);

        Intent intent = getIntent();

        String tempat = intent.getStringExtra("tempat");
        String menu = intent.getStringExtra("menu");
        String porsi = intent.getStringExtra("porsi");
        String harga = intent.getStringExtra("harga");

        int totalharga = Integer.valueOf(harga) * Integer.valueOf(porsi);

        mtempat.setText(tempat);
        mmenu.setText(menu);
        mporsi.setText(porsi);
        mharga.setText(String.valueOf(harga));

        if (totalharga < uang){
            Toast.makeText(SecondActivity.this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(SecondActivity.this, "Jangan makan disini, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}
