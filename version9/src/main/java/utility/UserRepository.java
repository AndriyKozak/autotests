package utility;

/**
 * Created by Julia on 18.04.2017.
 */
public class UserRepository {

    private String login;
    private String password;

    // Model of User
    public UserRepository(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Supervisor
    public static UserRepository getIxlooSupervisor() {
        return new UserRepository(PropertyLoader.loadProperty(PropertySource.CRED, "super.login"), PropertyLoader.loadProperty(PropertySource.CRED, "super.pw"));
    }
}
