package verdida.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button hero;
    Button monster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        hero=findViewById(R.id.Heroes);
        monster=findViewById(R.id.Monster);

        hero.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent hero =new Intent(home.this,Heropage.class);
                        startActivity(hero);
                    }

                }
        );
        monster.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent monster =new Intent(home.this,Monsterpage.class);
                        startActivity(monster);
                    }
                }
        );

    }
}
