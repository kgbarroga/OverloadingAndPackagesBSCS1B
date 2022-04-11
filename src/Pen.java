public class Pen {
    /**
     * Instance Variables
     */
    private String name;
    private int id;

    /**
     * Constructor
     */
    Pen(String inputName){
        this.name = inputName;
        System.out.println("The new name of the pen is " + this.name);

    }

    /**
     * Overload Constructor
     */
    Pen(int inputId){
        this.id = inputId;
        System.out.println("The new ID of the Pen is " + this.id);
    }
    
}
