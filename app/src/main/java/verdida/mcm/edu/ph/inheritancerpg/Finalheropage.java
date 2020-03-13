package verdida.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.logging.SocketHandler;

public class Finalheropage extends AppCompatActivity {
    private String klass,cls;
    private ImageView a,b,c,d,e,f,g,h,i,j,k;
    private Spinner spin;
    private Button select;
    private TextView str,intt,agi,vit,patk,matk,pdef,mdef,hp,mp;
    double lvln;
    EditText lvl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalheropage);
        klass=getIntent().getStringExtra("klass");
        a=findViewById(R.id.ccss);
        b=findViewById(R.id.suncorp);
        c=findViewById(R.id.shadowcorp);
        d=findViewById(R.id.igor);
        e=findViewById(R.id.valkyrie);
        f=findViewById(R.id.warlock);
        g=findViewById(R.id.paladin);
        h=findViewById(R.id.marauder);
        i=findViewById(R.id.marksman);
        j=findViewById(R.id.highlander);
        k=findViewById(R.id.frank);
        spin=findViewById(R.id.Class);
        hp=findViewById(R.id.HP);
        mp=findViewById(R.id.MP);
        lvl=findViewById(R.id.lvl);
        select=findViewById(R.id.button);
        str=findViewById(R.id.str);
        agi=findViewById(R.id.agi);
        intt=findViewById(R.id.intt);
        vit=findViewById(R.id.vit);
        patk=findViewById(R.id.patk);
        matk=findViewById(R.id.matk);
        pdef=findViewById(R.id.pdef);
        mdef=findViewById(R.id.mdef);


        a.setVisibility(View.VISIBLE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        f.setVisibility(View.GONE);
        g.setVisibility(View.GONE);
        h.setVisibility(View.GONE);
        i.setVisibility(View.GONE);
        j.setVisibility(View.GONE);
        k.setVisibility(View.GONE);
        if(klass.equals("Mage")){
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this,R.array.Mage, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    cls=spin.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            select.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(cls.equals("Suncorp")){
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.VISIBLE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Suncorp mg=new Suncorp(01,30,30,5,5,10,10);
                                Suncorp mg1= new Suncorp("Suncorp",2,2,2,2,1,2,3,2,2);
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

                            else{
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.VISIBLE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Shadowcorp mg=new Shadowcorp(01,30,30,5,5,10,10);
                                Shadowcorp mg1= new Shadowcorp("Shadowcorp",2,2,2,2,1,2,3,3,2);
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
                                patk.setText(String.valueOf(mg.patkinc()));
                                pdef.setText(String.valueOf(mg.getBpdef()+(mg1.getLvl()*.5)));


                            }

                        }
                    }
            );
        }
        else if(klass.equals("MProd")){
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this,R.array.Mprod, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    cls=spin.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            select.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(cls.equals("Igor")){
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.VISIBLE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Igor mg=new Igor(01,30,30,5,5,10,10);
                                Igor mg1= new Igor("Igor",2,2,2,2,1,3,2,2,2);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));
                            }

                            else{
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.VISIBLE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Valkyrie mg=new Valkyrie(01,30,30,5,5,10,10);
                                Valkyrie mg1= new Valkyrie("Valkyrie",2,2,2,2,1,2,2,3,2);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));


                            }

                        }
                    }
            );
        }
        else if(klass.equals("Cultist")){
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this,R.array.Cultist, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    cls=spin.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            select.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(cls.equals("Warlock")){
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.VISIBLE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Warlock mg=new Warlock(01,30,50,5,5,10,10);
                                Warlock mg1= new Warlock("Warlock",2,2,2,2,1,2,4,3,2);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));
                            }

                            else{
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.VISIBLE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Paladin mg=new Paladin(01,30,30,5,5,10,10);
                                Paladin mg1= new Paladin("Paladin",2,2,2,2,1,4,2,4,2);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));


                            }

                        }
                    }
            );
        }
        else if(klass.equals("Marine")){
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this,R.array.Marine, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    cls=spin.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            select.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(cls.equals("Marauder")){
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.VISIBLE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Marauder mg=new Marauder(01,30,50,5,5,10,10);
                                Marauder mg1= new Marauder("Marauder",2,2,2,2,1,4,2,3,2);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));
                            }

                            else{
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.VISIBLE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.GONE);
                                Paladin mg=new Paladin(01,30,30,5,5,10,10);
                                Paladin mg1= new Paladin("Marksman",2,2,2,2,1,2,2,4,1);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));


                            }

                        }
                    }
            );
        }
        else if(klass.equals("Mechanic")){
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this,R.array.Mechanic, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    cls=spin.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            select.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(cls.equals("Highlander")){
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.VISIBLE);
                                k.setVisibility(View.GONE);
                                Highlander mg=new Highlander(01,30,50,5,5,10,10);
                                Highlander mg1= new Highlander("Highlander",2,2,2,2,1,1.5,3,2,5);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));
                            }

                            else{
                                a.setVisibility(View.GONE);
                                b.setVisibility(View.GONE);
                                c.setVisibility(View.GONE);
                                d.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                f.setVisibility(View.GONE);
                                g.setVisibility(View.GONE);
                                h.setVisibility(View.GONE);
                                i.setVisibility(View.GONE);
                                j.setVisibility(View.GONE);
                                k.setVisibility(View.VISIBLE);
                                Frank mg=new Frank(01,30,30,5,5,10,10);
                                Frank mg1= new Frank("Frank",2,2,2,2,1,2,2,4,5);
                                lvln=Double.parseDouble(lvl.getText().toString());
                                mg1.setLvl(lvln);
                                hp.setText(String.valueOf(mg1.hpinc()));
                                mp.setText(String.valueOf(mg1.mpinc()));
                                str.setText(String.valueOf(mg1.strinc()));
                                agi.setText(String.valueOf(mg1.agiinc()));
                                intt.setText(String.valueOf(mg1.agiinc()));
                                vit.setText(String.valueOf((mg1.vitinc())));
                                patk.setText(String.valueOf(mg1.patkinc()));
                                pdef.setText(String.valueOf(mg1.pdefinc()));
                                matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                                mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));


                            }

                        }
                    }
            );
        }

        }





    }

