package MainMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.mathmadesimple.R;

import SimpleMathOperations.SimpleMathOperationsMain;

/**
 * This class represents the Main Menu and comes after the Introduction.
 * This activity displays the various topics of the Math-Made-Simple App.
 * With a click on either button you switch into the respective topic overview (= switching to the package with the topic name)
 */
public class MainMenu extends AppCompatActivity {

    GridView gridViewMainMenu;

    String[] itemsMainMenu = {"Geomotry", "Simple Math Operations", "Graphs", "Functions", "Fractions", "Percents", "Exercise", "Test"};

    int[] pictureItemsMainMenuIDs = {R.drawable.logo_geometry, R.drawable.logo_simple_math_operations,R.drawable.logo_graphs, R.drawable.logo_functions, R.drawable.logo_fractions, R.drawable.logo_percents, R.drawable.logo_exercise, R.drawable.logo_test};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        gridViewMainMenu = findViewById(R.id.grid_view_main_menu);

        MainMenuAdapter mainMenuAdapter = new MainMenuAdapter (MainMenu.this, itemsMainMenu, pictureItemsMainMenuIDs);
        gridViewMainMenu.setAdapter(mainMenuAdapter);

        gridViewMainMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "You clicked " + itemsMainMenu[i], Toast.LENGTH_SHORT).show();

                switch (itemsMainMenu[i]) {
                    case "Simple Math Operations":
                        Intent intentToSimpleMathOperationsMain = new Intent(getApplicationContext(), SimpleMathOperationsMain.class);
                        startActivity(intentToSimpleMathOperationsMain);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "You called an Item that was not available in the list", Toast.LENGTH_LONG).show();
                        break;
                }


            }
        });
    }


}