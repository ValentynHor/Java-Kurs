package section12_solid.err3;

import section12_solid.err1.Computer;

public class OmenHP extends Computer {

    public OmenHP(String name, int memory) {
        super(name, memory);
    }

    //liskov substitution principle "error"
    //child muss gleiche Funktionalität haben als eltern
    public void setData(String name) {
        this.name = name;
        this.memory = 5000;
    }
}
