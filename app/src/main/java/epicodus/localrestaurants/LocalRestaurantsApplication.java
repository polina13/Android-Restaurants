package epicodus.localrestaurants;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ali on 5/2/16.
 */
public class LocalRestaurantsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
