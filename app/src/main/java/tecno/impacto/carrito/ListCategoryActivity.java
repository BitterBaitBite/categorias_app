package tecno.impacto.carrito;

import android.content.Intent;
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

        TextView tv = (TextView) findViewById(R.id.textViewDatos);
        tv.setText(nombre);
    }
}
