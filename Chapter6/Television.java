package Chapter6;

// The purpose of this class is to model a television
// Anh Huynh 10/4/2024

public class Television {
    public static void main(String[] args) {
        /* Television LGTV = new Television("LG", 84);
        System.out.println(LGTV.volume);
        LGTV.decreaseVolume();
        System.out.println(LGTV.volume);
        System.out.println(LGTV.getScreenSize()); 
        
        Program Tests */ 
    }
    
    String MANUFACTURER; // brand of TV
    int SCREEN_SIZE;    // screen size of TV
    boolean powerOn = true;    // power on or off
    int channel;            // channel number
    int volume;             // volume 

    // sets the parameters to the assigned variables of Television object for when creating a new instance 
    Television(String brand, int screen){
        MANUFACTURER = brand;
        SCREEN_SIZE = screen;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    
    /**
     * The `power` function toggles the `powerOn` variable between true and false. Does the opposite of what is already set as the powerOn value.
     */
    public void power(){
        if(powerOn == true || powerOn == false){
            powerOn = !powerOn;
        }
    }

    /**
     * The function `increaseVolume` increments the volume by 1.
     */
    public void increaseVolume(){
        volume++;
    }
    
    /**
     * The function decreases the volume by one.
     */
    public void decreaseVolume(){
        volume --;
    }

    /**
     * The function `getChannel` returns the current channel.
     * 
     * @return The method `getChannel` is returning the value of the `channel` variable.
     */
    public int getChannel(){
        return channel;
    }

    /**
     * The `getVolume` function returns the volume value.
     * 
     * @return The method `getVolume` is returning the value of the `volume` variable.
     */
    public int getVolume(){
        return volume;
    }

    /**
     * The function getManufacturer() returns the manufacturer of the product.
     * 
     * @return The method `getManufacturer` returns the value of the constant `MANUFACTURER`.
     */
    public String getManufacturer(){
        return MANUFACTURER;
    }

    /**
     * The function `getScreenSize` returns the screen size value.
     * 
     * @return The method `getScreenSize()` is returning the value of the constant `SCREEN_SIZE`.
     */
    public int getScreenSize(){
        return SCREEN_SIZE;
    }

    /**
     * The `setChannel` function sets the channel to a specified station.
     * 
     * @param station The `station` parameter in the `setChannel` method is an integer value
     * representing the channel or station number that you want to set for the device.
     */
    public void setChannel (int station){
        channel = station;
    }

}

