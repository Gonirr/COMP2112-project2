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
            //date must be entered as 04 not 4
            int choice = sc.nextInt();
            giveRandomExample();
            System.out.println("Welcome to the Request Management System.");
            System.out.println("1. Add a new service request");//+
            System.out.println("2. Find a service request by ID");//+
            System.out.println("3. List all requests by priority order");//- doesnt work perfectly but yeah
            System.out.println("4. See the most urgent active request");//+
            System.out.println("5. Update request status");//+
            System.out.println("6. Update request urgency");//+
            System.out.println("7. Delete a request");//+
            System.out.println("8. Show requests by location");//+
            System.out.println("9. Show data structure statistics");//+
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
                    ds.printOpenCases();
                    break;
                case 4:
                    ds.findMostRelavent();
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
                    System.out.println("Enter the request ID to update urgency: ");
                    String requestIDToUpdateUrgency = sc.next();
                    System.out.println("Enter the new urgency level (1-5): ");
                    int newUrgency = sc.nextInt();
                    ds.updateUrgency(requestIDToUpdateUrgency, newUrgency);
                    //updateUrgency(String requestID,int newUrgency)
                    break;
                case 7:
                    System.out.println("Enter the request ID to delete: ");
                    String requestIDtoDelete = sc.next();
                    ds.deleteRequest(requestIDtoDelete);
                    break;
                case 8:
                    System.out.println("Enter the location index from the provided list: ");
                    for(int i = 0; i < ds.locations.length; i++){
                        System.out.println(i+". "+ds.locations[i]);
                    }
                    int ix = sc.nextInt();
                    ds.listByLoc(ix);
                    break;
                case 9:
                    System.out.println(ds.DSstats());;
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
//the 20 samples
    
    private static void giveRandomExample(){

        /*
        category, location, status, year, month, day, urgency - i keep forgetting the order vro
        */
            unifiedDS dsEX = new unifiedDS();
            dsEX.insertRequest(0, 0, 0, "2025", "01", "14", 3);
            dsEX.insertRequest(1, 2, 1, "2025", "11", "26", 1);
            dsEX.insertRequest(4, 3, 3, "2026", "03", "11", 5);
            dsEX.insertRequest(0, 0, 2, "2026", "06", "19", 3);
            dsEX.insertRequest(5, 1, 1, "2025", "02", "20", 4);
            dsEX.insertRequest(2, 2, 2, "2024", "10", "13", 5);
            dsEX.insertRequest(4, 0, 3, "2024", "03", "15", 1);
            dsEX.insertRequest(1, 1, 1, "2026", "02", "02", 2);
            dsEX.insertRequest(2, 2, 2, "2025", "03", "10", 5);
            dsEX.insertRequest(3, 0, 0, "2024", "01", "15", 4);
            dsEX.insertRequest(1, 1, 1, "2024", "02", "20", 2);
            dsEX.insertRequest(4, 2, 2, "2025", "12", "10", 1);
            dsEX.insertRequest(3, 1, 3, "2024", "04", "28", 3);
            dsEX.insertRequest(1, 3, 1, "2026", "02", "20", 2);
            dsEX.insertRequest(2, 1, 3, "2025", "03", "10", 1);
            dsEX.insertRequest(5, 0, 0, "2025", "01", "15", 4);
            dsEX.insertRequest(1, 1, 1, "2026", "02", "06", 2);
            dsEX.insertRequest(2, 2, 2, "2026", "11", "23", 1);
            dsEX.insertRequest(5, 3, 0, "2026", "01", "15", 3);
            dsEX.insertRequest(4, 2, 3, "2026", "09", "09", 1);
            

        }


    

}
