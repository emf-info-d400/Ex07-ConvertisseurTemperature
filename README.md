# Exercice 07 : Convertisseur de température
## Durée : 120'
## Objectifs visés :
Comprendre MVC ; Maitriser les diagrammes de séquence ; Maitriser les diagrammes de classes ; Se référer à la Javadoc.

## Travail à réaliser
Lisez avec attention les informations fournies ci-après sous diverses formes (diagramme de classe, javadoc, diagrammes de séquence, …) car vous y trouverez toutes les informations utiles afin de finaliser le projet Java « **ConvertisseurTemperature** ».

## Résultat à obtenir
Si votre code est correctement implémenté selon les directives reçues, vous devriez obtenir une application fonctionnelle ressemblant à cela :  

![interface](images/interface_final.png)

### Diagramme de classes

```mermaid 
classDiagram

class Application {
    main(String[] args) void$    
}

class ServiceTemperature {
    -Controller refController
    +ServiceTemperature()
    +celsiusEnFahrenheits(int celsius) String
    +celsiusEnKelvins(int celsius) String
    +getRefCtrl() Controller
    +setRefCtrl(Controller ctrl) void
}

class Controller {
    +UNITE_TEMPERATURE_CELSIUS String$
    +UNITE_TEMPERATURE_FAHRENHEIT String$
    +UNITE_TEMPERATURE_KELVIN String$
    -int temperatureActuelle
    -View refView
    -ServiceTemperature refService
    +Controller()
    +start() void
    +viewExiting() void
    +temperatureAConvertirModifiee(int temp) void
    +convertirCelsiusEnFahrenheits() void
    +convertirCelsiusEnKelvins() void
    +getRefView() View
    +getRefServiceTemperature() ServiceTemperature
    +setRefView(View view) void
    +setRefServiceTemperature(ServiceTemperature service) void
}

class View {
    -Controller refController
    +View()
    -viewExiting() void
    -initComponents() void
    +viewStart() void
    +afficherTemperatureAConvertir(int temp) void
    +afficherTemperatureConvertie(String, String) void
    +messageErreur(String message) void
    +messageInformation(String message) void
    +messageQuestion(String message) void
    +setRefCtrl(Controller ctrl)
 }

ServiceTemperature o--> "1" Controller : -refController
Controller o--> "1" ServiceTemperature : -refService
Controller o--> "1" View : -refView
View o--> "1" Controller : -refController

```
### Structure des packages Java
Voici la structure des packages pour chaque classe du projet
```mermaid
classDiagram
namespace app {
    class Application
}
namespace ctrl {
    class Controller
}
namespace service {
    class ServiceTemperature
}
namespace view {
    class View
}
```
### Diagramme de séquence
Voici le diagramme de séquence de la méthode de la méthode `main()` de la classe `Application` du package `app` :
```mermaid
sequenceDiagram
    participant app.Application.main()
    create participant refCtrl
    app.Application.main()->>refCtrl: new Controller()
    create participant refServiceTemperature
    app.Application.main()->>refServiceTemperature: new ServiceTemperature()
    app.Application.main()->>refCtrl: setRefServiceTemperature(refServiceTemperature)
    create participant refView
    app.Application.main()->>refView: new View()
    app.Application.main()->>refCtrl: setRefView(refView)
    app.Application.main()->>refView: setRefCtrl(refCtrl)
    app.Application.main()->>refServiceTemperature: setRefCtrl(refctrl)
    app.Application.main()->>refCtrl: start()
```
### Javadoc
La Javadoc se trouve directement dans les classes Java. Il ne vous reste plus qu'à remplacer les commentaires `// VOTRE CODE ICI...`
