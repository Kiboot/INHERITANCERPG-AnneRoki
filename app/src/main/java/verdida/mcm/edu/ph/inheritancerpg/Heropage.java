package verdida.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Heropage extends AppCompatActivity {
    Spinner klass;
    String cls;
    Button select;
    Button next;
    TextView str, intt, agi, vit, patk, matk, pdef, mdef, hp, mp;
    ImageView ccss, a, b, c, d, e;
    double lvln;
    EditText lvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heropage);

        next = findViewById(R.id.button2);
        str = findViewById(R.id.str);
        agi = findViewById(R.id.agi);
        intt = findViewById(R.id.intt);
        vit = findViewById(R.id.vit);
        patk = findViewById(R.id.patk);
        matk = findViewById(R.id.matk);
        pdef = findViewById(R.id.pdef);
        mdef = findViewById(R.id.mdef);
        klass = findViewById(R.id.Class);
        lvl = findViewById(R.id.lvl);
        ccss = findViewById(R.id.ccss);
        hp = findViewById(R.id.HP);
        mp = findViewById(R.id.MP);
        a = findViewById(R.id.mage);
        b = findViewById(R.id.mprod);
        c = findViewById(R.id.cultist);
        d = findViewById(R.id.marine);
        e = findViewById(R.id.mechanic);
        ccss.setVisibility(View.VISIBLE);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        next.setVisibility(View.GONE);
        ArrayAdapter<CharSequence> cLass = ArrayAdapter.createFromResource(
                this, R.array.Class, android.R.layout.simple_dropdown_item_1line);
        klass.setAdapter(cLass);


        klass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                cls = klass.getSelectedItem().toString();
                next.setVisibility(View.VISIBLE);
                if(cls.equals("Mage")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    Mage mg=new Mage(01,30,30,5,5,10,10);
                    Mage mg1= new Mage("Mage",2,2,2,2,1,2,3,2,2);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    mg1.setLvl(lvln);
                    hp.setText(String.valueOf(mg1.hpinc()));
                    mp.setText(String.valueOf(mg1.mpinc()));
                    str.setText(String.valueOf(mg1.strinc()));
                    agi.setText(String.valueOf(mg1.agiinc()));
                    intt.setText(String.valueOf(mg1.agiinc()));
                    vit.setText(String.valueOf((mg1.vitinc())));
                    matk.setText(String.valueOf(mg1.matkinc()));
                    mdef.setText(String.valueOf(mg1.mdefinc()));
                    patk.setText(String.valueOf(mg.getBpatk()+(mg1.getLvl()*.5)));
                    pdef.setText(String.valueOf(mg.getBpdef()+(mg1.getLvl()*.5)));
                }
                else if(cls.equals("MProd")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.VISIBLE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    MProd a =new MProd(01,30,30,5,5,10,10);
                    MProd b=new MProd("MProd",2,2,2,2,1,3,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    intt.setText(String.valueOf(b.agiinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    patk.setText(String.valueOf(b.patkinc()));
                    pdef.setText(String.valueOf(b.pdefinc()));
                    matk.setText(String.valueOf(a.getBmatk()+(b.getLvl()*.5)));
                    mdef.setText(String.valueOf(a.getBmdef()+(b.getLvl()*.5)));
                }
                else if(cls.equals("Cultist")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    Cultist a =new Cultist(01,30,30,5,5,10,10);
                    Cultist b=new Cultist("Cultist",2,2,2,2,1,2,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    intt.setText(String.valueOf(b.agiinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    matk.setText(String.valueOf(b.matkinc()));
                    mdef.setText(String.valueOf(b.mdefinc()));
                    patk.setText(String.valueOf(b.getBpatk()+(b.getLvl()*.5)));
                    pdef.setText(String.valueOf(b.getBpdef()+(b.getLvl()*.5)));
                }
                else if(cls.equals("Marine")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.VISIBLE);
                    e.setVisibility(View.GONE);
                    Marine a =new Marine(01,30,30,5,5,10,10);
                    Marine b=new Marine("Marine",2,2,2,2,1,3,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    intt.setText(String.valueOf(b.agiinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    patk.setText(String.valueOf(b.patkinc()));
                    pdef.setText(String.valueOf(b.pdefinc()));
                    matk.setText(String.valueOf(a.getBmatk()+(b.getLvl()*.5)));
                    mdef.setText(String.valueOf(a.getBmdef()+(b.getLvl()*.5)));
                }
                else if(cls.equals("Mechanic")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.VISIBLE);
                    Mechanic a =new Mechanic(01,30,30,5,5,10,10);
                    Mechanic b=new Mechanic("Marine",2,2,2,2,1,3,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    intt.setText(String.valueOf(b.agiinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    patk.setText(String.valueOf(b.patkinc()));
                    pdef.setText(String.valueOf(b.pdefinc()));
                    matk.setText(String.valueOf(a.getBmatk()+(b.getLvl()*.5)));
                    mdef.setText(String.valueOf(a.getBmdef()+(b.getLvl()*.5)));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    Intent go =new Intent(Heropage.this,Finalheropage.class);
                    go.putExtra("klass",cls);
                    startActivity(go);
                    }


                });
    }
}
