import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) { 
   Scanner sc  = new Scanner(System.in);
   int Vehicle = sc.nextInt();
   System.out.println("Number of Vehicles: " + Vehicle);

   float Wastecollected = sc.nextFloat();
    System.out.println("Waste Collected: " + Wastecollected);

    int collectionpoints = sc.nextInt();    
    System.out.println("Collection Points: " + collectionpoints);

    char VehicleStatus = sc.next().charAt(0);
    System.out.println("Vehicle Status: " + VehicleStatus);

    sc.close();
    }
}