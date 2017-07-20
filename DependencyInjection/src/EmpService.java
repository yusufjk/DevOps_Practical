
public class EmpService {
EmailService emailService;

public void setEmailService(EmailService emailService) {
	this.emailService = emailService;

}

public void createEmp()
{

	System.out.println("Employee created");
	emailService.sendEmail();
}

}
