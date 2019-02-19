package exo.java.tree;

import java.util.ArrayList;

public class Bus {

    private int number;
    private String departure;
    private String destination;
    private int capacity;
    private int numberOfTravelers;
    private int numberOfStop;
    private int currentNumberOfStop;
    private ArrayList<String> nameOfStop;

    public Bus(int number, String departure, String destination, int capacity, int numberOfTravelers, int numberOfStop, int currentNumberOfStop) {
        this.number = number;
        this.departure = departure;
        this.destination = destination;
        this.capacity = capacity;
        this.numberOfTravelers = numberOfTravelers;
        this.numberOfStop = numberOfStop;
        this.currentNumberOfStop = currentNumberOfStop;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfTravelers() {
        return numberOfTravelers;
    }

    public int getNumberOfStop() {
        return numberOfStop;
    }

    public void setNumberOfStop(int numberOfStop) {
        this.numberOfStop = numberOfStop;
    }

    public int getCurrentNumberOfStop() {
        return currentNumberOfStop;
    }

    public void setCurrentNumberOfStop(int currentNumberOfStop) {
        this.currentNumberOfStop = currentNumberOfStop;
    }

    public void addTravelers(int nbTravelers){

        if((numberOfTravelers + nbTravelers) < capacity){

            numberOfTravelers = numberOfTravelers + nbTravelers ;
        }else{

            System.out.println("The bus will not be able to take passengers. Because the passenger limit has been reached...");
        }
    }

    public void removeTravlers(int nbTravelers){

        if((numberOfTravelers - nbTravelers)  < 0){

            System.out.println("The bus does not contain as many passengers as you wish to delete");
        }
        else{
            numberOfTravelers = numberOfTravelers - nbTravelers;
        }
    }

    public void travel(){

        if(numberOfStop != currentNumberOfStop){
            currentNumberOfStop = currentNumberOfStop + 1;
        }
        else{
            System.out.println("The bus has arrived at destination");
        }
    }

    public void addNameOfStop(String nameOfStop){

        if(this.nameOfStop.size() > this.numberOfStop){

            System.out.println("The stop name number exceeds the exact stop number");
        }
        this.nameOfStop.add(nameOfStop);

    }

    public void removeNameOfStop(String nameOfStop){

        this.nameOfStop.remove(nameOfStop);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "number=" + number +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", capacity=" + capacity +
                ", numberOfTravelers=" + numberOfTravelers +
                ", numberOfStop=" + numberOfStop +
                ", currentNumberOfStop=" + currentNumberOfStop +
                '}';
    }
}
