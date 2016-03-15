package br.com.timeba.eduardo.desafiomoblee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;



public class Questoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);
        ListView questoes = (ListView) findViewById(R.id.list_view_questoes);

        final AdapterQuestao adapter = new AdapterQuestao(this);
        questoes.setAdapter(adapter);
        String topico=getIntent().getStringExtra("nome");
        Ion.with(this)
                .load("http://api.stackexchange.com/2.2/search/" +
                        "advanced?order=asc&sort=creation&tagged="+topico+"&site=stackoverflow&limit=20")
                .as(new TypeToken<ResultadoAPI>() {})
                .setCallback(new FutureCallback<ResultadoAPI>() {
                    @Override
                    public void onCompleted(Exception e, ResultadoAPI result) {
                        adapter.setItensList(result.items);
                    }
                });
    }
}
