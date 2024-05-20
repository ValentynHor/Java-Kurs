package section12_solid;

import section12_solid.err1.Computer;
import section12_solid.err2.SaveComputerToDB;
import section12_solid.err2.SaveComputerToFIle;
import section12_solid.err2.SaveInterface;
import section12_solid.err5.ModalForm;
import section12_solid.err5.WebFramework;

public class Main {
    public static void main(String[] args) {

       /* var comp = new Computer("Comp", 8);
        SaveInterface saverToFile = new SaveComputerToFIle();
        saverToFile.save("c:", comp);

        SaveInterface saverToDB = new SaveComputerToDB();
        saverToDB.save("POSTGRES", comp);*/

        var mf = new ModalForm(1,30,"valik");
        var webFramework = new WebFramework();
        webFramework.save(mf);

    }
}
