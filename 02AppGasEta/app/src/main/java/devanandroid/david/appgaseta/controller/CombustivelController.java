package devanandroid.david.appgaseta.controller;

import android.content.SharedPreferences;

import devanandroid.david.appgaseta.model.Combustivel;
import devanandroid.david.appgaseta.view.GasEtaActivity;

public class CombustivelController {

    SharedPreferences preferences;

    SharedPreferences.Editor dadosPreferences;

    // psfs = Public Static Final String

    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController(GasEtaActivity activity){

        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);

        dadosPreferences = preferences.edit();

    }

    public void salvar(Combustivel combustivel) {

        dadosPreferences.putString("combustível",combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("preçoDoCombustível", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("Recomendação", combustivel.getRecomendacao());
        dadosPreferences.apply();

    }

      public void limpar() {

        dadosPreferences.clear();
        dadosPreferences.apply();
    }
}
