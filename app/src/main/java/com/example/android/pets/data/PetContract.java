package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by aji on 19/07/17.
 */

public final class PetContract {


    public PetContract(){}

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_PETS = "pets";


    public static final class PetEntry implements BaseColumns{

        /*
           TABLE PETS
         */
        public final static String TABLE_NAME = "pets";

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /*
        COLUMN _ID TABLE PETS
        Type : integer
         */
        public final static String _ID = BaseColumns._ID;

        /*
        COLUMN NAME TABLE PETS
        Type : text
         */
        public final static String COLUMN_PET_NAME = "name";

        /*
        COLUM BREED TABLE PETS
        Type : text
         */
        public final static String COLUMN_PET_BREED = "breed";

        /*
        COLUMN GENDER
        Type : integer
         */
        public final static String COLUMN_PETS_GENDER = "gender";

        /*
        COLUMN Weight
        Type : integer
         */
        public final static String COLUMN_PETS_WEIGHT = "weight";

        //gender
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;

    }

}
