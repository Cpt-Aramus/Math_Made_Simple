package MainMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.mathmadesimple.R;

public class MainMenu extends AppCompatActivity {

    GridView gridViewMainMenu;

    String[] itemsMainMenu = {"Geomotry", "Simple Math Operations", "Graphs", "Functions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        gridViewMainMenu = findViewById(R.id.grid_view_main_menu);

    }


}