package devanandroid.david.appgaseta.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";
    public static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    // ESTRUTURA -- MUDEI A ESTRUTURA PARA AS QUE CRIEI.
    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();

    }

    // CRIAR BANCO DE DADOS.

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlTabelaCombustivel
                = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeDoCombustivel TEXT, " +
                "precoDoCombustivel REAL, " +
                "recomendacao TEXT)";


               db.execSQL(sqlTabelaCombustivel);
    }
    // FAZER ATUALIZAÇÃO NO BANCO DE DADOS
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

   }

    // TODO: AQUI VOCÊ APRENDE A DESENVOLVER BANCO DE DADOS

    // PRECISAMOS CRIAR MÉTODOS PARA CRIAR UM CRUD

    // C = CREATE = Criar o banco de dados e as tabelas
    //     create database nome_do_bd.db (SQL)
    //     create table (SQL)
    // R = Retrieve = recuperar os dados salvos na tabela.
    //     select * from table (SQL)
    // U = Update = Alterar os Dados que já existem no registro.
    //     update from table (SQL)
    // D = Deletar os Dados e Registro da TAbela.
    //     deleta from (SQL)

    // 1 - Criar a Extensão SQLiteOpenHelper e Adicionar seus Métodos.
    // 2 - Nome do Banco de Dados
    // 3 - Versão do Banco de Dados.


}
