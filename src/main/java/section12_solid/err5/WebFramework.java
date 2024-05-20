package section12_solid.err5;

public class WebFramework {

    //abhängig from ModalForm
    //dependency inversion "error"

    public void save(IForm form){
        IDb db = new MySQL();
        db.save(form);
    }
}
