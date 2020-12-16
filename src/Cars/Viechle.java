package Cars;

public class Viechle {
    //define variables that are available to all parts of the class hence the (m_variable)
    private boolean m_wipers;
    private final String m_model;
    private int m_age;
    protected final String m_name;
    // different modes are 'D' for drive, 'R' for reverse, 'N' for neutral, and 'P' for park
    private char m_mode;
    // Constructor
    public Viechle(String NewModel, int age, String name) {
        //constructing the object by storing variables in the object (this.varName)
        this.m_model = NewModel;
        this.m_age = age;
        this.m_wipers = false;
        //default mode
        this.m_mode = 'D';
        this.m_name = name;
    }
    /**
     This next section is going to be examples of things that you can do with this, make sure to have fun with it

     Notice how methods are in camel case nameName
     */

    //This hunk of code changes the mode the car is in
    private String putInPark() {
        this.m_mode = 'P';
        return this.m_name + " is now in park";
    }

    private String putInReverse() {
        this.m_mode = 'R';
        return this.m_name + " is now in reverse";
    }

    private String putInDrive() {
        this.m_mode = 'D';
        return this.m_name + " is now in drive";
    }

    private String coast() {
        this.m_mode = 'N';
        return this.m_name + "is now coasting and in neutral";
    }

    // this is known as a toggle method which toggles the boolean value
    private boolean toggleWindshieldWipers() {
        if (this.m_wipers) {
            this.m_wipers = false;
            return false;
        }
        else if (!this.m_wipers) {
            this.m_wipers = true;
            return true;
        }
        return false;
    }
    // We use setters and getters to encapsulate our data whenever we want to use it outside of the class the data belongs to
    private int getAge() {
        return this.m_age;
    }
    private String getModel() {
        return this.m_model;
    }
    private void AddAge() {
        this.m_age++;
    }
    private char getMode() {
        return this.m_mode;
    }
    private String getName() {return this.m_name;}
}