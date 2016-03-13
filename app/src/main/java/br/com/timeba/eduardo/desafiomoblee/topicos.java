package br.com.timeba.eduardo.desafiomoblee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Topicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicos);
        ListView topicos = (ListView) findViewById(R.id.list_view_topicos);
        String[] itens={"Android","iOS","Android Studio","Xcode","Swift"};
        ArrayList<String> arrayList= new ArrayList<String>(Arrays.asList(itens));
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.listItem,arrayList);
        topicos.setAdapter(adapter);

        topicos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String nome = adapter.getItem(position).toLowerCase().replace(" ","-");
                Intent i =new Intent(Topicos.this,Questoes.class);
                i.putExtra("nome",nome);
                startActivity(i);
            }
        });
    }
}
