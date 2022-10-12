package repro.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlayerAppList {
    // Main driver method
    public static void main(String[] args) {

        PlayerRecordManagament hr
                = new PlayerRecordManagament();

        Record record = new Record();

        // Initial Employee record
        // Using mutators to had code the data
        record.setIdNumber(6862);
        record.setContactNumber(911);
        record.setName("Bruno");
        record.setEmail("test@gmal.com");
        record.setNationality("Brazilian");
        record.setPosition("CB");

        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        hr.add(record);

        // Creating Scanner Object to read input
        Scanner input = new Scanner(System.in);

        // Creating option integer variable
        int option = 0;

        // Do - While loop
        do {
            menu();
            option = input.nextInt();

            // Switch case
            switch (option) {

                case 1:

                    // Display message
                    System.out.print("What is the Player id Number ? ");

                    int idNumber = input.nextInt();

                    // Display message
                    System.out.print("What is the Player contact Number ? ");

                    int contactNumber = input.nextInt();
                    input.nextLine();

                    // Display message
                    System.out.print("What is the Player Name ? ");

                    String name = input.nextLine();

                    // Display message
                    System.out.print("What is the Player email ? ");

                    String email = input.nextLine();

                    // Display message
                    System.out.print("What is the Player Nationality ? ");

                    String nationality = input.nextLine();

                    // Display message
                    System.out.print("What is the Player Position ? ");

                    String position = input.nextLine();

                    // Create record object and pass constructor
                    // parameters.
                    record = new Record(name, idNumber, contactNumber, email, nationality, position);
                    // Call add() record
                    hr.add(record);
                    System.out.println(record.toString());

                    // Break statement used to terminate program
                    // from here only once it entered this case
                    break;

                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }

        while (option != 1);
    }

        public static void menu()
        {

            // Printing statements displaying menu on console
            System.out.println("MENU");
            System.out.println("1: Add Person");
            System.out.println("2: Delete Person");
            System.out.println("3: Update Person");
            System.out.println("4: Search Person");
            System.out.println("5: Display People");
            System.out.println("9: Exit program");
            System.out.print("Enter your selection : ");
        }
    }

