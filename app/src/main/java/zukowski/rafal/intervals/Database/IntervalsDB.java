package zukowski.rafal.intervals.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.HashSet;

import zukowski.rafal.intervals.Helpers.Helper;

/**
 * Created by U0145084 on 2016-04-02.
 */
public class IntervalsDB extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "intervals.db";
    private static final int DATABASE_VERSION = 1;

    public IntervalsDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public int StartNewSession(){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("Created", Helper.getDateTime());
        long id = db.insert("UserSession", null, values);
        return (int)id;
    }

    public ArrayList<Category> GetCategories(){
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "Select Id, Description, PathToSound FROM Category";

        Cursor cursor = db.rawQuery(query,null);

        ArrayList<Category> ansList = new ArrayList<Category>();

        if(cursor.moveToFirst()){
            do{
                Category answer = new Category(Integer.parseInt(cursor.getString( cursor.getColumnIndex("Id") )),cursor.getString( cursor.getColumnIndex("Description")),cursor.getString(cursor.getColumnIndex("PathToSound")));
                ansList.add(answer);
            }
            while(cursor.moveToNext());
        }
        return ansList;
    }

    public int StartNewSeries(int repeats,int userSessionId){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("Repeats",repeats);
        values.put("UserSessionId",userSessionId);
        long id = db.insert("UserSession", null, values);
        return (int)id;

    }

    public void CreateNewCategory(String description, String pathToSound){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("Description",description);
        values.put("PathToSound",pathToSound);
        db.insert("Category", null, values);
    }

    public void CreateNewSeriesPart(int seconds,int categoryId,int seriesId){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("Seconds",seconds);
        values.put("CategoryId",categoryId);
        values.put("SeriesId",seriesId);
        db.insert("SeriesPart", null, values);
    }

    public HashSet<SeriesPart> GetSeriesPart(int seriesId){
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "Select Id, Seconds,CategoryId,SeriesId FROM SeriesPart";

        Cursor cursor = db.rawQuery(query,null);

        HashSet<SeriesPart> ansList = new HashSet<SeriesPart>();

        if(cursor.moveToFirst()){
            do{
                SeriesPart answer = new SeriesPart(Integer.parseInt(cursor.getString( cursor.getColumnIndex("Id") )),Integer.parseInt(cursor.getString(cursor.getColumnIndex("Seconds"))), Integer.parseInt(cursor.getString(cursor.getColumnIndex("CategoryId"))), Integer.parseInt(cursor.getString(cursor.getColumnIndex("SeriesId"))));
                ansList.add(answer);
            }
            while(cursor.moveToNext());
        }
        return ansList;
    }





}
