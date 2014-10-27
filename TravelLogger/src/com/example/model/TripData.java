package com.example.model;

import java.util.Date;

public class TripData {
	private int id;
	private String tripName;
	private String locations;
	private Date startDate;
	private Date endDate;
	private String fellows;
	private String comments;

	// TripData Table - column nmaes
	private static final String COLTRIPNAME = "tripname";
	private static final String COLLOCATIONS = "locations";
	private static final String COLSTARTDATE = "startdate";
	private static final String COLENDDATE = "enddate";
	private static final String COLFELLOWS = "fellows";
	private static final String COLCOMMENTS = "comments";
	private static final String COLKEY_ID = "id";
	private static final String COLKEY_CREATED_AT = "created_at";
	private static final String TABLE_TRIP_DATA = "trip_data";

	private static final String CREATE_TABLE_TRIPDATA = "CREATE TABLE "
			+ TABLE_TRIP_DATA + "(" + COLKEY_ID + " INTEGER PRIMARY KEY, "
			+ COLTRIPNAME + " TEXT, " + COLLOCATIONS + " TEXT, " + COLSTARTDATE
			+ " DATETIME, " + COLENDDATE + " DATETIME, " + COLFELLOWS + " TEXT, "
			+ COLCOMMENTS + " TEXT, " + COLKEY_CREATED_AT + " DATETIME" + ")";

	public static String getColtripname() {
		return COLTRIPNAME;
	}

	public static String getCollocations() {
		return COLLOCATIONS;
	}

	public static String getColstartdate() {
		return COLSTARTDATE;
	}

	public static String getColenddate() {
		return COLENDDATE;
	}

	public static String getColfellows() {
		return COLFELLOWS;
	}

	public static String getColcomments() {
		return COLCOMMENTS;
	}

	public static String getColkeyId() {
		return COLKEY_ID;
	}

	public static String getColkeyCreatedAt() {
		return COLKEY_CREATED_AT;
	}

	public static String getTableTripData() {
		return TABLE_TRIP_DATA;
	}

	public static String getCreateTableTripdata() {
		return CREATE_TABLE_TRIPDATA;
	}

	public TripData() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFellows() {
		return fellows;
	}

	public void setFellows(String fellows) {
		this.fellows = fellows;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
