package Cars;

public class Mustang extends Viechle{
    // constructor
    public Mustang(int NewAge, int StartRange, String name) {
        super("Mustang", NewAge,name);
    }
    // action that I want to add to this model
    public String Door() {return this.m_name + "'s door opens";}
}
