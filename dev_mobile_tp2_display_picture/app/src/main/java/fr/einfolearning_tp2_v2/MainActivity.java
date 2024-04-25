package fr.einfolearning_tp2_v2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Auteur : B. LEMAIRE
 * Reproduction interdite
 * Version 2023
 */

/**
 * Affichage d'une image dans un cadre en utilisant les intentions implicites
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonDisplayPicture = (Button) this.findViewById(R.id.bt_display_picture);
        buttonDisplayPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // A compléter

            }
        });
    }


    /**
     * get uri to drawable or any other resource type if u wish
     * @param context - context
     * @param drawableId - drawable res id
     * @return - uri
     */
    public static final Uri getUriToDrawable(Context context,
                                             int drawableId) {
        Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + context.getResources().getResourcePackageName(drawableId)
                + '/' + context.getResources().getResourceTypeName(drawableId)
                + '/' + context.getResources().getResourceEntryName(drawableId) );
        return imageUri;
    }

}
