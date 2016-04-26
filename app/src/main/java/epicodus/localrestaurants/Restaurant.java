package epicodus.localrestaurants;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelProperty;

import java.util.ArrayList;

/**
 * Created by ali on 4/25/16.
 */
@Parcel
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

    @ParcelConstructor
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
    @ParcelProperty("name")
    public String getName() {
        return mName;
    }
    @ParcelProperty("phone")
    public String getPhone() {
        return mPhone;
    }
    @ParcelProperty("website")
    public String getWebsite() {
        return mWebsite;
    }
    @ParcelProperty("rating")
    public double getRating() {
        return mRating;
    }
    @ParcelProperty("imageUrl")
    public String getImageUrl() {
        return mImageUrl;
    }
    @ParcelProperty("latitude")
    public double getLatitude() {
        return mLatitude;
    }
    @ParcelProperty("longitude")
    public double getLongitude() {
        return mLongitude;
    }
    @ParcelProperty("address")
    public ArrayList<String> getAddress() {
        return mAddress;
    }
    @ParcelProperty("categories")
    public ArrayList<String> getCategories() {
        return mCategories;
    }

    public String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }
}
