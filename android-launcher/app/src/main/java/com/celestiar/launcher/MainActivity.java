package com.celestiar.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.*;
import org.json.*;
import java.io.*;
import java.net.*;

public class MainActivity extends Activity {
    LinearLayout list; TextView status;
    public void onCreate(Bundle b){super.onCreate(b); build(); load();}
    void build(){
        LinearLayout root=new LinearLayout(this); root.setOrientation(LinearLayout.VERTICAL); root.setPadding(28,28,28,28); root.setBackgroundColor(Color.rgb(16,19,26));
        TextView title=new TextView(this); title.setText("🇧🇷 Brasilia Craft\nMinecraft Java Edition"); title.setTextColor(Color.WHITE); title.setTextSize(24); title.setPadding(0,0,0,24); root.addView(title);
        status=new TextView(this); status.setText("Carregando versões oficiais..."); status.setTextColor(Color.LTGRAY); root.addView(status);
        list=new LinearLayout(this); list.setOrientation(LinearLayout.VERTICAL); ScrollView scroll=new ScrollView(this); scroll.addView(list); root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));
        setContentView(root);
    }
    void load(){new Thread(()->{try{URL u=new URL("https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"); HttpURLConnection c=(HttpURLConnection)u.openConnection(); c.setConnectTimeout(15000); BufferedReader r=new BufferedReader(new InputStreamReader(c.getInputStream())); StringBuilder s=new StringBuilder(); String x; while((x=r.readLine())!=null)s.append(x); JSONArray a=new JSONObject(s.toString()).getJSONArray("versions"); runOnUiThread(()->{status.setText(a.length()+" versões encontradas"); for(int i=0;i<a.length();i++){try{JSONObject v=a.getJSONObject(i); Button z=new Button(this); z.setText(v.getString("id")+"  •  "+v.getString("type")); z.setOnClickListener(q->status.setText("Selecionado: "+z.getText())); list.addView(z);}catch(Exception e){}}});}catch(Exception e){runOnUiThread(()->status.setText("Erro: "+e.getMessage()));}}).start();}
}
