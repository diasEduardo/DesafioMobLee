package br.com.timeba.eduardo.desafiomoblee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class topicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicos);
        ListView topicos = (ListView) findViewById(R.id.list_view_topicos);
        String[] itens={"Android","iOS","Android Studio","Xcode","Swift"};
        ArrayList<String> arrayList= new ArrayList<String>(Arrays.asList(itens));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.listItem,arrayList);
        topicos.setAdapter(adapter);

    }
}
