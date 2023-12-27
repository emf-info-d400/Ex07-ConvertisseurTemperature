package temperature.service;

import temperature.ctrl.Controller;

/**
 * Classe représentant le service température de l'application MVC
 * "ConvertisseurDeTemperature" de l'exercice "Convertisseur de température MVC"
 * du module D400.
 *
 * @author <a href="mailto:paul.friedli@edufr.ch">Paul Friedli</a>
 * @since 18.04.2016
 * @version 1.0.0
 */
public class ServiceTemperature {

    /**
     * La référence au contrôleur de l'application.
     */

    // VOTRE CODE ICI...

    /**
     * Constructeur de la classe ServiceTemperature. Comme toujours, le travail N°1
     * consiste à initialiser TOUS nos attributs :-).
     */
    public ServiceTemperature() {

        // VOTRE CODE ICI...

    }

    /**
     * Conversion de température de celsius en fahrenheits. La méthode utilise la
     * formule standard "Fahrenheits = ( Celsius * 1.8 ) + 32" pour la conversion,
     * sauf si la température fournie n'est pas une température valable
     * (c'est-à-dire une température impossible petite que -273°C).
     *
     * @param temperature la température en celsius
     * @return la température équivalente exprimée en fahrenheits, ou "N/A" (Not
     *         Allowed) si la température fournie en
     *         celsius n'est pas une température valable
     */
    public String celsiusEnFahrenheits(int temperature) {

        // VOTRE CODE ICI...

    }

    /**
     * Conversion de température de celsius en kelvins. La méthode utilise la
     * formule standard "Kelvins = ( Celsius + 273 )" pour la conversion, sauf si la
     * température fournie n'est pas une température valable (c'est-à-dire une
     * température impossible petite que -273°C).
     *
     * @param temperature la température en celsius
     * @return la température équivalente exprimée en kelvins, ou "N/A" (Not
     *         Allowed) si la température fournie en
     *         celsius n'est pas une température valable
     */
    public String celsiusEnKelvins(int temperature) {

        // VOTRE CODE ICI...

    }

    /**
     * Getter de la référence au contrôleur de l'application.
     *
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl() {

        // VOTRE CODE ICI...

    }

    /**
     * Setter de la référence au contrôleur de l'application.
     *
     * @param ctrl la nouvelle référence au contrôleur de l'application
     */
    public void setRefCtrl(Controller ctrl) {

        // VOTRE CODE ICI...

    }

}
