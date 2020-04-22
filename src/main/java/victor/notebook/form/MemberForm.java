package victor.notebook.form;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MemberForm {
	private Integer id;
	private String action ;
	private String username;
	private String password;
	private String passwordConfirm;
	private String email;
}
