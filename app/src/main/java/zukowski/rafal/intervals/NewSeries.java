package zukowski.rafal.intervals;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import zukowski.rafal.intervals.Database.Category;
import zukowski.rafal.intervals.Database.IntervalsDB;

public class NewSeries extends AppCompatActivity {


    private int TextViewLastId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_series);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void NewSeriesPart(View view) {

        View p = (View) view.getRootView();
        GridLayout gridLay = (GridLayout) p.findViewById(R.id.SeriesPart_GridLayout);
        RelativeLayout relLayout = (RelativeLayout)p.findViewById(R.id.relative_layout_newSeries);

        ArrayList<Category> categories = Start.db.GetCategories();

        //create text view
        //
        /*TextView textView = new TextView(getApplicationContext());
        textView.setId(TextViewLastId);
        textView.setText("Categories");
        gridLay.addView(textView);
        //relLayout.addView(textView);


        int id = textView.getId();
        View testView = relLayout.findViewById(TextViewLastId);
        */


        Spinner spinner = new Spinner(this);
        spinner.setPrompt("Categories");
        ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,R.layout.categories_text_view, categories);
        spinner.setAdapter(spinnerArrayAdapter);

        gridLay.addView(spinner);

        RelativeLayout.LayoutParams mRparams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        EditText editText = new EditText(this);
        editText.setHint(R.string.new_category_seconds);
        editText.setLayoutParams(mRparams);
        gridLay.addView(editText);

        //setContentView(relLayout);


    }


    public void SaveNewSeries(View view){
        GridLayout gridLay = (GridLayout) view.findViewById(R.id.SeriesPart_GridLayout);

    }

}