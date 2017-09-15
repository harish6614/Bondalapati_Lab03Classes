/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 *
 * @author Harish Bondalapati
 */
public class StoreDriver {

    /**
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
        
        //5. Printing message
        System.out.println("*****************************************\n" 
                + "Testing the user defined methods\n" 
                + "*****************************************");
        
    }
    
}
