package cs4330.cs.utep.courseorganizer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "courseOrganizerDB";
    private static final String SCHOOL_TABLE = "items";

    private static final String KEY_ID = "_id";
    private static final String KEY_INSTRUCTORSNAME = "name";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_CLASSDAY = "classday";
    private static final String KEY_ASSIGNMENTNAME = "assignmentname";
    private static final String KEY_DUEDATE = "duedate";
    private static final String KEY_COURSE = "done";

    public DBhelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
