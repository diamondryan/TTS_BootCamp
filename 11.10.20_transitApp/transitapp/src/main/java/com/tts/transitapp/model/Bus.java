package com.tts.transitapp.model;

public class Bus {
    public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public double distance;

    public Bus() {
    }

    public Bus(String aDHERENCE, String bLOCKID, String bLOCK_ABBR, String dIRECTION, String lATITUDE, String lONGITUDE,
            String mSGTIME, String rOUTE, String sTOPID, String tIMEPOINT, String tRIPID, String vEHICLE,
            double distance) {
        ADHERENCE = aDHERENCE;
        BLOCKID = bLOCKID;
        BLOCK_ABBR = bLOCK_ABBR;
        DIRECTION = dIRECTION;
        LATITUDE = lATITUDE;
        LONGITUDE = lONGITUDE;
        MSGTIME = mSGTIME;
        ROUTE = rOUTE;
        STOPID = sTOPID;
        TIMEPOINT = tIMEPOINT;
        TRIPID = tRIPID;
        VEHICLE = vEHICLE;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Bus [ADHERENCE=" + ADHERENCE + ", BLOCKID=" + BLOCKID + ", BLOCK_ABBR=" + BLOCK_ABBR + ", DIRECTION="
                + DIRECTION + ", LATITUDE=" + LATITUDE + ", LONGITUDE=" + LONGITUDE + ", MSGTIME=" + MSGTIME
                + ", ROUTE=" + ROUTE + ", STOPID=" + STOPID + ", TIMEPOINT=" + TIMEPOINT + ", TRIPID=" + TRIPID
                + ", VEHICLE=" + VEHICLE + ", distance=" + distance + "]";
    }

    

}


