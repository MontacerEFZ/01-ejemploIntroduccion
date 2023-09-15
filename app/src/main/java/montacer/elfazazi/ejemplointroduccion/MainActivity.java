package montacer.elfazazi.ejemplointroduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables de la interfaz
    private TextView txtContador;
    private Button btnPulsar;

    //variables para la logica

    private int contador; //prohibido inicializar variables al declararlas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lo q hagamos ira despues de la linea de " setContentView(R.layout.activity_main);"
            //porq primero tiene  q localizar la vista a la que nos referiremos

        inicializar();
        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                txtContador.setText("Pulsado "+contador+" veces");
            }
        });


    }

    private void inicializar() {
        contador = 0;

        txtContador = findViewById(R.id.txtContadorMain);
        btnPulsar = findViewById(R.id.btnPulsarMain);
    }
}