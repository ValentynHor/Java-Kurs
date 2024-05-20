package section12_solid.err1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {

    protected String name;
    protected int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public void setData(String name) {
        this.name = name;
        this.memory = 8000;
    }

    /*

    //single responsibility principle "error"

    public void save(){}

    public void load(){}

     */


}
