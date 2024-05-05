package section8_stream.module2.acount;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email")
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthday;
    private Sex sex;
}
