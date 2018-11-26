package tecno.impacto.carrito;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);

        Intent i = getIntent();

        String nombre = i.getStringExtra("nombreCat");


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String cat = preferences.getString("cat", "n/a");




        TextView tv = (TextView) findViewById(R.id.textViewDatos);
        tv.setText(cat);
    }
}
