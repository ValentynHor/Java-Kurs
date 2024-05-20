package section12_solid.err5;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ModalForm implements IForm {
    private int id;
    private int old;
    private String name;

}
