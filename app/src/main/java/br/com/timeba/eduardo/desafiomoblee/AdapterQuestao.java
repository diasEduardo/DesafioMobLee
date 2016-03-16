package br.com.timeba.eduardo.desafiomoblee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by EDUARDO on 13/03/2016.
 */
public class AdapterQuestao extends BaseAdapter {

    private List<Questao> questoes = new ArrayList<>();
    private final LayoutInflater inflater;

    public AdapterQuestao(Context context) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setItensList(List<Questao> questoes) {
        this.questoes = questoes;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return questoes.size();
    }

    @Override
    public Object getItem(int position) {
        return questoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.questoes_item, parent, false);
        }

        Questao atual = questoes.get(position);

        ((TextView)convertView.findViewById(R.id.titulo)).setText(atual.title);
        ( (TextView)convertView.findViewById(R.id.nome)).setText(atual.owner.display_name);
        ((TextView)convertView.findViewById(R.id.votos)).setText("Pontuação: " + atual.score);
       /* Bitmap foto;
        URL url =null;
        String desu =atual.owner.profile_image;
        try{
            url= new URL(atual.owner.profile_image);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }

        try
        {
            HttpURLConnection conn= (HttpURLConnection)url.openConnection();
            conn.setDoInput(true);
            conn.connect();
            //int length = conn.getContentLength();
           // int[] bitmapData =new int[length];
           // byte[] bitmapData2 =new byte[length];
           // InputStream is = conn.getInputStream();
           // BitmapFactory.Options options = new BitmapFactory.Options();

          //  bmImg = BitmapFactory.decodeStream(is, null, options);

          //  img.setImageBitmap(bmImg);

            //dialog.dismiss();
        }
        catch(IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
//          Toast.makeText(PhotoRating.this, "Connection Problem. Try Again.", Toast.LENGTH_SHORT).show();
        }


        //((ImageView) convertView.findViewById(R.id.foto));
        */
        return convertView;
    }


}
