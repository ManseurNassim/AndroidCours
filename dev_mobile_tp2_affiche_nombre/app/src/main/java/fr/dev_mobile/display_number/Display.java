package fr.dev_mobile.display_number;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import fr.m4104.display_number.R;

/**
 * @author B. LEMAIRE
 * Activité pour l'affichage d'un nombre entier
 */
public class Display extends Activity {

    // Pour l'affichage du nombre
    private TextView tv_display_number;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.display);

        // A compléter

        /**
         * Désérialisation des ressources
         */

        this.deserialiserRessources();




        /**
         * Récupération de l'Intent qui a servi à lancer
         * cette activité
         */

        // A compléter



        /**
         * Récupération des extras
         */

        // A compléter



        /**
         * Affichage du nombre
         */

        // A compléter

    }


    /**
     * Désérialise les ressources
     * Permet d'intancier les instances à partir des ressources
     * XML des composants graphiques (widgets)
     */
    private void deserialiserRessources() {
        this.tv_display_number = (TextView) this.findViewById(R.id.tv_display);
    }

}
