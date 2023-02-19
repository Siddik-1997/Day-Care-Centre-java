 
import javax.swing.JOptionPane;


public class User2 {

    private String userName;
    private String password;

    public User2() {
    }

    public User2(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    Login_3 lg = new Login_3();

    public void checkUser(String uName, String pass) {

        if (userName.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Any field is empty");
            
        } 
        
        else if (userName.equals(uName) && password.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Successfully logIn");
            new HomeServant().setVisible(true);
           
            

        }
        else {
            JOptionPane.showMessageDialog(null, "Sorry, Wrong password");
        }
    }
}

  

