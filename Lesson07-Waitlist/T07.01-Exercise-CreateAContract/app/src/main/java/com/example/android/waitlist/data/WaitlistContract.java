package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {



    // COMPLETED (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    public static final class WaitlistEntry implements  BaseColumns{

        // COMPLETED (2) Inside create a static final members for the table name and each of the db columns
        public static final String TABLE_NAME = "waitlist";
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        public static final String COLUMN_GGUEST_NAME = "guestName";
        // COLUMN_PARTY_SIZE -> partySize
        public static final String COLUMN_GPARTY_SIZE = "partySize";
        // COLUMN_TIMESTAMP -> timestamp
        public static final String COLUMN_GTIMESTAMP= "timestamp";

    }
}
