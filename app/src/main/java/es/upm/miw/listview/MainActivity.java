package es.upm.miw.listview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    private final String[] datos = new String[] {
            "Dato 1", "Dato 2", "Dato 3", "Dato 4",
            "Dato 5", "Dato 6", "Dato 7", "Dato 8",
            "Dato 9", "Dato 10", "Dato 11", "Dato 12"};
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.myListView);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                datos);

        myListView.setAdapter(adaptador);
        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String texto = "Opcion elegida: "+parent.getItemAtPosition(position).toString();
        Log.i("MiW", texto);
        Snackbar.make(parent, texto, Snackbar.LENGTH_LONG).show();

    }
}
