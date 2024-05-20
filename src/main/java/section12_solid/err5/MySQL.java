package section12_solid.err5;

public class MySQL implements IDb {
    /* //abhängig from ModalForm
     //dependency inversion "error"
     public void save(ModalForm form) {
         System.out.println("saved");
     }*/
    public void save(IForm form) {
        System.out.println("saved in mysql");
    }

}
