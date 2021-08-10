package Introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathmadesimple.R;

public class Introduction2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction2);

        Button buttonToIntroduction3 = findViewById(R.id.buttonToIntroduction3);

        buttonToIntroduction3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToIntroduction3 = new Intent(getApplicationContext(), Introduction3.class);
                startActivity(intentToIntroduction3);
            }
        });

    }
}