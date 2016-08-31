package br.com.erico.geografia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private RatingBar ratingBar;
    private EditText editText;
    private ListView listView;

    private Brasil[] estados;

    private DeputadosEleitos deputadosEleitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        editText = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);

        estados = Brasil.values();
        seekBar.setMax(estados.length - 1);

        deputadosEleitos = new DeputadosEleitos();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("SeekBar", String.valueOf(progress));
                Brasil estado = estados[progress];

                editText.setText(estado.getEstado());
                float rate = Integer.parseInt(estado.getTotal_cidades())/200;
                ratingBar.setRating(rate);

                loadDeputados(estado.name());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void loadDeputados(String estado) {
        ArrayList<Deputado> deputados = deputadosEleitos.getByState(estado);

        ArrayAdapter<Deputado> adapter = new ArrayAdapter<Deputado>
                (MainActivity.this, android.R.layout.simple_list_item_1, deputados);

        listView.setAdapter(adapter);
    }
}
