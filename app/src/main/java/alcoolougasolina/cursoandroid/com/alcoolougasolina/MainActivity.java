package alcoolougasolina.cursoandroid.com.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private  EditText precoGasolina;
    private Button botaoVerificar;
    private TextView resultadoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        resultadoTexto = (TextView) findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();
                Double valorAlcool = Double.parseDouble( textoPrecoAlcool );
                Double valorGasolina = Double.parseDouble( textoPrecoGasolina );


                double resultado = valorAlcool / valorGasolina;

                if( resultado <= 0.7 ){
                    resultadoTexto.setText("Porra voce dinheiro pra compra gasolina? Compra alcool mesmo pra fuder o motor logo");
                }else{
                    resultadoTexto.setText("Gasolina pacero compra aditivada seu liso");
                }

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
