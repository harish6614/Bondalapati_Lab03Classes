
package stores;

import java.util.Scanner;

/**
 *
 * @author Harish Bondalapati
 */
public class StoreDriver {

    /**
     * Main class to test and invoke various methods on the Store
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Testing the Store Class
        System.out.println("**********************Testing the Store Class"
                + "**********************\n");
        
        //2. Declaring & creating a store Object with below param
        Store store1=new Store("Timmy Tommy Enterprises", 1000,  "3127869900",
                "311 Jarvis Square", "Chicago", "Illinois", 60018 );
        
        //3. Printing message
        System.out.println("*******************************************"
                + "***********\nTesting the Getter methods or Accessors "
                + "of Store Class\n" +"*********************************"
                + "*********************");
        
        //4. Invoking all getter methods
        System.out.println("Store Name: "+store1.getStoreName());
        System.out.println("Store ID: "+store1.getStoreID());
        System.out.println("Street of the Store: "+store1.getStreet());
        System.out.println("City of the Store : "+store1.getCity());
        System.out.println("State of the Store: "+store1.getState());
        System.out.println("Zip code of the Store: "+store1.getZipCode());
        System.out.println("Phone number of the Store: "+
                store1.getPhoneNumber());
        
        //5. Printing message
        System.out.println("\n*****************************************\n"
                + "Testing the toString method"
                + "\n*****************************************");
        
        //6. Invoking toString() on Store
        System.out.println(store1.toString());
        
        //7. Printing message
        System.out.println("\n*****************************************\n" 
                + "Testing the user defined methods\n" 
                + "*****************************************");
        //8. Printing first word of store name for a store variable
        System.out.println("First word of store name: "
                +store1.getFirstWordOfStoreName());
        
        //9. Printing middle word of store name for a store variable
        System.out.println("Middle word of the store name: "
                +store1.getMiddleWordOfStoreName());
        
        //10. Printing last word of store name for a store variable
        System.out.println("Last word of the store name: "
                +store1.getLastWordOfStoreName());
        
        //11. Replacing store name for a store object
        store1.replaceStoreName("Timmy Tommy Enterprises","JC Penny Store");
        
        //12. Printing message
        System.out.println("\nPrinting the store1 object after invoking the "
                + "replace method");
        
        //13. Invoking toString() on Store variable after renaming the store
        System.out.println(store1.toString());
        
        //14. Declaring another store o
        Store store2=new Store();
        
        //15. Printing Message
        System.out.println("\n*********************************************"
                + "************************\n"
                + "Testing the Getter methods or Accessors of Store "
                + "Class with no-arg constructor"
                + "\n******************************************************"
                + "***************");
        
        //16. Invoking all getter methods on new Store object
        System.out.println("Store Name: "
                +store2.getStoreName());
        System.out.println("Store ID: "
                +store2.getStoreID());
        System.out.println("Street of the Store: "
                +store2.getStreet());
        System.out.println("City of the Store: "
                +store2.getCity());
        System.out.println("State of the Store: "
                +store2.getState());
        System.out.println("Zip code of the Store: "
                +store2.getZipCode());
        System.out.println("Phone number of the Store: "
                +store2.getPhoneNumber());
        
        //17. Setting store name for new Store object created
        store2.setStoreName("KC India Mart");
        
        //18. Setting store id for new Store object created
        store2.setStoreID(1001);
        
        //19. Setting phone number for new Store object created
        store2.setPhoneNumber("9136818080");
        
        //20. Setting street for new Store object created
        store2.setStreet("8542 w 133rd Street");
        
        //21. Setting city for new Store object created
        store2.setCity("Overland Park");
        
        //22. Setting state for new Store object created
        store2.setState("Kansas");
        
        //23. Setting street for new Store object created
        store2.setZipCode(66213);
        
        //24. Printing message
        System.out.println("\n*******************************************"
                + "**************************\n"
                + "Testing the store class using toString after invoking "
                + "the Setter methods or Mutators"
                + "\n****************************************************"
                + "*****************");
        
        //25. Invoking toString on new store object
        System.out.println(store2.toString());
        
        //26. Printing Message
        System.out.println("\n***********************************************"
                + "*********\n"
                + "Testing the scanner class to take input from the console\n"
                + "********************************************************");
        
        //27. Declaring and initializing Scanner object
        Scanner scannerObject = new Scanner(System.in);
        
        //28. Accepting input from console
        System.out.println("Enter the store details");
        
        System.out.println("Enter the store name:");
        String storeNameIn = scannerObject.nextLine();
        
        System.out.println("Enter the store ID:");
        int storeIDIn = scannerObject.nextInt();
                    scannerObject.nextLine();
        
        System.out.println("Enter the store phone number:");
        String phoneNumberIn=scannerObject.nextLine();
        
        System.out.println("Enter the street name of the store:");
        String streetIn=scannerObject.nextLine();
        
        System.out.println("Enter the city name, state name, zip code of the "
                + "store in one line without any commas:");
        String cityIn=scannerObject.next();
        String stateIn=scannerObject.next();
        int zipCodeIn=scannerObject.nextInt();
        
        //29. Declare new store and initializing with above values
        Store store3=new Store(storeNameIn,storeIDIn,phoneNumberIn,
                streetIn,cityIn,stateIn,zipCodeIn);
        
        //30. Printing message
        System.out.println("\n**********************************************"
                + "******\n"
                + "Testing the toString method without invoking the method\n"
                + "****************************************************");
        
        //30. Testing toString() without invoking method on store3
        System.out.println(store3);
        
    }
    
}
