package devanandroid.david.appgaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devanandroid.david.appgaseta.model.Pessoa;
import devanandroid.david.appgaseta.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listaVip";

    public PessoaController(MainActivity activity){
        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }


    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller Iniciada...");

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobreNome());
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
        listaVip.apply();

    }

    public Pessoa buscar(Pessoa pessoa) {

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "N_A"));
        pessoa.setSobreNome(preferences.getString("sobreNome", "N_A"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "N_A"));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", "N_A"));

        return pessoa;
    }

    public void limpar() {

         listaVip.clear();
          listaVip.apply();

    }

    }

