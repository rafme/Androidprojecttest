package com.example.chillern7.beerselection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

//in order to reference objects in your GUI commponents need to import android.wiget.component

import org.w3c.dom.Text;


public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Calls when user clicks the button
    public void onClickFindBeer(View view) {

        //findViewById() - provides the java version of the GUI component (used to get and set properties)
        //It takes the ID of the GUI component as a parameter and returns a View Object
        // (can cast a return value to type of GUI)

        //Get a Reference to the TextView (Get right of view)
        TextView brands = (TextView) findViewById(R.id.brands);

        //Get a Reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //Display the selected item
        brands.setText(beerType);
    }

}
