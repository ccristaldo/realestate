package com.realestate;

import com.realestate.entity.branch.BranchEntity;
import com.realestate.model.MenuAptView;
import com.realestate.model.MenuBranchView;
import com.realestate.model.MenuCustomerView;
import com.realestate.model.MenuEmployeeView;
import com.realestate.utils.Branches;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        MenuEmployeeView employeeView = new MenuEmployeeView();
        MenuAptView menuAptView = new MenuAptView();
        MenuCustomerView menuCustomerView = new MenuCustomerView();
        MenuBranchView menuBranchView = new MenuBranchView();

        Branches branches = new Branches();
        branches.addBranch();

        while (!salir) {

            System.out.println("1. Employees");
            System.out.println("2. Apartments");
            System.out.println("3. Customers");
            System.out.println("4. Branches");
            System.out.println("5. Terminate Program");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Employees Management: ");
                        employeeView.employeeMenu();
                        break;
                    case 2:
                        System.out.println("Apartments Management");
                        menuAptView.aptMenu();
                        break;
                    case 3:
                        System.out.println("Customers Management");
                        menuCustomerView.costumerMenu();
                        break;
                    case 4:
                        System.out.println("Branches Management");
                        menuBranchView.branchMenu();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong value. Only numbers.");
                sn.next();
            }
        }

    }
}
