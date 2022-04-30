package OOP_Encapsulation;

public class AmazonTest {
    
    public static void main(String[] args) {
        LoginPage lp = new LoginPage();
        lp.setUserName("admin");
        lp.setPassword("admin123");
        lp.login(lp.getUserName(), lp.getPassword());
        lp.setPassword("admin456");
        lp.login(lp.getUserName(), lp.getPassword());
        
        LoginPage lp1 = new LoginPage();
        lp.login(lp1.getUserName(), lp1.getPassword());
    }

}
