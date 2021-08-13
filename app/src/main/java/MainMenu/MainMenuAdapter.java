package MainMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mathmadesimple.R;

public class MainMenuAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutinflaterMainMenu;
    private String[] itemsMainMenu;
    private int[] pictureItemsMainMenuIDs;

    public MainMenuAdapter (Context contextMainMenu, String[] itemsMainMenu, int [] pictureItemsMainMenuIDs) {

        context = contextMainMenu;
        this.itemsMainMenu = itemsMainMenu;
        this.pictureItemsMainMenuIDs = pictureItemsMainMenuIDs;
    }
    @Override
    public int getCount() {
        return itemsMainMenu.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if (layoutinflaterMainMenu == null) {
            layoutinflaterMainMenu = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = layoutinflaterMainMenu.inflate(R.layout.grid_menu_item, null);
        }

        ImageView logoMainMenu = convertView.findViewById(R.id.logo_main_menu);
        TextView logoTextMainMenu = convertView.findViewById(R.id.main_menu_text);

        logoMainMenu.setImageResource(pictureItemsMainMenuIDs[position]);
        logoTextMainMenu.setText(itemsMainMenu[position]);



        return convertView;
    }
}
