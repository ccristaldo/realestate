package com.realestate.service.implemented;

import com.realestate.entity.apt.AptEntity;
import com.realestate.service.IAptService;
import com.realestate.utils.Operation;
import com.realestate.utils.Stock;
import com.realestate.utils.Zone;

import java.util.Scanner;

public class AptServiceImplemented implements IAptService {

    AptEntity apt;
    
    Scanner sn = new Scanner(System.in);
    String address, zone, operation;
    int idZone, idOperation, dimension, rooms;
    double cost;

    @Override
    public void createApt() {

        String finish;
        boolean exit = false;

        while (!exit) {

            Stock.stock.add(loadApt());

            // clear buffer
            sn.nextLine();

            System.out.println("Finish? (y/n)");
            finish = sn.nextLine().toLowerCase();
            if (finish.equals("y"))
                exit = true;
        }
    }

    @Override
    public void readApt() {
        if (!Stock.stock.isEmpty()){
            for (AptEntity a : Stock.stock){
                if (a.isActive()) {
                    System.out.println(a);
                }
            }
        }else{
            System.out.println("There's no apartments yet \n");
        }
    }

    @Override
    public void updateApt(int id) {

        Stock.stock.set(id, loadApt());
        System.out.println("Apartment Updated \n");
    }

    @Override
    public void deleteApt(int id) {

        Stock.stock.get(id).setActive(false);
        System.out.println("Apartment Deleted \n");
    }

    public AptEntity loadApt(){

        System.out.println("Enter Apartment's address:");
        address = sn.nextLine();

        System.out.println("Select Apartment's zone: \n" +
                " 1 - Center \n 2 - Downtown \n 3 - Uptown \n" +
                " 4 - East Side \n 5 - West Side \n 6 - North Side \n 7 - South Side");
        idZone = sn.nextInt();
        while (idZone < 1 || idZone > 7){
            System.out.println("Only numbers. 1-7");
            System.out.println("Select Apartment's zone: \n" +
                    " 1 - Center \n 2 - Downtown \n 3 - Uptown \n" +
                    " 4 - East Side \n 5 - West Side \n 6 - North Side \n 7 - South Side");
            idZone = sn.nextInt();
        }

        switch (idZone){
            case 1 :
                zone = Zone.CENTER;
                break;
            case 2:
                zone = Zone.DOWNTOWN;
                break;
            case 3:
                zone = Zone.UPTOWN;
                break;
            case 4:
                zone = Zone.EASTSIDE;
                break;
            case 5:
                zone = Zone.WESTSIDE;
                break;
            case 6:
                zone = Zone.NORTHSIDE;
                break;
            case 7:
                zone = Zone.SOUTHSIDE;
                break;
            default:
                System.out.println("Only numbers. 1-7");
        }

        System.out.println("Select operation avalaible: \n" +
                " 1 - To Sell \n 2 - To Rent \n");
        idOperation = sn.nextInt();
        while (idOperation < 1 || idOperation > 2){
            System.out.println("Select operation avalaible: \n" +
                    " 1 - To Sell \n 2 - To Rent \n");
            idOperation = sn.nextInt();
            }

        switch (idOperation){
            case 1:
                operation = Operation.SELL;
                break;
            case 2:
                operation=Operation.RENT;
                break;
            default:
                System.out.println("Only numbers. 1-2");
        }

        System.out.println("Enter Apartment's cost:");
        cost = sn.nextDouble();

        System.out.println("Enter Apartment's dimension:");
        dimension = sn.nextInt();

        System.out.println("How many rooms does the Apartment have?:");
        rooms = sn.nextInt();

        apt = new AptEntity();

        apt.setAddress(address);
        apt.setZone(zone);
        apt.setOperation(operation);
        apt.setCost(cost);
        apt.setDimension(dimension);
        apt.setRooms(rooms);
        apt.setAptId(Stock.stock.size());

        return apt;
    }
}
