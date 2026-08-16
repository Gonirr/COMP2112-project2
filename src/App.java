import java.util.Scanner;
//I tried importing request like twice it wouldnt let me can you do it if its needed??
public class App {

    private unifiedDS ds = new unifiedDS();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean waow = true;

        while (waow){
            int choice = sc.nextInt();
            System.out.println("Welcome to the Request Management System.");
            System.out.println("1. Add a new service request");
            System.out.println("2. Find a service request by ID");
            System.out.println("3. List all requests by priority order");
            System.out.println("4. See the most urgent active request");
            System.out.println("5. Update request status");
            System.out.println("6. Update request urgency");
            System.out.println("7. Delete a request");
            System.out.println("8. Show requests by location");
            System.out.println("9. Show data structure statistics");
            System.out.println("0. Exit\n");

            switch (choice) {//these are placeholder methods so I don't forget the names I'll brb
                case 1:
                    unifiedDS.addRequest();
                    break;
                case 2:
                    unifiedDS.findRequest();
                    break;
                case 3:
                    unifiedDS.listRequestsByPriority();
                    break;
                case 4:
                    unifiedDS.showMostUrgentRequest();
                    break;
                case 5:
                    unifiedDS.updateRequestStatus();
                    break;
                case 6:
                    unifiedDS.updateRequestUrgency();
                    break;
                case 7:
                    unifiedDS.deleteRequest();
                    break;
                case 8:
                    unifiedDS.showRequestsByLocation();
                    break;
                case 9:
                    unifiedDS.showStatistics();
                    break;
                case 0:
                    waow = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }


}
