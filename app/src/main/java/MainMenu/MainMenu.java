package MainMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.mathmadesimple.R;

public class MainMenu extends AppCompatActivity {

    GridView gridViewMainMenu;

    String[] itemsMainMenu = {"Geomotry", "Simple Math Operations", "Graphs", "Functions"};

    int[] pictureItemsMainMenuIDs = {R.drawable.logo_geometry, R.drawable.logo_simple_math_operations,R.drawable.logo_graphs, R.drawable.logo_functions};

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


            }
        });
    }


}