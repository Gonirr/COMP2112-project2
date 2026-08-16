import java.util.Scanner;
//I tried importing request like twice it wouldnt let me can you do it if its needed??
//okkk ıll look into it
public class App {
    public static void main(String[] args) {
        unifiedDS ds = new unifiedDS();
        Scanner sc = new Scanner(System.in);
        //static errors are resolved once you create the object inside the main class

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


            /*

            ok currently case 3,4, 6,8,9 missing
            i will be adding the 20 examples
            */

            switch (choice) {
                case 1:
                    
                    System.out.println("Enter the category index from the provided list: ");
                    
                    for(int i = 0; i < ds.catagories.length; i++){
                        System.out.println(i+". "+ds.catagories[i]);
                    }
                    int catIndex = sc.nextInt();

                    System.out.println("Enter the location index from the provided list: ");
                    for(int i = 0; i < ds.locations.length; i++){
                        System.out.println(i+". "+ds.locations[i]);
                    }
                    int locIndex = sc.nextInt();

                    System.out.println("Enter the status index from the provided list: ");
                    for(int i = 0; i < ds.stats.length; i++){
                        System.out.println(i+". "+ds.stats[i]);
                    }
                    int statIndex = sc.nextInt();

                    System.out.println("Enter the year of the request: ");
                    String year = sc.next();
                    System.out.println("Enter the month of the request: ");
                    String month = sc.next();
                    System.out.println("Enter the day of the request: ");
                    String day = sc.next();

                    System.out.println("Enter the urgency level (1-5): ");
                    int urgency = sc.nextInt();

                    ds.insertRequest(catIndex, locIndex, statIndex, year, month, day, urgency);
                    break;
                case 2:
                    System.out.println("Enter the request ID to search for: ");
                    String requestID = sc.next();
                    ds.searchByRequestID(requestID);//this gives an error cause static - no longer
                    break;
                case 3:
                    ds.listRequestsByPriority();
                    break;
                case 4:
                    ds.showMostUrgentRequest();
                    break;
                case 5:
                    System.out.println("Enter the request ID to update: ");
                    String requestIDToUpdate = sc.next();
                    System.out.println("Enter the new status index from the provided list: ");
                    for(int i = 0; i < ds.stats.length; i++){
                        System.out.println(i+". "+ds.stats[i]);
                    }
                    int newStatusIndex = sc.nextInt();
                    ds.updateStatus(newStatusIndex, requestIDToUpdate);
                    //updateStatus(int ix,String requestID) + using stats array
                    break;
                case 6:
                    ds.updateRequestUrgency();
                    break;
                case 7:
                    System.out.println("Enter the request ID to delete: ");
                    String requestIDtoDelete = sc.next();
                    ds.deleteRequest(requestIDtoDelete);
                    break;
                case 8:
                    ds.showRequestsByLocation();
                    break;
                case 9:
                    ds.showStatistics();
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
