package plantProject.fr;

import android.os.Bundle;
import android.widget.TextView;

public class temperatureDetail extends NavDrawerActivity {

    private TextView texte;
    private TextView message;
    private TextView valeur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContent(R.layout.activity_temperature_detail);

        texte = findViewById(R.id.bodyTemp);

        texte.setText(String.format(getString(R.string.tempInfo1), MainActivity.nom, MainActivity.plante.temperatureMoins, MainActivity.plante.temperaturePlus, MainActivity.temperature));

        message = findViewById(R.id.messageTemp);
        valeur = findViewById(R.id.valeurTemp);

        if (MainActivity.temperature < MainActivity.plante.temperatureMoins){
            message.setText("Température trop faible");
        }

        else if (MainActivity.temperature > MainActivity.plante.temperaturePlus){
            message.setText("Température trop forte");
        }

        else{
            message.setText("Tout est OK");
        }

        valeur.setText(MainActivity.temperature + " °C");
    }
}
