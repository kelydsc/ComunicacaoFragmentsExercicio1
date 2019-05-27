package br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private String mensagem;

    public SecondFragment() {
        // Required empty public constructor
    }

    //Método que retorna uma instancia do fragmento
    public static Fragment newInstance(String mensagem){

        //Cria uma instancia do fragmento
        SecondFragment secondFragment = new SecondFragment();

        //Preenche o bundle
        Bundle bundle = new Bundle();
        bundle.putString("MENSAGEM", mensagem);

        //seta os argumentos
        secondFragment.setArguments(bundle);

        //retorna o fragmento
        return secondFragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments()!=null){
            mensagem = getArguments().getString("MENSAGEM");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        TextView text = view.findViewById(R.id.textViewVermelho);

        text.setText("VERMELHO");

        return view;
    }

}
