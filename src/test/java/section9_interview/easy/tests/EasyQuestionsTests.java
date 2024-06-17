package section9_interview.easy.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasyQuestionsTests {

    @Test
    public void primitivesByValue_Demo() {
        int first = 1;
        int second = 2;
        Assertions.assertSame(first,second);
        Assertions.assertEquals(first, second);
    }
}
