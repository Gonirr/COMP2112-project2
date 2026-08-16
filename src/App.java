import java.util.Scanner;
//I tried importing request like twice it wouldnt let me can you do it if its needed??
//okkk ıll look into it
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
                    //in unified ds there is a method called insertRequest(int cat,int loc,int stat,String year,String month,String day,int urgency) use that
                    //+ you will see there are string arrays in unifiedDS ask the user to select catogory, status, loc  etc. using those
                    //print those arrays and ask for the needed index

                    System.out.println("Enter the category index from the provided list: ");
                    
                    for(int i = 0; i < unifiedDS.catagories.length; i++){
                        System.out.println(i+". "+unifiedDS.catagories[i]);
                    }
                    int catIndex = sc.nextInt();

                    System.out.println("Enter the location index from the provided list: ");
                    for(int i = 0; i < unifiedDS.locations.length; i++){
                        System.out.println(i+". "+unifiedDS.locations[i]);
                    }
                    int locIndex = sc.nextInt();

                    System.out.println("Enter the status index from the provided list: ");
                    for(int i = 0; i < unifiedDS.statuses.length; i++){
                        System.out.println(i+". "+unifiedDS.statuses[i]);
                    }
                    int statIndex = sc.nextInt();

                    System.out.println("Enter the year: ");
                    String year = sc.next();
                    System.out.println("Enter the month: ");
                    String month = sc.next();
                    System.out.println("Enter the day: ");
                    String day = sc.next();

                    System.out.println("Enter the urgency level (1-5): ");
                    int urgency = sc.nextInt();

                    unifiedDS.addRequest(catIndex, locIndex, statIndex, year, month, day, urgency);
                    break;
                case 2:
                    System.out.println("Enter the request ID to search for: ");
                    String requestID = sc.next();
                    unifiedDS.searchByRequestID(requestID);//this gives an error cause static
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
