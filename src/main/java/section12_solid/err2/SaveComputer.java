package section12_solid.err2;


import section12_solid.err1.Computer;

public class SaveComputer {



    //open-closed principe "error" wir müssen Class ändern, anstatt neue Class hinzufügen

    public void saveToFile(String path, Computer computer) {
        System.out.println(computer.getName() + " is saved to file" + path);
    }

    public void saveToDB(String path, Computer computer) {
        System.out.println(computer.getName() + " is saved to DB" + path);
    }


}

