package section12_solid.err2;

import section12_solid.err1.Computer;

public class SaveComputerToDB implements SaveInterface {

    @Override
    public void save(String path, Computer computer) {
        System.out.println(computer.getName() + " is saved to DB " + path);
    }
}
