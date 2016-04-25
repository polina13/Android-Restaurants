package epicodus.localrestaurants;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ali on 4/25/16.
 */
public class Restaurant {
    private String mName;
    private String mPhone;
    private String mWebsite;
    private double mRating;
    private String mImgeUrl;
    private double mLatitude;
    private double mLongitude;
    private ArrayList<String> mAddress = new ArrayList<>();
    private ArrayList<String> mCategories = new ArrayList<>();

    public Restaurant(String name, String phone, String website, double rating, String imgeUrl, double latitude, double longitude, ArrayList<String> address, ArrayList<String> categories) {
        mName = name;
        mPhone = phone;
        mWebsite = website;
        mRating = rating;
        mImgeUrl = imgeUrl;
        mLatitude = latitude;
        mLongitude = longitude;
        mAddress = address;
        mCategories = categories;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public double getmRating() {
        return mRating;
    }

    public String getmImgeUrl() {
        return mImgeUrl;
    }

    public double getmLatitude() {
        return mLatitude;
    }

    public double getmLongitude() {
        return mLongitude;
    }

    public ArrayList<String> getmAddress() {
        return mAddress;
    }

    public ArrayList<String> getmCategories() {
        return mCategories;
    }


}
