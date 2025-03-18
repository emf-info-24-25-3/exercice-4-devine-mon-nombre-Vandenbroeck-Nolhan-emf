package ihmsimple.app;

import ihmsimple.ctrl.Controller;
import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;

public class IhmSimple {
    
    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
        public static void main(String[] args) {

            Controller controller = new Controller();
            ServiceDevine service = new ServiceDevine();
            controller.setRefServiceDevine(service);
            View view = new View();
            controller.setRefView(view);
            
            view.setRefCtrl(controller);
            service.setRefCtrl(controller);
            
            controller.start();
        }
    }
