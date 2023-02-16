import java.io.*;
import java.util.Scanner;

class ResidentialSociety {
    String societyName;
    String location;
    String SecretorName;
}

class Building extends ResidentialSociety {
    String buildingName;
    int totalNumberOfApartments;
}


class Apartment extends Building {
    String apartmentNumber;
    String ownerName;
    String electricMeterNumber;

    Apartment(String Houseid, String Bulding, String OwnerName, String Electricity) {
        this.apartmentNumber = Houseid;
        this.ownerName = OwnerName;
        this.electricMeterNumber = Electricity;
        super.buildingName = Bulding;
    }
}




public class hvapartmenttask {
    static String[] Menu = { "View Apartment Details", "view Building Details", "View Society Details" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResidentialSociety Resident = new ResidentialSociety();
        Resident.societyName = "Amarnadh towers";
        Resident.location = "Kamepalli";
        Resident.SecretorName = "Apartments";
        Building bui[] = new Building[3];
        Apartment house1[] = new Apartment[10];
        Apartment house2[] = new Apartment[10];
        Apartment house3[] = new Apartment[10];

        try {
            String line = "";
            int c = 0;
            int i = 0;
            BufferedReader br = new BufferedReader(new FileReader("demoDataBase1.csv"));
            while ((line = br.readLine()) != null) {
                String[] House = line.split(",");
                if (c % 10 == 0)
                    i = 0;
                if (c < 10) {
                    house1[i] = new Apartment(House[0], House[1], House[2], House[3]);
                } 
                else if (c < 20) {
                    house2[i] = new Apartment(House[0], House[1], House[2], House[3]);
                } 
                else if (c < 30) {
                    house3[i] = new Apartment(House[0], House[1], House[2], House[3]);
                }
                c++;
                i++;
            }
            while (true) {
                for (int j = 0; j < 3; j++) {
                    System.out.println((j + 1) + ". " + Menu[j]);
                }
                System.out.println("Enter option");
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.println();
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Apartment Id : " + house1[j].apartmentNumber + " , Buinding Name :"+ house1[j].buildingName + " , Owner Name : " + house1[j].ownerName+ " , Electric Meter Number : " + house1[j].electricMeterNumber);
                    }
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Apartment Id : " + house2[j].apartmentNumber + " , Buinding Name :"+ house2[j].buildingName + " , Owner Name : " + house2[j].ownerName+ " , Electric Meter Number : " + house2[j].electricMeterNumber);
                    }
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Apartment Id : " + house3[j].apartmentNumber + " , Buinding Name :"+ house3[j].buildingName + " , Owner Name : " + house3[j].ownerName+ " , Electric Meter Number : " + house3[j].electricMeterNumber);
                    }
                }
                
                 else if (option == 2) {
                    System.out.println();
                    System.out.println("Building name : A  , Total number Of Apartments : 10");
                    System.out.println("Building name : B  , Total number Of Apartments : 10");
                    System.out.println("Building name : C  , Total number Of Apartments : 10");
                } 


                else if (option == 3) {
                    System.out.println();
                    System.out.println("Society Name : " + Resident.societyName + ",  Location : " + Resident.location);
                }
                 else {
                    System.out.println("You Entered Wrong Option");
                }
                System.out.println("Press Any option to Continue or Press n to stop");
                char ch = sc.next().charAt(0);
                if (ch == 'n')
                    break;
            }


        } catch (Exception e) {
            System.out.println("Try Block is not Executed");
        }
    }
}
