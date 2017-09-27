
package stores;

/**
 * The class contains Store attributes which can be used to define a Store.
 * 
 * @author Harish Bondalapati
 *
 */
public class Store {
    
    private String storeName;
    private int storeID;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    
    /**
     * Initializes a newly created Store object without setting values
     * for the attributes.
     */
    public Store(){
    }
    
    /**
     * Initializes a newly created Store objects by assigning the values
     * passed as arguments.
     * 
     * @param storeName
     *          Name of the store
     * 
     * @param storeID
     *          Unique ID assigned of the store
     * 
     * @param phoneNumber
     *          Phone Number of the store
     * 
     * @param street
     *          Street the store is situated in
     * 
     * @param city
     *          city the store is situated in
     * 
     * @param state
     *          State the store is situated in
     * 
     * @param zipCode
     *          ZipCode of the location store is situated
     * 
     */
    public Store(String storeName, int storeID, String phoneNumber, 
            String street, String city, String state, int zipCode){
        this.storeName=storeName;
        this.storeID=storeID;
        this.phoneNumber=phoneNumber;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }

    /**
     * Returns the Store name
     * 
     * @return Store Name
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the store name
     * 
     * @param storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Returns the Store ID
     * 
     * @return Store ID
     */
    public int getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the store id with the argument passed
     * 
     * @param storeID
     *          Store ID of a store
     */
    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    /**
     * Returns Phone Number of the Store
     * 
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of phone number with the argument passed
     * 
     * @param phoneNumber
     *          Phone number of a store
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the street name of the Store
     * 
     * @return store name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street name of the Store
     * 
     * @param street
     *          Street the Store is situated in
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns the city the store is situated
     * 
     * @return city
     *          City the Store is situated in
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of a store with argument passed
     * 
     * @param city
     *          City the Store is situated in
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the State in which store is situated
     * 
     * @return state
     *          State the Store is situated in
     */
    public String getState() {
        return state;
    }

    /**
     * Sets State of a Store with the argument passed
     * 
     * @param state
     *          State the store is situated in
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns ZipCode of a Store
     * 
     * @return zipCode
     *          ZipCode of the store
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Sets ZipCode of the store location with the argument passed
     * 
     * @param zipCode
     *          Zip Code of store
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    /**
     * Returns the formatted Address of a store to required format i.e
     * Street
     * City, State-ZipCode
     * 
     * @return address
     *          formatted address as string
     */
    public String getFormattedAddress(){
        Integer tempZip=(Integer)zipCode;
        return (street.concat("\n").concat(city).concat(", ").concat(state)
                .concat("-").concat(tempZip.toString()));
    }
    
    /**
     * Returns the formatted Phone number to a required format
     *      i.e (ddd)ddd-dddd
     * @return phone number
     *          formatted phoneNumber
     */
    public String getFormattedPhoneNumber(){
        return "(".concat(phoneNumber.substring(0, 3)).concat(")")
                .concat(phoneNumber.substring(3, 6).concat("-")
                        .concat(phoneNumber.substring(6)));
    }
    
    /**
     * Replaces  store name with a new value
     * 
     * @param oldName
     *          old name of the store to be identified
     * @param newName
     *          new name of the string to be replaced
     */
    public void replaceStoreName(String oldName, String newName){
//        if(storeName.equals(oldName))
        storeName=storeName.replaceAll(oldName, newName);
    }
    
    /**
     * Returns the first word of the store name
     * 
     * @return the first word of store name
     */
    public String getFirstWordOfStoreName(){
        return storeName.substring(0, storeName.indexOf(' '));
    }
    
    /**
     * Returns the middle word of the store name
     * 
     * @return the middle word of store name
     */
    public String getMiddleWordOfStoreName(){
        return (storeName.substring(storeName.indexOf(" ")+1, 
                storeName.lastIndexOf(" ")));
    }
    
    /**
     * Returns the last word of the store name
     * 
     * @return the last word of store name
     */
    public String getLastWordOfStoreName(){
        return storeName.substring(storeName.lastIndexOf(" ")+1);
    }

    @Override
    public String toString(){
        return storeName.concat(" (")
                .concat(((Integer)storeID).toString()).concat(")\n")
                .concat(this.getFormattedAddress()).concat("\n")
                .concat(this.getFormattedPhoneNumber());
    }
}
