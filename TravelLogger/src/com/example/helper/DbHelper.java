package com.example.helper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.model.TripData;

public class DbHelper extends SQLiteOpenHelper {

	// Logcat tag
	//private static final String LOG = DbHelper.class.getName();

	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "travellogger";

	// Table Names
	//private static final String TABLE_TRIP_DATA = "trip_data";	
	
	private String create_table_tripdata = TripData.getCreateTableTripdata();

	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		System.out.println("DbHelper Constructor");
	}
	
	

	@Override
	public void onCreate(SQLiteDatabase db) {
		System.out.println("Creating Database "+create_table_tripdata);
		db.execSQL(create_table_tripdata);
		//Log.e(LOG, "DB Created");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		 db.execSQL("DROP TABLE IF EXISTS " + TripData.getTableTripData());
		 onCreate(db);
		 //Log.e(LOG, "DB Upgraded");
	}
	
	 // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
        //Log.e(LOG, "DB Connection Closed");
    }
 
    /**
     * get datetime
     * */
    private String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }

}
