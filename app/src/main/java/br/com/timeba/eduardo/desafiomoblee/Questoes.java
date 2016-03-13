package br.com.timeba.eduardo.desafiomoblee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static br.com.timeba.eduardo.desafiomoblee.R.id.list_view_questoes;

public class Questoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);
        ListView questoes = (ListView) findViewById(list_view_questoes);

        final AdapterQuestao adapter = new AdapterQuestao(this);
        questoes.setAdapter(adapter);

    }
}
