package epicodus.localrestaurants;

import java.util.ArrayList;

/**
 * Created by ali on 4/25/16.
 */
public class Restaurant {
    private String mName;
    private String mPhone;
    private String mWebsite;
    private double mRating;
    private String mImageUrl;
    private double mLatitude;
    private double mLongitude;
    private ArrayList<String> mAddress = new ArrayList<>();
    private ArrayList<String> mCategories = new ArrayList<>();

    public Restaurant(String name, String phone, String website, double rating, String imageUrl, double latitude, double longitude, ArrayList<String> address, ArrayList<String> categories) {
        mName = name;
        mPhone = phone;
    mWebsite = website;
    mRating = rating;
    mImageUrl = getLargeImageUrl(imageUrl);;
    mLatitude = latitude;
    mLongitude = longitude;
    mAddress = address;
    mCategories = categories;
}

    public String getName() {
        return mName;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public double getRating() {
        return mRating;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public ArrayList<String> getAddress() {
        return mAddress;
    }

    public ArrayList<String> getCategories() {
        return mCategories;
    }

    public String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }
}
