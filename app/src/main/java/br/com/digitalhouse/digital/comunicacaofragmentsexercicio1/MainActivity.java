package br.com.digitalhouse.digital.comunicacaofragmentsexercicio1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.fragments.FirstFragment;
import br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.fragments.SecondFragment;
import br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.interfaces.Comunicador;

public class MainActivity extends AppCompatActivity implements Comunicador {

    private Button btnFragment1;
    private Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //inicializa as views
        initViews();

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mostra o fragmento no container da activity
                replaceFragment(new FirstFragment());
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mostra o fragmento no container da activity
                replaceFragment(new SecondFragment());
            }
        });

    }

    private void initViews() {
        btnFragment1 = findViewById(R.id.button1);
        btnFragment2 = findViewById(R.id.button2);
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container2,fragment);
        transaction.addToBackStack("FRAGMENTS");
        transaction.commit();
    }

    @Override
    public void receberMensagem(String mensagem) {

        //pega uma instancia do fragmento que irá receber a mensagem
        Fragment fragment = SecondFragment.newInstance(mensagem);

    }

}
