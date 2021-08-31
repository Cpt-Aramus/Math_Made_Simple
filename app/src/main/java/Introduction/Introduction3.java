package Introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathmadesimple.R;

import MainMenu.MainMenu;

/**
 * This activity represents the last introduction before the Main Menu Screen
 * Leading to MainMenu
 */
public class Introduction3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction3);

        Button buttonToMainMenu = findViewById(R.id.buttonToMainMenu);

        buttonToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToMainMenu = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(intentToMainMenu);
            }
        });
    }
}