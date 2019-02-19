package exo.java.tree;

public class TestBus {

    public static void TestBus(String [] args){

        Bus bus = new Bus(116,  "Nogent-Sur-Marne", "Val de Fontenay Rer", 80, 50,
                4, 3);

        /**======== Advanced ==========**/
        bus.travel();

        /**======== Add Tavelers ==========**/
        bus.addTravelers(3);

        /**======== Remove Travelers ==========**/
        bus.removeTravlers(50);

        /**======== Name Of Stop ==========**/
        bus.addNameOfStop("Fontenay sous Bois");
        bus.addNameOfStop("Le bois cadet");
        bus.addNameOfStop("Jean Joreese");
        bus.addNameOfStop("Le trou noire");


    }
}
