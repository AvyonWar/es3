public class House {
    /**
     * l'es richiede 3  variabili di istanza, ma nei punti successivi sono state fornite istruzioni solamente per 2
     * variabili di istanza.
     * Ho preferito seguire i punti e ignorare la variabile di istanza di troppo.
     * nell' esercizio sono, dunque, presenti solo due istanze di House
     */
    public String address;
    public  int numberOfFloors;
    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("New house!");
        System.out.println("This house in" + " " + address + " " + "is located on the" + " " + numberOfFloors + " floor.");
    }
}
