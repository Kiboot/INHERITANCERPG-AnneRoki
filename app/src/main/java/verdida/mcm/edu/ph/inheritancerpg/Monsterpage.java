package verdida.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Monsterpage extends AppCompatActivity {
    ImageView a,b,c,d,e,f;
    TextView patk,pdef,matk,mdef,hp,mp;
    String mon;
    Spinner spin;
    Button summon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsterpage);

        a=findViewById(R.id.eye);
        b=findViewById(R.id.goblin);
        c=findViewById(R.id.hastur);
        d=findViewById(R.id.imp);
        e=findViewById(R.id.slime);
        f=findViewById(R.id.spawn);
        patk=findViewById(R.id.patk);
        pdef=findViewById(R.id.pdef);
        matk=findViewById(R.id.matk);
        mdef=findViewById(R.id.mdef);
        hp=findViewById(R.id.HP2);
        mp=findViewById(R.id.MP2);
        spin=findViewById(R.id.MOMON);
        summon=findViewById(R.id.button3);

        a.setVisibility(View.VISIBLE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        f.setVisibility(View.GONE);

        ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
               this,R.array.monsters, android.R.layout.simple_dropdown_item_1line);

        spin.setAdapter(sub);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mon=spin.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        summon.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(mon.equals("Goblin")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.VISIBLE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            e.setVisibility(View.GONE);
                            f.setVisibility(View.GONE);
                            Monster1 gob=new Monster1(01,50,0,12,0,4,0,"Goblin");
                            hp.setText(String.valueOf(gob.getBhp()));
                            mp.setText(String.valueOf(gob.getBmp()));
                            patk.setText(String.valueOf(gob.getBpatk()));
                            pdef.setText(String.valueOf(gob.getBpdef()));
                            matk.setText(String.valueOf(gob.getBmatk()));
                            mdef.setText(String.valueOf(gob.getBmdef()));

                        }
                        else if(mon.equals("Hastur")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.VISIBLE);
                            d.setVisibility(View.GONE);
                            e.setVisibility(View.GONE);
                            f.setVisibility(View.GONE);
                            Monster1 gob=new Monster1(01,400,900,4,20,20,50,"Hastur");
                            hp.setText(String.valueOf(gob.getBhp()));
                            mp.setText(String.valueOf(gob.getBmp()));
                            patk.setText(String.valueOf(gob.getBpatk()));
                            pdef.setText(String.valueOf(gob.getBpdef()));
                            matk.setText(String.valueOf(gob.getBmatk()));
                            mdef.setText(String.valueOf(gob.getBmdef()));

                        }
                        else if(mon.equals("Imp")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.VISIBLE);
                            e.setVisibility(View.GONE);
                            f.setVisibility(View.GONE);
                            Monster1 gob=new Monster1(01,60,20,40,5,15,15,"Imp");
                            hp.setText(String.valueOf(gob.getBhp()));
                            mp.setText(String.valueOf(gob.getBmp()));
                            patk.setText(String.valueOf(gob.getBpatk()));
                            pdef.setText(String.valueOf(gob.getBpdef()));
                            matk.setText(String.valueOf(gob.getBmatk()));
                            mdef.setText(String.valueOf(gob.getBmdef()));

                        }
                        else if(mon.equals("Slime")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            e.setVisibility(View.VISIBLE);
                            f.setVisibility(View.GONE);
                            Monster1 gob=new Monster1(01,10,0,3,0,50,10,"Slime");
                            hp.setText(String.valueOf(gob.getBhp()));
                            mp.setText(String.valueOf(gob.getBmp()));
                            patk.setText(String.valueOf(gob.getBpatk()));
                            pdef.setText(String.valueOf(gob.getBpdef()));
                            matk.setText(String.valueOf(gob.getBmatk()));
                            mdef.setText(String.valueOf(gob.getBmdef()));

                        }
                        else if(mon.equals("Spawn")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            e.setVisibility(View.GONE);
                            f.setVisibility(View.VISIBLE);
                            Monster1 gob=new Monster1(01,1000,30,50,25,60,120,"Spawn");
                            hp.setText(String.valueOf(gob.getBhp()));
                            mp.setText(String.valueOf(gob.getBmp()));
                            patk.setText(String.valueOf(gob.getBpatk()));
                            pdef.setText(String.valueOf(gob.getBpdef()));
                            matk.setText(String.valueOf(gob.getBmatk()));
                            mdef.setText(String.valueOf(gob.getBmdef()));

                        }
                    }
                }
        );

    }
}
