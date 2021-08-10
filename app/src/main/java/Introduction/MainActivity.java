package Introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathmadesimple.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToIntroduction2 = findViewById(R.id.buttontoIntroduction2);

        buttonToIntroduction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToStartIntroduction2 = new Intent(getApplicationContext(), Introduction2.class);
                startActivity(intentToStartIntroduction2);
            }
        });

    }
}