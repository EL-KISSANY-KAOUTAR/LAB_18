package projet.fst.ma.viewmodellivedatademoenrichi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private CounterViewModel viewerrModellllll;
    private TextView tvv__Counterrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des vues avec les IDs du XML (noms personnalisés)
        tvv__Counterrr = findViewById(R.id.tvv__Counterrr);

        Button boutton__Incrementtttt = findViewById(R.id.boutton__Incrementtttt);
        Button boutton__Decrementtttt = findViewById(R.id.boutton__Decrementtttt);
        Button bouttnResettt = findViewById(R.id.bouttnResettt);

        // Initialisation du ViewModel personnalisé
        viewerrModellllll = new ViewModelProvider(this)
                .get(CounterViewModel.class);

        // Observation du LiveData pour mettre à jour l'UI automatiquement
        viewerrModellllll.getCount().observe(this, integer -> 
                tvv__Counterrr.setText(String.valueOf(integer))
        );

        // Actions sur les boutons avec les méthodes personnalisées du ViewModel
        boutton__Incrementtttt.setOnClickListener(v ->
                viewerrModellllll.iiincrementtttt()
        );

        boutton__Decrementtttt.setOnClickListener(v ->
                viewerrModellllll.deeecrementtttt()
        );

        boutton__Decrementtttt.setOnClickListener(v ->
                viewerrModellllll.deeecrementtttt()
        );

        bouttnResettt.setOnClickListener(v ->
                viewerrModellllll.reset()
        );
    }
}
