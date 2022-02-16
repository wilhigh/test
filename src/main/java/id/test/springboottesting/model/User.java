package id.test.springboottesting.model;

import id.test.springboottesting.util.annotation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/***
 * Project Name     : spring-boot-testing
 * Username         : Teten Nugraha
 * Date Time        : 12/18/2019
 * Telegram         : @tennugraha
 */

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email should not be empty")
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    @ValidPassword
    private String password;

    @NotEmpty(message = "Username should not be empty")
    @Column(nullable = false, length = 100)
    private String name;

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
