 
import javax.swing.JOptionPane;


public class User1 {

    private String userName;
    private String password;

    public User1() {
    }

    public User1(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    Login_1 lg = new Login_1();

    public void checkUser(String uName, String pass) {

        if (userName.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Any field is empty");
            
        } 
        
        else if (userName.equals(uName) && password.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Successfully logIn");
            new HomeChild().setVisible(true);
           
            

        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry, Wrong password");
        }
    }
}

  

