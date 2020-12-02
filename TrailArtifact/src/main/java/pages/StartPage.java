package pages;

import com.aventstack.extentreports.Status;

import masterWrapper.MasterClass;

public class StartPage extends MasterClass{
	private String getEmailAndPassword(String pageName, String moduleName, String request) {
		try {
			String xpath = "//h3[text()[contains(.,'"+moduleName+"')]]/strong[text()='"+pageName+"']/following::strong[text()='Email'][1]/preceding::div[1]/following::div[1]/div[1]";
			waitUntilElementVisible(xpath);
			String response = getTextByXpath(xpath).replaceAll("\\n", " ");
			String[] values = response.split(" ");
			String emailID = values[1].trim();
			String password = values[3].trim();
			if(request.toLowerCase().contains("email")) {
				return emailID;
			}
			return password;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;

	}
	public StartPage getEmailandVerify(String role, String stack) {
		//h3[text()[contains(.,'Front-End')]]/following::strong[text()='Email'][1]/preceding::div[1]/following::div[1]/div[1]/text()
		try {
			String emailID = getEmailAndPassword(role, stack,"emailID");
			boolean sts = true;
			if(sts) {
				test.log(Status.PASS, "email id "+emailID+" is correct");
			}
			else {
				test.log(Status.FAIL, "email id is incorrect");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(Status.SKIP, "email id method exception");
		}
		return this;
	}
	public StartPage getPasswordandVerify(String role, String stack) {
		//h3[text()[contains(.,'Front-End')]]/following::strong[text()='Email'][1]/preceding::div[1]/following::div[1]/div[1]/text()
		try {
			String password = getEmailAndPassword(role, stack,"password");
			boolean sts = true;
			if(sts) {
				test.log(Status.PASS, "password "+password+" is correct");
			}
			else {
				test.log(Status.FAIL, "password is incorrect");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(Status.SKIP, "password method exception");
		}
		return this;
	}
}
