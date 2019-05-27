package br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.R;
import br.com.digitalhouse.digital.comunicacaofragmentsexercicio1.interfaces.Comunicador;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    //Declaração da interface como atributo
    private Comunicador comunicador;

    public FirstFragment() {
        // Required empty public constructor
    }

    //context = activity = tela
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            comunicador = (Comunicador) context;
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        TextView text = view.findViewById(R.id.textViewVerde);

        text.setText("VERDE");

        return view;
    }

}
