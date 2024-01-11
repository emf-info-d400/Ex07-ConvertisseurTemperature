package temperature.ctrl;

import temperature.service.ServiceTemperature;
import temperature.view.View;

/**
 * Classe représentant le contrôleur de l'application MVC
 * "ConvertisseurDeTemperature" de l'exercice "Convertisseur de
 * température MVC" du module D400.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 18.04.2016
 * @version 1.0.0
 */
public class Controller {

    /**
     * Référence au service température de l'application.
     */
    // VOTRE CODE ICI...

    /**
     * Référence à la vue principale de l'application.
     */
    // VOTRE CODE ICI...

    /**
     * La température à convertir actuelle.
     */
    // VOTRE CODE ICI...

    /**
     * Constante qui représente la lettre majuscule utilisée pour l'unité de
     * température Celsius.
     */
    // VOTRE CODE ICI...

    /**
     * Constante qui représente la lettre majuscule utilisée pour l'unité de
     * température Fahrenheits.
     */
    // VOTRE CODE ICI...

    /**
     * Constante qui représente la lettre majuscule utilisée pour l'unité de
     * température Kelvins.
     */
    // VOTRE CODE ICI...

    /**
     * Le constructeur de la classe Controller. Toujours initialiser TOUS les
     * attributs !
     * Pour la température actuelle,
     * l'application doit démarre avec une valeur de 25°C.
     */
    public Controller() {
        // VOTRE CODE ICI...
    }

    /**
     * Méthode de démarrage de l'application MVC. La méthode commence par appeler
     * la méthode viewStart() de la vue afin
     * de la démarrer. Ensuite, elle appelle afficherTemperatureAConvertir() en lui
     * fournissant la température actuelle
     * afin que la vue mette à jour l'affichage. Pour terminer, elle demande au
     * service température de convertir cette température
     * actuelle en fahrenheits à l'aide de sa méthode celsiusEnFahrenheits() et elle
     * affiche cette température convertie
     * à l'aide de la méthode afficherTemperatureConvertie() de la vue.
     */
    public void start() {
        // VOTRE CODE ICI...
    }

    /**
     * Cette méthode est appelée par la vue pour indiquer que l'application est en
     * train de se fermer. Cela permettrait
     * de sauvegarder l'état de l'application, mais ici il n'y a rien à faire.
     */
    public void viewExiting() {
    }

    /**
     * Méthode appelée par la vue pour indiquer que la température a convertir a été
     * modifiée. Il faut mémoriser cette
     * nouvelle température dans l'attribut prévu à cet effet, puis demander à la
     * vue
     * d'afficher cette nouvelle
     * température à l'aide de la méthode afficherTemperatureAConvertir().
     *
     * @param temperature la nouvelle température a convertir
     */
    public void temperatureAConvertirModifiee(int temperature) {
        // VOTRE CODE ICI...
    }

    /**
     * Méthode appelée par la vue pour indiquer que l'utilisateur souhaite convertir
     * la température en Fahrenheits. On
     * commence par transformer la température actuelle en fahrenheits à l'aide de
     * la méthode celsiusEnFahrenheits() de
     * notre service température, puis on va afficher cette température à l'aide de la méthode
     * afficherTemperatureConvertie() de
     * notre vue en utilisant l'unité UNITE_TEMPERATURE_FAHRENHEIT.
     */
    public void convertirCelsiusEnFahrenheits() {
        // VOTRE CODE ICI...
    }

    /**
     * Méthode appelée par la vue pour indiquer que l'utilisateur souhaite convertir
     * la température en Kelvins. On
     * commence par transformer la température actuelle en kelvins à l'aide de la
     * méthode celsiusEnKelvins() de notre
     * service température, puis on va afficher cette température à l'aide de la méthode
     * afficherTemperatureConvertie() de notre vue
     * en utilisant l'unité UNITE_TEMPERATURE_KELVINS.
     */
    public void convertirCelsiusEnKelvins() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de la référence au service température de l'application.
     *
     * @return la référence au Worker de l'application
     */
    public ServiceTemperature getRefServiceTemperature() {
        // VOTRE CODE ICI...
    }

    /**
     * Setter de la référence au service température de l'application.
     *
     * @param refService la référence au worker de l'application
     */
    public void setRefServiceTemperature(ServiceTemperature refService) {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de la référence à la vue de l'application.
     *
     * @return la référence à la vue de l'application
     */
    public View getRefView() {
        // VOTRE CODE ICI...
    }

    /**
     * Setter de la référence à la vue de l'application.
     *
     * @param refView la référence à la vue de l'application
     */
    public void setRefView(View refView) {
        // VOTRE CODE ICI...
    }

}
