package section8_stream.module2.acount;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email")
public class Account {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthday;
    private Sex sex;
    private LocalDate creationDate;
    private BigDecimal balance = BigDecimal.ZERO;
}

