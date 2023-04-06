package devanandroid.david.appgaseta.controller;

import java.util.ArrayList;
import java.util.List;

import devanandroid.david.appgaseta.model.Curso;

public class CursoController {


    private List listCursos;

    public List getListaDeCursos() {

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Programação"));
        listCursos.add(new Curso("Terapia5D"));
        listCursos.add(new Curso("Cafetão"));
        listCursos.add(new Curso("Artista"));
        listCursos.add(new Curso("Produtor Musical"));
        listCursos.add(new Curso("Prostituta"));
        listCursos.add(new Curso("Engenharia"));
        listCursos.add(new Curso("Psicologia"));

        return listCursos;

    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getListaDeCursos().size(); i++) {

            Curso objeto = (Curso) getListaDeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());

        }

        return dados;

    }

}