 
import javax.swing.JOptionPane;


public class User {

    private String userName;
    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    Login lg = new Login();

    public void checkUser(String uName, String pass) {

        if (userName.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Any field is empty");
            
        } 
        
        else if (userName.equals(uName) && password.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Successfully logIn");
            new choose().setVisible(true);
           
            

        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry, Wrong password");
        }
    }
}

  

